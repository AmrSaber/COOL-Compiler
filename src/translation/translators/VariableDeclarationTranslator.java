package translation.translators;

import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.Translator;

public class VariableDeclarationTranslator extends Translator {

    public VariableDeclarationTranslator(ParseTree parseTree) {
        super(parseTree);
    }

    @Override
    public Temp generate() {
        return null;
    }
}
