package translation.translators;

import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.Translator;

public class VariableDeclarationTranslator extends Translator {

    private ParseTree parseTree;
    public VariableDeclarationTranslator(ParseTree parseTree) {
        this.parseTree = parseTree;
    }

    @Override
    public Temp generate() {
        return null;
    }
}
