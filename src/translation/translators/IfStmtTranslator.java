package translation.translators;

import gen.CoolParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.TranslationHandler;
import translation.Translator;

public class IfStmtTranslator extends Translator {

    public IfStmtTranslator(ParseTree parseTree){
        super(parseTree);
        if(!(parseTree instanceof CoolParser.IfStmtContext))
            throw new RuntimeException();
    }
    @Override
    public Temp generate() {
        Temp myTemp = new Temp();
        String elseLabel = TranslationHandler.getNewLabel();

        TranslationHandler.write("\n; expansion of the if condition's expression");
        Temp child1Temp = new ExprTranslator(parseTree.getChild(1)).generate();
        TranslationHandler.write("\nIFFALSE " + child1Temp.toString() + " GOTO " + elseLabel);
        child1Temp.release();

        TranslationHandler.write("; body of then");
        Temp child2Temp = new ExprTranslator(parseTree.getChild(3)).generate();
        TranslationHandler.write(myTemp.toString() + " := " + child2Temp.toString());
        child2Temp.release();

        if(parseTree.getChildCount() > 5){
            String afterLabel = TranslationHandler.getNewLabel();
            TranslationHandler.write("GOTO " + afterLabel);

            TranslationHandler.write("; body of else");
            TranslationHandler.write(elseLabel + ":");
            Temp child3Temp = new ExprTranslator(parseTree.getChild(5)).generate();
            TranslationHandler.write(myTemp.toString() + " := " + child3Temp.toString());

            TranslationHandler.write(afterLabel + ":");
            child3Temp.release();
        }else{
            TranslationHandler.write(elseLabel + ":");
        }
        TranslationHandler.write("\n");
        return myTemp;
    }
}
