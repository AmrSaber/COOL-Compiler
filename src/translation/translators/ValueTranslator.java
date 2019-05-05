package translation.translators;

import gen.CoolLexer;
import gen.CoolParser;
import helpers.scope.Reference;
import helpers.scope.ScopeHandler;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
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
            return new AssignmentStmtTranslator(child).generate();
        } else if (child instanceof CoolParser.FeatureCallContext) {
            return new FeatureCallTranslator(child).generate();
        } else if (child instanceof CoolParser.IfStmtContext) {
            return new IfStmtTranslator(child).generate();
        } else if (child instanceof CoolParser.CaseStmtContext) {
            return new CaseStmtTranslator(child).generate();
        } else if (child instanceof CoolParser.LetStmtContext) {
            return new LetStmtTranslator(child).generate();
        } else if (child instanceof CoolParser.WhileStmtContext) {
            return new WhileStmtTranslator(child).generate();
        } else if (child instanceof CoolParser.BlockContext) {
            return new BlockTranslator(child).generate();
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
            String rhs;

            int tokenType = ((TerminalNodeImpl) child).symbol.getType() - 1;
            String tokenName = CoolLexer.ruleNames[tokenType];

            if (tokenName.equals("ID")) {
                Reference reference = ScopeHandler.getReference(child.getText());
                rhs = reference.toString();
            } else {
                rhs = child.getText();
            }

            TranslationHandler.write(
                    String.format(
                            "%s := %s\t; assign terminal value into temp",
                            res,
                            rhs
                    )
            );
            return res;
        } else {
            throw new RuntimeException("Unknown child node!");
        }
    }
}
