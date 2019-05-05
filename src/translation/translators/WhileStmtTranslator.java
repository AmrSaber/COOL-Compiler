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

        TranslationHandler.write("\n; While loop start");
        TranslationHandler.write(beforeLabel + ":");

        TranslationHandler.write("\n; condition's expression");
        Temp child1Temp = new ExprTranslator(parseTree.getChild(1)).generate();

        TranslationHandler.write("IFFALSE " + child1Temp.toString() + " GOTO " + afterLabel);
        child1Temp.release();

        TranslationHandler.write("\n; while loop body");
        Temp child2Temp = new ExprTranslator(parseTree.getChild(3)).generate();
        TranslationHandler.write("; end of while loop body\n");

        TranslationHandler.write("GOTO " + beforeLabel);
        TranslationHandler.write(afterLabel  + ":");
        TranslationHandler.write("; end of While loop\n");

        return child2Temp;
    }
}
