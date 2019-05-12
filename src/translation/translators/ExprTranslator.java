package translation.translators;

import gen.CoolParser;
import helpers.Assertions;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.TranslationHandler;
import translation.Translator;

// expr op=(OP_ADD|OP_SUB|RELOP_EQ|RELOP_LE|RELOP_LT) term | term;
public class ExprTranslator extends Translator {

    public ExprTranslator(ParseTree parseTree) {
        super(parseTree, CoolParser.ExprContext.class);
    }

    @Override
    public Temp generate() {

        // expr is only one term
        if (parseTree.getChildCount() == 1) {
            return new TermTranslator(parseTree.getChild(0)).generate();
        }

        Temp exprTemp = new ExprTranslator(parseTree.getChild(0)).generate();
        String exprString = exprTemp.toString();

        Temp termTemp = new TermTranslator(parseTree.getChild(2)).generate();
        String termString = termTemp.toString();

        exprTemp.release();
        termTemp.release();

        Temp myRes = new Temp();

        TranslationHandler.write(
                String.format(
                        "%s := %s %s %s\t",
                        myRes,
                        exprString,
                        parseTree.getChild(1).getText(),
                        termString
                )
        );

        return myRes;
    }
}
