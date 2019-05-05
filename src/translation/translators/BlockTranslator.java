package translation.translators;

import gen.CoolParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.TranslationHandler;
import translation.Translator;

public class BlockTranslator extends Translator {
    public BlockTranslator(ParseTree parseTree){
        super(parseTree);
        if(!(parseTree instanceof CoolParser.BlockContext))
            throw new RuntimeException();

    }
    @Override
    public Temp generate() {
        int i = 1;
        for( ; i+3 < parseTree.getChildCount() ; i+=3){
            Temp childITemp = new ExprTranslator(parseTree.getChild(i)).generate();
            childITemp.release();
        }
        Temp lastChild = new ExprTranslator(parseTree.getChild(i)).generate();
        return lastChild;
    }
}
