package translation.translators;

import gen.CoolParser;
import helpers.scope.Reference;
import helpers.scope.ScopeHandler;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Temp;
import translation.TranslationHandler;
import translation.Translator;

public class AssignmentStmtTranslator extends Translator {
    public AssignmentStmtTranslator(ParseTree parseTree) {
        super(parseTree);
        if(!(parseTree instanceof CoolParser.AssignmentStmtContext))
            throw new RuntimeException();
    }

    @Override
    public Temp generate() {
        String id = parseTree.getChild(0).getText();
        Reference reference = ScopeHandler.getReference(id);

        Temp childTemp = new ExprTranslator(parseTree.getChild(2)).generate();
        TranslationHandler.write(reference + " := " + childTemp);
        childTemp.release();
        return null;
    }
}
