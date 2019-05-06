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
        super(parseTree, CoolParser.VariableDeclarationContext.class);
    }

    @Override
    public Temp generate() {
        String idName = parseTree.getChild(0).getText();
        String type = parseTree.getChild(2).getText();

        Reference reference = new Reference(idName, type);
        ScopeHandler.addReference(reference);

        Temp exprTemp = null;

        // check if the production has assignment, generate its expression
        if (parseTree.getChildCount() > 4) {
            ParseTree exprNode = parseTree.getChild(4);
            exprTemp = new ExprTranslator(exprNode).generate();
        }

        TranslationHandler.write(
                String.format(
                        "_Alloc %s, %s",
                        type,
                        reference.name
                )
        );

        if (exprTemp != null) {
            // assign expression's value into variable
            TranslationHandler.write(
                    String.format(
                            "%s := %s",
                            reference,
                            exprTemp
                    )
            );

            exprTemp.release();
        }

        return null;
    }
}
