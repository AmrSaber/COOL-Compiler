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

        TranslationHandler.write("; ---{Let}---");
        TranslationHandler.write("; --{Let Variable Declaration}--");
        for (int i = 0; i < parseTree.getChildCount(); ++i) {
            ParseTree child = parseTree.getChild(i);
            if (parseTree.getChild(i) instanceof CoolParser.VariableDeclarationContext) {
                new VariableDeclarationTranslator(child).generate();
            }

            // this will be in the end of the production
            if (parseTree.getChild(i) instanceof CoolParser.ExprContext) {
                TranslationHandler.write("; --{End Let Variable Declaration}--");
                TranslationHandler.write("");
                TranslationHandler.write("; --{Let Body}--");
                TranslationHandler.addIndentation();

                if (exprTemp != null) exprTemp.release();
                exprTemp = new ExprTranslator(child).generate();

                TranslationHandler.write("; --{End Let Body}--");
                TranslationHandler.removeIndentation();
            }
        }

        TranslationHandler.write("; ---{End Let}---");
        ScopeHandler.popScope();
        return exprTemp;
    }
}
