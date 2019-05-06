package translation.translators;

import gen.CoolParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.TranslationHandler;
import translation.Translator;

public class InverseExprTranslator extends Translator {

    public InverseExprTranslator(ParseTree parseTree){
        super(parseTree, CoolParser.InvrseExprContext.class);
    }

    @Override
    public Temp generate() {
        Temp childTemp = new ExprTranslator(parseTree.getChild(1)).generate();
        Temp myTemp = new Temp();
        TranslationHandler.write(myTemp + " := INV " + childTemp);
        childTemp.release();
        return myTemp;
    }
}
