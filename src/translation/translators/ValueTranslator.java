package translation.translators;

import gen.CoolParser;
import org.antlr.v4.runtime.tree.ParseTree;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import translation.Temp;
import translation.TranslationHandler;
import translation.Translator;

/**
 * value: assignmentStmt
 *    | featureCall
 *    | ifStmt
 *    | caseStmt
 *    | letStmt
 *    | whileStmt
 *    | block
 *    | newObject
 *    | isvoidExpr
 *    | notExpr
 *    | invrseExpr
 *    | TERMINAL
 */

public class ValueTranslator extends Translator {
    public ValueTranslator(ParseTree parseTree) {
        super(parseTree);
        if (!(parseTree instanceof CoolParser.ValueContext))
            throw new RuntimeException("Node is not Value!");
    }

    @Override
    public Temp generate() {
        ParseTree child = parseTree.getChild(0);
        if (child instanceof CoolParser.AssignmentStmtContext) {
            // TODO
            return new Temp();
        } else if (child instanceof CoolParser.FeatureCallContext) {
            // TODO
            return new Temp();
        } else if (child instanceof CoolParser.IfStmtContext) {
            return new IfStmtTranslator(child).generate();
        } else if (child instanceof CoolParser.CaseStmtContext) {
            // TODO
            return new Temp();
        } else if (child instanceof CoolParser.LetStmtContext) {
            return new LetStmtTranslator(child).generate();
        } else if (child instanceof CoolParser.WhileStmtContext) {
            return new WhileStmtTranslator(child).generate();
        } else if (child instanceof CoolParser.BlockContext) {
            // TODO
            return new Temp();
        } else if (child instanceof CoolParser.NewObjectContext) {
            throw new NotImplementedException();
        } else if (child instanceof CoolParser.IsvoidExprContext) {
            return new IsVoidExprTranslator(child).generate();
        } else if (child instanceof CoolParser.NotExprContext) {
            return new NotExprTranslator(child).generate();
        } else if (child instanceof CoolParser.InvrseExprContext) {
            return new InvrseExprTranslator(child).generate();
        } else if (child.getChildCount() == 0) {
            Temp res = new Temp();
            TranslationHandler.write(
                    String.format(
                            "%s := %s\t; assign terminal value into temp",
                            res,
                            child.getText()
                    )
            );
            return res;
        } else {
            throw new RuntimeException("Unknown child node!");
        }
    }
}
