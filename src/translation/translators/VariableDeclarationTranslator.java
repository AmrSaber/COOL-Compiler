package translation.translators;

import gen.CoolParser;
import helpers.scope.Reference;
import helpers.scope.ScopeHandler;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.TranslationHandler;
import translation.Translator;

public class VariableDeclarationTranslator extends Translator {

    public VariableDeclarationTranslator(ParseTree parseTree) {
        super(parseTree);
        if (!(parseTree instanceof CoolParser.VariableDeclarationContext)) {
            throw new RuntimeException("given node is not variable declaration node");
        }
    }

    @Override
    public Temp generate() {
        String idName = parseTree.getChild(0).getText();
        String type = parseTree.getChild(2).getText();

        ScopeHandler.addReference(new Reference(idName, type));

        // get the full name of the variable, prefixed with scope
        Reference reference = ScopeHandler.getReference(idName);

        // check if the production has assignment
        if (parseTree.getChildCount() > 4) {
            ParseTree exprNode = parseTree.getChild(4);
            Translator exprTranslator = new ExprTranslator(exprNode);

            Temp exprTemp = exprTranslator.generate();

            TranslationHandler.write(
                    String.format(
                            "_Alloc %s, %s\t; Allocate variable",
                            type,
                            reference.name
                    )
            );

            // assign expression's value into variable
            TranslationHandler.write(
                    String.format(
                            "%s := %s\t; assign expression's value into %s",
                            reference.toString(),
                            exprTemp,
                            reference.toString()
                    )
            );

            // release unneeded memory
            exprTemp.release();
        }

        return null;
    }
}
