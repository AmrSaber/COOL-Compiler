package translation.translators;

import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.Translator;

public class ValueTranslator extends Translator {
    public ValueTranslator(ParseTree parseTree) {
        super(parseTree);
    }

    @Override
    public Temp generate() {
        return new Temp();
    }
}
