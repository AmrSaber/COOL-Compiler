package translation.translators;


import gen.CoolParser;
import helpers.Assertions;
import helpers.scope.Reference;
import helpers.scope.ScopeHandler;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.TranslationHandler;
import translation.Translator;


// ID COLON (type|ID);
public class FormalTranslator extends Translator{
    public FormalTranslator(ParseTree parseTree) {
        super(parseTree, CoolParser.FormalContext.class);
    }

    @Override
    public Temp generate() {
        String variableName = parseTree.getChild(0).getText();
        String variableType = parseTree.getChild(2).getText();

        Reference variableRef = new Reference(variableName, variableType);
        ScopeHandler.addReference(variableRef);

        TranslationHandler.write(String.format("%s: %s ",variableRef, variableType));

        return null;
    }
}
