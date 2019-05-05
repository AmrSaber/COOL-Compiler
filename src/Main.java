import translation.TranslationHandler;

public class Main {

    public static void main(String[] args) throws Exception{
        String srcFile = "cool_source/expr.cl";
        if(args.length >= 1)    srcFile = args[0];

        Lexer lexer = new Lexer(srcFile);
        if(lexer.hasErrors())   lexer.reportErrors();
        else    lexer.getTokens(srcFile + "-lex");
        lexer.getTokens(srcFile + "-lex");

        ParserWrapper parserWrapper = new ParserWrapper(srcFile);
//        parserWrapper.printAST();
//        parserWrapper.dfs();


        TranslationHandler.translate(parserWrapper.parse());
    }
}
