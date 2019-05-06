import helpers.scope.ScopeHandler;
import translation.TranslationHandler;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String srcFile = "cool_source/expr.cl";
        if (args.length >= 1) srcFile = args[0];

        Lexer lexer = new Lexer(srcFile);
        lexer.writeTokens(srcFile + "-lex");

        Parser parser = new Parser(lexer);
        parser.writeAST(srcFile + "-cst");

        TranslationHandler.translate(parser.parse());

        ScopeHandler.clear();
        TranslationHandler.setStream(new FileOutputStream(srcFile + "-TAC"));
        TranslationHandler.translate(parser.parse());
    }
}
