import translation.TranslationHandler;

public class Main {

    public static void main(String[] args) {
        String srcFile = "cool_source/expr.cl";
        if (args.length >= 1) srcFile = args[0];

        Lexer lexer = new Lexer(srcFile);
        lexer.writeTokens(srcFile + "-lex");

        Parser parser = new Parser(lexer);
        parser.writeAST(srcFile + "-cst");

        TranslationHandler.translate(parser.parse());
    }
}
