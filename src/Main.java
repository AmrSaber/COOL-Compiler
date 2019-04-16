public class Main {

    public static void main(String[] args) throws Exception{
        String srcFile = "cool_source/good.cl";
        if(args.length >= 1)    srcFile = args[0];

        Lexer lexer = new Lexer(srcFile);

        if(lexer.hasErrors())   lexer.reportErrors();
        else    lexer.getTokens(srcFile + "-lex");

        /*
        CoolParser parser = new CoolParser(tokensStream);
        ParseTree tree = parser.program();

        System.out.println(tree.toStringTree(parser));
        */
    }
}
