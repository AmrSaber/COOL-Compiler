package translation.translators;

import translation.Temp;
import translation.Translator;

public class ExprTranslator extends Translator {
    @Override
    public Temp generate() {
        return new Temp();
    }
}
