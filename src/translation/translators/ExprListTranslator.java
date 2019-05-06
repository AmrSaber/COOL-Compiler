package translation.translators;

import gen.CoolParser;
import helpers.Assertions;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.TranslationHandler;
import translation.Translator;
import translation.Temp;


// exprList: exprList COMMA expr | expr;
public class ExprListTranslator extends Translator {
    public ExprListTranslator(ParseTree parseTree) {
        super(parseTree, CoolParser.ExprListContext.class);
    }

    /**
     * this function generates the TAC of expression list given to a function when being called
     * if the function has only 1 expression
     *      generate it
     *      push it to stack
     * else:
     *      recurse to solve the Expression list given
     *
     *      then for the last one generate it
     *      push it to stack
     * */
    @Override
    public Temp generate() {
        if(parseTree.getChildCount() == 1){
            ParseTree expr = parseTree.getChild(0);
            Temp param = new ExprTranslator(expr).generate();

            TranslationHandler.write(String.format("pushParam %s",param));
            param.release();
        }else{
            ParseTree exprList = parseTree.getChild(0);
            new ExprListTranslator(exprList).generate();

            ParseTree expr = parseTree.getChild(2);
            Temp param = new ExprTranslator(expr).generate();

            TranslationHandler.write(String.format("pushParam %s",param));
            param.release();
        }

        return null;
    }
}
