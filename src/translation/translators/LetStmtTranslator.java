package translation.translators;

import gen.CoolParser;
import helpers.scope.ScopeHandler;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.TranslationHandler;
import translation.Translator;

// LET variableDeclaration (COMMA variableDeclaration)* IN expr
public class LetStmtTranslator extends Translator {
    public LetStmtTranslator(ParseTree parseTree) {
        super(parseTree, CoolParser.LetStmtContext.class);
    }

    @Override
    public Temp generate() {
        ScopeHandler.pushScope();
        Temp exprTemp = null;

        for (int i = 0; i < parseTree.getChildCount(); ++i) {
            ParseTree child = parseTree.getChild(i);
            if (parseTree.getChild(i) instanceof CoolParser.VariableDeclarationContext) {
                new VariableDeclarationTranslator(child).generate();
            }

            // this will be in the end of the production
            if (parseTree.getChild(i) instanceof CoolParser.ExprContext) {
                if (exprTemp != null) exprTemp.release();
                exprTemp = new ExprTranslator(child).generate();
            }
        }

        ScopeHandler.popScope();
        return exprTemp;
    }
}
