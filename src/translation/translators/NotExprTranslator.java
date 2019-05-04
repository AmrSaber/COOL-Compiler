package translation.translators;

import gen.CoolParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.TranslationHandler;
import translation.Translator;


public class NotExprTranslator extends Translator {

    public NotExprTranslator(ParseTree parseTree){
        super(parseTree);
        if(!(parseTree instanceof CoolParser.NotExprContext))
            throw new RuntimeException();
    }

    @Override
    public Temp generate() {
        Temp childTmp = new ExprTranslator(parseTree.getChild(1)).generate();
        Temp myTemp = new Temp();
        TranslationHandler.write(myTemp.toString() + " := NOT " + childTmp.toString());
        childTmp.release();
        return myTemp;
    }
}
