package translation.translators;


import gen.CoolParser;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.TranslationHandler;
import translation.Translator;

// formalsList: formalsList COMMA formal | formal;
public class FormalsListTranslator extends Translator{
    public FormalsListTranslator(ParseTree parseTree) {
        super(parseTree);
    }

    @Override
    public Temp generate() {
        if(parseTree instanceof CoolParser.FormalsListContext){
            if(((CoolParser.FormalsListContext) parseTree).children.size() == 1){
                (new FormalTranslator(((CoolParser.FormalsListContext) parseTree).children.get(0))).generate();
            }else{
                (new FormalTranslator(((CoolParser.FormalsListContext) parseTree).children.get(2))).generate();
                TranslationHandler.write(", ");
                (new FormalsListTranslator(((CoolParser.FormalsListContext) parseTree).children.get(0))).generate();
            }
        }else{
            throw new RuntimeException(String.format("expected CoolParser.ExprListContext found %s", parseTree.getClass().toString()));
        }
        return null;
    }
}
