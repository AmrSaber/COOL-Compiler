import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception{
        String inputFileName = "cool_source/sample.cl";

        CharStream input = CharStreams.fromFileName(inputFileName);
        CoolLexer lexer = new CoolLexer(input);

        CommonTokenStream tokensStream = new CommonTokenStream(lexer);
        tokensStream.fill();

        System.out.println("Number of tokens: " + tokensStream.size());
        List<Token> tokens = tokensStream.getTokens();

        for(Token token: tokens){
            System.out.printf("%2d -- %s\n" ,token.getType(), token.getText());
        }


        /*
        CoolParser parser = new CoolParser(tokensStream);
        ParseTree tree = parser.program();

        System.out.println(tree.toStringTree(parser));
        */
    }

}
