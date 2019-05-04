package translation.translators;

import gen.CoolParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.TranslationHandler;
import translation.Translator;

public class AssignmentStmtTranslator extends Translator {
    public AssignmentStmtTranslator(ParseTree parseTree) {
        super(parseTree);
        if(!(parseTree instanceof CoolParser.AssignmentStmtContext))
            throw new RuntimeException();
    }

    @Override
    public Temp generate() {
        Temp childTemp = new ExprTranslator(parseTree.getChild(2)).generate();
        TranslationHandler.write(parseTree.getChild(0).getText() + " := " + childTemp.toString());
        childTemp.release();
        return null;
    }
}
