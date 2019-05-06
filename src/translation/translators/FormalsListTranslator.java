package translation.translators;


import gen.CoolParser;
import helpers.Assertions;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.TranslationHandler;
import translation.Translator;

// formalsList: formalsList COMMA formal | formal;
public class FormalsListTranslator extends Translator{
    public FormalsListTranslator(ParseTree parseTree) {
        super(parseTree, CoolParser.FormalsListContext.class);
    }

    @Override
    public Temp generate() {
        if(parseTree.getChildCount() == 1){
            new FormalTranslator(parseTree.getChild(0)).generate();
        }else{
            new FormalTranslator(parseTree.getChild(2)).generate();
            TranslationHandler.write(",");
            new FormalsListTranslator(parseTree.getChild(0)).generate();
        }

        return null;
    }
}
