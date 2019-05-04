package translation.translators;

import gen.CoolParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.TranslationHandler;
import translation.Translator;

public class InvrseExprTranslator extends Translator {

    public InvrseExprTranslator(ParseTree parseTree){
        super(parseTree);
        if(!(parseTree instanceof CoolParser.InvrseExprContext))
            throw new RuntimeException();
    }

    @Override
    public Temp generate() {
        Temp childTemp = new ExprTranslator(parseTree.getChild(1)).generate();
        Temp myTemp = new Temp();
        TranslationHandler.write(myTemp.toString() + " := inv " + childTemp.toString());
        childTemp.release();
        return myTemp;
    }
}
