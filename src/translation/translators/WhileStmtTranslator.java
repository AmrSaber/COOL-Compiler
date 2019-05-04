package translation.translators;

import gen.CoolParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.TranslationHandler;
import translation.Translator;

public class WhileStmtTranslator extends Translator {
    public WhileStmtTranslator(ParseTree parseTree){
        super(parseTree);
        if(!(parseTree instanceof CoolParser.WhileStmtContext))
            throw new RuntimeException();
    }

    @Override
    public Temp generate() {
        String beforeLabel = TranslationHandler.getNewLabel();
        String afterLabel = TranslationHandler.getNewLabel();
        TranslationHandler.write(beforeLabel + ":");
        Temp child1Temp = new ExprTranslator(parseTree.getChild(1)).generate();
        TranslationHandler.write("IFFALSE " + child1Temp.toString() + " GOTO " + afterLabel);
        Temp child2Temp = new ExprTranslator(parseTree.getChild(3)).generate();
        TranslationHandler.write("GOTO " + beforeLabel);
        TranslationHandler.write(afterLabel  + ":");
        child1Temp.release();
        return child2Temp;
    }
}
