
import org.antlr.v4.runtime.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception{
        String srcFile = "cool_source/bad.cl";
        if(args.length >= 1)    srcFile = args[0];

        String inputFileName = srcFile;

        CharStream input = CharStreams.fromFileName(inputFileName);
        CoolLexer lexer = new CoolLexer(input);

        CommonTokenStream tokensStream = new CommonTokenStream(lexer);
        tokensStream.fill();

        List<Token> tokens = tokensStream.getTokens();

        if(isGoodCode(tokens)){
            BufferedWriter writer = new BufferedWriter(new FileWriter(inputFileName+"-lex"));
            for(Token token: tokens){
                if(token.getType() > 0){
                    writer.write(token.getLine() + "\n");
                    writer.write(lexer.getRuleNames()[token.getType() - 1].toLowerCase() + "\n");
                    if (shouldBeTriplet(token.getType()))
                        writer.write(token.getText() + "\n");
                }
            }
            writer.close();
        }else{
            for(Token token: tokens){
                if(token.getType() > 0 && isError(token.getType()))
                    System.out.println("ERROR : " + token.getLine() + ": Lexer: invalid character " + token.getText());
            }
        }


        /*
        CoolParser parser = new CoolParser(tokensStream);
        ParseTree tree = parser.program();

        System.out.println(tree.toStringTree(parser));
        */
    }

    public static boolean shouldBeTriplet(int typeID){
        switch (typeID){
            case 50: case 6 : case 7 : case 48 : case 9 :
                return true;
            default: return false;
        }
    }

    public static boolean isError(int typeID){
        return typeID == 52;
    }

    public static boolean isGoodCode(List<Token> tokens){
        for(Token token : tokens){
            if(isError(token.getType()))
                return false;
        }
        return true;
    }
}
