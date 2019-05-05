package translation.translators;

import gen.CoolParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.Translator;

public class GlobalsTranslator extends Translator {
    public GlobalsTranslator(ParseTree parseTree) {
        super(parseTree);
        if (!(parseTree instanceof CoolParser.GlobalsContext))
            throw new RuntimeException("Node not Globals!");
    }

    @Override
    public Temp generate() {
        for (int i = 0; i < parseTree.getChildCount(); ++i) {
            ParseTree child = parseTree.getChild(i);
            if (child instanceof CoolParser.VariableDeclarationContext) {
                Temp temp = new VariableDeclarationTranslator(child).generate();
                if (temp != null) temp.release();
            } else if (child instanceof CoolParser.FeatureDefinitionContext) {
                Temp temp = new FeatureDefinitionTranslator(child).generate();
                if (temp != null) temp.release();
            }
        }
        return null;
    }
}
