package translation.translators;

import gen.CoolParser;
import helpers.Assertions;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.TranslationHandler;
import translation.Translator;

public class BlockTranslator extends Translator {
    public BlockTranslator(ParseTree parseTree) {
        super(parseTree, CoolParser.BlockContext.class);

    }

    @Override
    public Temp generate() {
        Temp res = null;
        for (int i = 0; i < parseTree.getChildCount(); ++i) {
            ParseTree child = parseTree.getChild(i);
            if (child instanceof CoolParser.ExprContext) {
                if (res != null) res.release();
                res = new ExprTranslator(child).generate();
            }
        }
        return res;
    }
}
