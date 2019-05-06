package translation.translators;

import gen.CoolParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.TranslationHandler;
import translation.Translator;

public class IfStmtTranslator extends Translator {

    public IfStmtTranslator(ParseTree parseTree){
        super(parseTree, CoolParser.IfStmtContext.class);
    }
    @Override
    public Temp generate() {
        Temp myTemp = new Temp();
        String elseLabel = TranslationHandler.getNewLabel();

        TranslationHandler.write("");
        TranslationHandler.write("; ---{If Condition}---");
        TranslationHandler.addIndentation();

        Temp child1Temp = new ExprTranslator(parseTree.getChild(1)).generate();
        TranslationHandler.write("IFFALSE " + child1Temp.toString() + " GOTO " + elseLabel);
        child1Temp.release();

        TranslationHandler.write("");
        TranslationHandler.write("; --{Then Body}--");
        TranslationHandler.addIndentation();
        Temp child2Temp = new ExprTranslator(parseTree.getChild(3)).generate();
        TranslationHandler.write(myTemp.toString() + " := " + child2Temp.toString());
        child2Temp.release();

        if(parseTree.getChildCount() > 5){
            String afterLabel = TranslationHandler.getNewLabel();
            TranslationHandler.write("GOTO " + afterLabel);

            TranslationHandler.removeIndentation();
            TranslationHandler.write("; --{End Then Body}--");

            TranslationHandler.write("");
            TranslationHandler.write("; --{Else Body}--");
            TranslationHandler.addIndentation();

            TranslationHandler.write(elseLabel + ":");
            Temp child3Temp = new ExprTranslator(parseTree.getChild(5)).generate();
            TranslationHandler.write(myTemp.toString() + " := " + child3Temp.toString());

            TranslationHandler.removeIndentation();
            TranslationHandler.write("; --{End Else Body}--");

            TranslationHandler.write(afterLabel + ":");
            child3Temp.release();
        }else{
            TranslationHandler.write(elseLabel + ":");

            TranslationHandler.removeIndentation();
            TranslationHandler.write("; --{End Then Body}--");
        }

        TranslationHandler.removeIndentation();
        TranslationHandler.write("; ---{End If Condition}---");
        return myTemp;
    }
}
