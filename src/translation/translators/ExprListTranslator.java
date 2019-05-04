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
