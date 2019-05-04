package translation.translators;


import gen.CoolParser;
import helpers.scope.Reference;
import helpers.scope.ScopeHandler;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.TranslationHandler;
import translation.Translator;

import java.sql.Ref;


/**
 ID OPENING_BRACKET (formalsList|) CLOSING_BRACKET COLON (ID|type) OPENING_CURLY_BRACKET
 expr
 CLOSING_CURLY_BRACKET SEMICOLON


 ID COLON (type|ID) (OP_ASSIGNMENT expr |) SEMICOLON;
*/
public class FeatureDefinitionTranslator extends Translator {
    public FeatureDefinitionTranslator(ParseTree parseTree) {
        super(parseTree);
    }

    @Override
    public Temp generate() {
        if(parseTree instanceof CoolParser.FeatureDefinitionContext){
            // set a reference for the function in current scope
            String featureName = ((CoolParser.FeatureDefinitionContext) parseTree).children.get(0).getText();
            String featureType = "";
            if(((CoolParser.FeatureDefinitionContext) parseTree).children.get(2) instanceof CoolParser.ExprListContext){
                featureType = ((CoolParser.FeatureDefinitionContext) parseTree).children.get(5).getText();
            }else{
                featureType = ((CoolParser.FeatureDefinitionContext) parseTree).children.get(4).getText();
            }
            Reference featureRef = new Reference(featureName, featureType);
            ScopeHandler.addReference(featureRef);
            featureRef = ScopeHandler.getReference(featureName);

            TranslationHandler.write(String.format("%s:%s PROC", featureRef, featureType));

            // generate param list
            if(((CoolParser.FeatureDefinitionContext) parseTree).children.get(2) instanceof CoolParser.ExprListContext){
                ParseTree formalsList = ((CoolParser.FeatureDefinitionContext) parseTree).children.get(2);
                (new FormalsListTranslator(formalsList)).generate();
            }

            // generate feature body
            ParseTree body;
            if(((CoolParser.FeatureDefinitionContext) parseTree).children.get(2) instanceof CoolParser.ExprListContext){
                body = ((CoolParser.FeatureDefinitionContext) parseTree).children.get(7);
            }else{
                body = ((CoolParser.FeatureDefinitionContext) parseTree).children.get(6);
            }
            Temp ret = (new ExprTranslator(body)).generate();

            // pop label to jump to from stack
            Temp returnAddr = new Temp();
            TranslationHandler.write(String.format("POPlabel %s\n", returnAddr));
            TranslationHandler.write(String.format("goto addrIn %s\n", returnAddr));
            return  ret;
        }else {
            throw new RuntimeException(String.format("expected CoolParser.FeatureDefinitionContext found %s", parseTree.getClass().toString()));
        }
    }
}
