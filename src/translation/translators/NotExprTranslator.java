package translation.translators;

import gen.CoolParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.TranslationHandler;
import translation.Translator;


public class NotExprTranslator extends Translator {

    NotExprTranslator(ParseTree parseTree){
        super(parseTree);
        if(!(parseTree instanceof CoolParser.NotExprContext))
            throw new RuntimeException();
    }
    @Override
    public Temp generate() {
        Temp childTmp = new ExprTranslator(parseTree.getChild(1)).generate();
        Temp newTmp = new Temp();
        TranslationHandler.write(newTmp.toString() + " := not " + childTmp.toString());
        childTmp.release();
        return newTmp;
    }
}
