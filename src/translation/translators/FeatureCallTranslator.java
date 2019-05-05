package translation.translators;

import gen.CoolParser;
import helpers.scope.Reference;
import helpers.scope.ScopeHandler;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.TranslationHandler;
import translation.Translator;

// ID OPENING_BRACKET (exprList|) CLOSING_BRACKET
public class FeatureCallTranslator extends Translator{
    public FeatureCallTranslator(ParseTree parseTree) {
        super(parseTree);
    }

    /**
     * this function is supposed to handle the calling of a function
     * 1 - it should first push function parameters to stack or pass them to the function by any means
     * 2 - call the function
     *
     * expected output:
     *
     * pushLabel L3165
     * _sc_t54 = call func
     * L3165:
     * */
    @Override
    public Temp generate() {
        if(parseTree instanceof CoolParser.FeatureCallContext){
            String featureName = ((CoolParser.FeatureCallContext) parseTree).children.get(0).getText();
            int paramsLength = ((CoolParser.FeatureCallContext) parseTree).children.size() - 3;
            if(paramsLength > 0){
                ParseTree exprList = ((CoolParser.FeatureCallContext) parseTree).children.get(2);
                (new ExprListTranslator(exprList)).generate();
            }
            Reference featureRef = ScopeHandler.getReference(featureName);
            Temp ret = new Temp();
            TranslationHandler.write(String.format("%s = call %s\n",ret, featureRef));

            return ret;
        }else{
            throw new RuntimeException(String.format("expected CoolParser.FeatureCallContext found %s", parseTree.getClass().toString()));
        }
    }
}
