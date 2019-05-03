public class Main {

    public static void main(String[] args) throws Exception{
        String srcFile = "cool_source/bad_parse.cl";
        if(args.length >= 1)    srcFile = args[0];

        Lexer lexer = new Lexer(srcFile);
        if(lexer.hasErrors())   lexer.reportErrors();
        else    lexer.getTokens(srcFile + "-lex");
        lexer.getTokens(srcFile + "-lex");

        ParserTest parser = new ParserTest(srcFile);
        parser.printAST();

    }
}
