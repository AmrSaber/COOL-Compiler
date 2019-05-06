package translation.translators;

import gen.CoolParser;
import helpers.Assertions;
import helpers.scope.ScopeHandler;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.Translator;

public class GlobalsTranslator extends Translator {
    public GlobalsTranslator(ParseTree parseTree) {
        super(parseTree, CoolParser.GlobalsContext.class);
    }

    @Override
    public Temp generate() {
        ScopeHandler.pushScope();

        for (int i = 0; i < parseTree.getChildCount(); ++i) {
            ParseTree child = parseTree.getChild(i);
            if (child instanceof CoolParser.VariableDeclarationContext) {
                Temp temp = new VariableDeclarationTranslator(child).generate();
                if (temp != null) temp.release();
            }

            if (child instanceof CoolParser.FeatureDefinitionContext) {
                Temp temp = new FeatureDefinitionTranslator(child).generate();
                if (temp != null) temp.release();
            }

            if (child instanceof CoolParser.ExprContext) {
                Temp temp = new ExprTranslator(child).generate();
                if (temp != null) temp.release();
            }
        }

        ScopeHandler.popScope();
        return null;
    }
}
