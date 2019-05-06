package translation.translators;

import gen.CoolParser;
import helpers.Assertions;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.TranslationHandler;
import translation.Translator;

public class CaseStmtTranslator extends Translator {

    public CaseStmtTranslator(ParseTree parseTree){
        super(parseTree, CoolParser.CaseStmtContext.class);
    }

    @Override
    public Temp generate() {
        TranslationHandler.write("");
        TranslationHandler.write("; ---{Case Statement}---");
        TranslationHandler.addIndentation();

        Temp child1Temp = new ExprTranslator(parseTree.getChild(1)).generate();

        Temp myRes = new Temp();
        Temp myType = new Temp();

        TranslationHandler.write(myType.toString() + " := TYPEOF " + child1Temp.toString());
        child1Temp.release();

        String afterAll = TranslationHandler.getNewLabel();
        for(int i = 3, j = 1 ; i+6 < parseTree.getChildCount() ; i += 6, ++j) {
            TranslationHandler.write("");
            TranslationHandler.write(String.format("; --{Case #%d}--", j));
            TranslationHandler.addIndentation();

            String nextLabel = TranslationHandler.getNewLabel();
            String childIType = parseTree.getChild(i + 2).getText();
            TranslationHandler.write("IFFALSE " + myType.toString() + " = " + childIType + " GOTO " + nextLabel);
            Temp childITemp = new ExprTranslator(parseTree.getChild(i + 4)).generate();
            TranslationHandler.write(myRes.toString() + " := " + childITemp.toString());
            TranslationHandler.write("GOTO " + afterAll);

            TranslationHandler.removeIndentation();
            TranslationHandler.write(String.format("; --{End Case #%d}--", j));

            TranslationHandler.write(nextLabel + ":");
            childITemp.release();
        }
        TranslationHandler.write("");
        TranslationHandler.write(afterAll + ":");
        myType.release();

        TranslationHandler.removeIndentation();
        TranslationHandler.write("; ---{End Case Statement}---");
        return myRes;
    }
}
