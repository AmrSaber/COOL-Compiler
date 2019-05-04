package Translation;

/**
 * this is an abstract class that translators for grammar rules should extend
 **/

abstract public class Translator {
    /**
     * this function should be implemented for all grammar rules
     * for each grammar rule it supposed to:
     * 1 - append the 3 address code for this rule to the stream.
     * 2 - return the temp variable holding the return value of this grammar rule.
     * */
    abstract public Temp generate();
}
