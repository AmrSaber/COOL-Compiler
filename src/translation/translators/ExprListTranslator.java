package translation.translators;

import gen.CoolParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.TranslationHandler;
import translation.Translator;
import translation.Temp;


// exprList: exprList COMMA expr | expr;
public class ExprListTranslator extends Translator {
    public ExprListTranslator(ParseTree parseTree) {
        super(parseTree);
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
        if(parseTree instanceof CoolParser.ExprListContext){
            if(((CoolParser.ExprListContext) parseTree).children.size() == 1){
                ParseTree expr = ((CoolParser.ExprListContext) parseTree).children.get(0);
                Temp param = (new ExprTranslator(expr)).generate();
                TranslationHandler.write(String.format("pushParam %s\n",param));
                param.release();
            }else{
                ParseTree exprList = ((CoolParser.ExprListContext) parseTree).children.get(0);
                (new ExprListTranslator(exprList)).generate().release();

                ParseTree expr = ((CoolParser.ExprListContext) parseTree).children.get(2);
                Temp param = (new ExprTranslator(expr)).generate();
                TranslationHandler.write(String.format("pushParam %s\n",param));
                param.release();
            }
        }else{
            throw new RuntimeException(String.format("expected CoolParser.ExprListContext found %s", parseTree.getClass().toString()));
        }
        return null;
    }
}
