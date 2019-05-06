package translation.translators;


import gen.CoolParser;
import helpers.Assertions;
import helpers.scope.Reference;
import helpers.scope.ScopeHandler;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.TranslationHandler;
import translation.Translator;


// ID ( formalsList? ) : (ID|type) { expr } ;
public class FeatureDefinitionTranslator extends Translator {
    public FeatureDefinitionTranslator(ParseTree parseTree) {
        super(parseTree, CoolParser.FeatureDefinitionContext.class);
    }

    @Override
    public Temp generate() {
        // set a reference for the function in current scope
        this.generateFeatureHeader(parseTree);

        // create a scope for this function
        ScopeHandler.pushScope();

        // generate param list
        this.generateParamList(parseTree);
        TranslationHandler.write("");

        // generate feature body
        TranslationHandler.addIndentation();
        Temp ret = this.generateFeatureBody(parseTree);
        TranslationHandler.removeIndentation();

        if(ret == null){
            ret = new Temp();
            TranslationHandler.write(
                    String.format("%s := VOID", ret)
            );
        }

        TranslationHandler.write(String.format("return %s\n", ret));

        // exit function scope
        ScopeHandler.popScope();

        return  ret;
    }

    /**
     * this function generates the body of the given function
     * it first checks if the function has arguments
     *      if this is the case then the body will be in the 7th node
     * else
     *      then the body is in the 6th node
     * creates a temp to hold the value of the output of body and return it
     * */
    private Temp generateFeatureBody(ParseTree fun){
        Temp bodyRes = null;
        boolean found = false;

        for (int i = fun.getChildCount()-1 ; i >= 0 ; --i) {
            ParseTree child = fun.getChild(i);
            if (child instanceof CoolParser.ExprContext) {
                found = true;
                bodyRes = new ExprTranslator(child).generate();
                break;
            }
        }

        if (!found)
            throw new RuntimeException("Couldn't find feature body");

        return bodyRes;
    }

    private void generateFeatureHeader(ParseTree fun){
        // read function name from first node
        String featureName = fun.getChild(0).getText();

        // the position of type depends on the presence or absence of param list so we first check for it.
        String featureType;
        if(fun.getChild(2) instanceof CoolParser.FormalsListContext){
            featureType = fun.getChild(5).getText();
        }else{
            featureType = fun.getChild(4).getText();
        }

        // create a reference for this function in current scope
        Reference featureRef = new Reference(featureName, featureType);
        ScopeHandler.addReference(featureRef);

        // generate the name of the function along with its type
        TranslationHandler.write(String.format("%s: %s PROC ", featureRef, featureType));
    }

    private void generateParamList(ParseTree fun){
        for (int i = 0 ; i < fun.getChildCount() ; ++i) {
            ParseTree child = fun.getChild(i);
            if (child instanceof CoolParser.FormalsListContext) {
                Temp formalsListTemp = new FormalsListTranslator(child).generate();
                if (formalsListTemp != null) formalsListTemp.release();
                return;
            }
        }
    }
}
