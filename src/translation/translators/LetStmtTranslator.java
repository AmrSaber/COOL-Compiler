package translation.translators;

import gen.CoolParser;
import helpers.scope.ScopeHandler;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.Translator;

// LET variableDeclaration (COMMA variableDeclaration)* IN expr
public class LetStmtTranslator extends Translator {
    public LetStmtTranslator(ParseTree parseTree) {
        super(parseTree);
        if (!(parseTree instanceof CoolParser.LetStmtContext))
            throw new RuntimeException("Node is not LetStmt node");
    }

    @Override
    public Temp generate() {
        ScopeHandler.pushScope();

        for (int i = 0; i < parseTree.getChildCount(); ++i) {
            if (parseTree.getChild(i) instanceof CoolParser.VariableDeclarationContext) {
                new VariableDeclarationTranslator(parseTree).generate();
            }

            // this will be in the end of the production
            if (parseTree.getChild(i) instanceof CoolParser.ExprContext) {
                Temp exprTemp = new ExprTranslator(parseTree).generate();
                if (exprTemp != null) exprTemp.release();
            }
        }

        ScopeHandler.popScope();
        return null;
    }
}
