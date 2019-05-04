package translation.translators;

import gen.CoolParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.TranslationHandler;
import translation.Translator;

public class CaseStmtTranslator extends Translator {

    public CaseStmtTranslator(ParseTree parseTree){
        super(parseTree);
        if(!(parseTree instanceof CoolParser.CaseStmtContext))
            throw new RuntimeException();
    }

    @Override
    public Temp generate() {
        Temp child1Temp = new ExprTranslator(parseTree.getChild(1)).generate();
        Temp myTemp = new Temp();
        Temp myType = new Temp();
        TranslationHandler.write(myType.toString() + " := TYPEOF " + myTemp.toString());
        String afterAll = TranslationHandler.getNewLabel();
        for(int i = 3 ; i+6 < parseTree.getChildCount() ; i += 6){
            String nextLabel = TranslationHandler.getNewLabel();
            String childIType = parseTree.getChild(i+2).getText();
            TranslationHandler.write("IFFALSE " + myType.toString() + " = " + childIType + " GOTO " + nextLabel);
            Temp childITemp = new ExprTranslator(parseTree.getChild(i+4)).generate();
            TranslationHandler.write(myTemp.toString() + " := " + childITemp.toString());
            TranslationHandler.write("GOTO " + afterAll);
            TranslationHandler.write(nextLabel + ":");
            childITemp.release();
        }
        TranslationHandler.write(afterAll + ":");
        child1Temp.release();
        myType.release();
        return myTemp;
    }
}
