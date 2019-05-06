package translation.translators;

import gen.CoolParser;
import helpers.Assertions;
import helpers.scope.Reference;
import helpers.scope.ScopeHandler;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.TranslationHandler;
import translation.Translator;

// ID OPENING_BRACKET exprList? CLOSING_BRACKET
public class FeatureCallTranslator extends Translator{
    public FeatureCallTranslator(ParseTree parseTree) {
        super(parseTree, CoolParser.FeatureCallContext.class);
    }

    /**
     * this function is supposed to handle the calling of a function
     * 1 - it should first push function parameters to stack or pass them to the function by any means
     * 2 - call the function
     *
     * expected output:
     *
     * _sc_t54 = call func
     * */
    @Override
    public Temp generate() {
        String featureName = parseTree.getChild(0).getText();
        TranslationHandler.write("");

        int paramsLength = parseTree.getChildCount() - 3;
        if(paramsLength > 0){
            ParseTree exprList = parseTree.getChild(2);
            new ExprListTranslator(exprList).generate();
        }

        Reference featureRef = ScopeHandler.getReference(featureName);

        Temp ret = new Temp();
        TranslationHandler.write(String.format("%s = call %s",ret, featureRef));
        TranslationHandler.write("");

        return ret;
    }
}
