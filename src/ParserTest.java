import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;

public class ParserTest {

    private Lexer lexer;
    private  CommonTokenStream tokens;
    private  CoolParser parser;
    private  String fileName;

    public ParserTest(String fileName)throws IOException {
        this.fileName = fileName;
        CharStream charStream = CharStreams.fromFileName(fileName);
        lexer = new Lexer(fileName);
//        lexer = new CoolLexer(charStream);
//        tokens = new CommonTokenStream(lexer);
//        tokens.fill();
        parser = new CoolParser(lexer.getTokensStream());
        parser.removeErrorListeners();
        parser.addErrorListener(ParsingErrorListener.INSTANCE);
    }

    public void printAST(){
        CoolParser.ProgramContext program = null;
        try {
            program = parser.program();
            String tree = program.toStringTree(parser);
            System.out.println(tree);
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName + "-cst"));
            bw.write(tree);
            bw.close();
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

}


