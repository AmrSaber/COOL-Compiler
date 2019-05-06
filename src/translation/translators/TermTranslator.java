package translation.translators;

import gen.CoolParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.TranslationHandler;
import translation.Translator;

// term op=(OP_MUL|OP_DIV) value | value;
public class TermTranslator extends Translator {
    public TermTranslator(ParseTree parseTree) {
        super(parseTree, CoolParser.TermContext.class);
    }

    @Override
    public Temp generate() {

        // if the term consists of one value
        if (parseTree.getChildCount() == 1) {
            return new ValueTranslator(parseTree.getChild(0)).generate();
        }

        Temp termTemp = new TermTranslator(parseTree.getChild(0)).generate();
        Temp valueTemp = new ValueTranslator(parseTree.getChild(2)).generate();
        Temp myRes = new Temp();

        TranslationHandler.write(
                String.format(
                        "%s := %s %s %s\t",
                        myRes,
                        termTemp,
                        parseTree.getChild(1).getText(),
                        valueTemp
                )
        );

        valueTemp.release();
        termTemp.release();

        return myRes;
    }
}
