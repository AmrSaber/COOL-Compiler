package translation.translators;

import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.Translator;

public class ExprTranslator extends Translator {

    public ExprTranslator(ParseTree parseTree) {
        super(parseTree);
    }

    @Override
    public Temp generate() {
        return new Temp();
    }
}
