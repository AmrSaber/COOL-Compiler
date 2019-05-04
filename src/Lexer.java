import gen.CoolLexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lexer {
    private CoolLexer lexer;
    private CommonTokenStream tokensStream;
    private List<Token> tokens;
    private List<Token> errors;
    private List<String> outTokens;

    public Lexer(String fileName)throws IOException {
        CharStream charStream = CharStreams.fromFileName(fileName);
        lexer = new CoolLexer(charStream);
        tokensStream = new CommonTokenStream(lexer);
        tokensStream.fill();
        tokens = tokensStream.getTokens();
        lex();
    }

    public List<String> getTokens(){
        return outTokens;
    }

    public CommonTokenStream getTokensStream() { return  tokensStream; }

    public List<String> getTokens(String outputFile) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        for(String token : outTokens){
            writer.write(token + "\n");
        }
        writer.close();
        return outTokens;
    }

    public boolean hasErrors(){return !errors.isEmpty();}

    public void reportErrors(){
        for(Token errorToken : errors){
            System.out.println("Lexer ERROR: Line "
                    + errorToken.getLine()
                    + " - invalid character "
                    + errorToken.getText());
        }
    }

    private void lex(){
        outTokens = new ArrayList<>();
        errors = new ArrayList<>();
        String [] ruleNames = lexer.getRuleNames();
        for(Token token : tokens){
            if(token.getType() > 0){        //Not EOF
                if(lexer.getRuleNames()[token.getType()-1].equals("ErrorChar")){
                    errors.add(token);
                }else{
                    outTokens.add(Integer.toString(token.getLine()));
                    outTokens.add(ruleNames[token.getType()-1]);
                    if(shouldBeTriplet(ruleNames[token.getType()]))
                        outTokens.add(token.getText());
                }
            }
        }
    }

    private boolean shouldBeTriplet(String  tokenName){
        if(tokenName.equals("SELF")
          || tokenName.equals("STRING")
          || tokenName.equals("NUM")
          || tokenName.equals("LITERAL")
          || tokenName.equals("ID"))
            return true;
        return false;
    }
}
