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
 *    | ( expr )
 */

public class ValueTranslator extends Translator {
    public ValueTranslator(ParseTree parseTree) {
        super(parseTree, CoolParser.ValueContext.class);
    }

    @Override
    public Temp generate() {
        ParseTree child;
        if (parseTree.getChildCount() == 1) child = parseTree.getChild(0);
        else if (parseTree.getChildCount() == 3) child = parseTree.getChild(1);
        else throw new RuntimeException(
                    String.format(
                            "Unknown form of value with %s children",
                            parseTree.getChildCount()
                    )
            );

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
            return new InverseExprTranslator(child).generate();
        } else if (child instanceof CoolParser.ExprContext) {
            return new ExprTranslator(child).generate();
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
                            "%s := %s",
                            res,
                            rhs
                    )
            );
            return res;
        } else {
            throw new RuntimeException("Unknown child node with " + child.getClass());
        }
    }
}
