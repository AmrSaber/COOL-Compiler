package translation.translators;


import gen.CoolParser;
import helpers.scope.Reference;
import helpers.scope.ScopeHandler;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.TranslationHandler;
import translation.Translator;


/**
 ID OPENING_BRACKET (formalsList|) CLOSING_BRACKET COLON (ID|type) OPENING_CURLY_BRACKET
 expr
 CLOSING_CURLY_BRACKET SEMICOLON
 */
public class FeatureDefinitionTranslator extends Translator {
    public FeatureDefinitionTranslator(ParseTree parseTree) {
        super(parseTree);
    }

    @Override
    public Temp generate() {
        if(parseTree instanceof CoolParser.FeatureDefinitionContext){
            // set a reference for the function in current scope
            this.generateFeatureHeader(parseTree);

            // create a scope for this function
            ScopeHandler.pushScope();

            // generate param list
            this.generateParamList(parseTree);
            TranslationHandler.write("\n");

            // generate feature body
            Temp ret = this.generateFeatureBody(parseTree);
            if(ret == null)
                throw new RuntimeException("FeatureDefinitionTranslator: ret can't be null");
            TranslationHandler.write(String.format("return %s\n", ret));

            // exit function scope
            ScopeHandler.popScope();

            return  ret;
        }else {
            throw new RuntimeException(String.format("expected CoolParser.FeatureDefinitionContext found %s", parseTree.getClass().toString()));
        }
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
        ParseTree body;
        if(((CoolParser.FeatureDefinitionContext) fun).children.get(2) instanceof CoolParser.ExprListContext){
            body = ((CoolParser.FeatureDefinitionContext) fun).children.get(7);
        }else{
            body = ((CoolParser.FeatureDefinitionContext) fun).children.get(6);
        }
        if(!(body instanceof CoolParser.ExprContext))
            throw new RuntimeException("internal error in function \"generateFeatureBody\" couldn't find feature body");
        return (new ExprTranslator(body)).generate();
    }

    private void generateFeatureHeader(ParseTree fun){
        // read function name from first node
        String featureName = ((CoolParser.FeatureDefinitionContext) fun).children.get(0).getText();

        // the position of type depends on the presence or absence of param list so we first check for it.
        String featureType;
        if(((CoolParser.FeatureDefinitionContext) fun).children.get(2) instanceof CoolParser.ExprListContext){
            featureType = ((CoolParser.FeatureDefinitionContext) fun).children.get(5).getText();
        }else{
            featureType = ((CoolParser.FeatureDefinitionContext) fun).children.get(4).getText();
        }

        // create a reference for this function in current scope
        Reference featureRef = new Reference(featureName, featureType);
        ScopeHandler.addReference(featureRef);
        featureRef = ScopeHandler.getReference(featureName);

        // generate the name of the function along with its type
        TranslationHandler.write(String.format("%s:%s PROC ", featureRef, featureType));
    }

    private void generateParamList(ParseTree fun){
        if(((CoolParser.FeatureDefinitionContext) fun).children.get(2) instanceof CoolParser.ExprListContext){
            ParseTree formalsList = ((CoolParser.FeatureDefinitionContext) fun).children.get(2);
            (new FormalsListTranslator(formalsList)).generate();
        }
    }
}
