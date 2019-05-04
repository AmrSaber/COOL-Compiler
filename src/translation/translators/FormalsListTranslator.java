package translation.translators;


import gen.CoolParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.Translator;

// formalsList: formalsList COMMA formal | formal;
public class FormalsListTranslator extends Translator{
    public FormalsListTranslator(ParseTree parseTree) {
        super(parseTree);
    }

    @Override
    public Temp generate() {
        if(parseTree instanceof CoolParser.ExprListContext){
            if(((CoolParser.ExprListContext) parseTree).children.size() == 1){
                (new ExprTranslator(((CoolParser.ExprListContext) parseTree).children.get(0))).generate();
            }else{
                (new ExprTranslator(((CoolParser.ExprListContext) parseTree).children.get(0))).generate();
                (new ExprTranslator(((CoolParser.ExprListContext) parseTree).children.get(2))).generate();
            }
        }else{
            throw new RuntimeException(String.format("expected CoolParser.ExprListContext found %s", parseTree.getClass().toString()));
        }
        return null;
    }
}
