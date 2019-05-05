package translation.translators;


import gen.CoolParser;
import helpers.scope.Reference;
import helpers.scope.Scope;
import helpers.scope.ScopeHandler;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.TranslationHandler;
import translation.Translator;


// ID COLON (type|ID);
public class FormalTranslator extends Translator{
    public FormalTranslator(ParseTree parseTree) {
        super(parseTree);
    }

    @Override
    public Temp generate() {
        if(parseTree instanceof CoolParser.FormalContext){
            String variableName = ((CoolParser.FormalContext) parseTree).children.get(0).getText();
            String variableType = ((CoolParser.FormalContext) parseTree).children.get(2).getText();
            Reference variableRef = new Reference(variableName, variableType);
            ScopeHandler.addReference(variableRef);
            variableRef = ScopeHandler.getReference(variableName);
            TranslationHandler.write(String.format("%s:%s ",variableRef, variableType));
        }else{
            throw new RuntimeException(String.format("expected CoolParser.FormalContext found %s", parseTree.getClass().toString()));
        }
        return null;
    }
}
