import gen.CoolParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@SuppressWarnings("ALL")
public class Parser {

    private CoolParser coolParser;
    private ParseTree cachedParseTree;

    public Parser(Lexer lexer) {
        coolParser = new CoolParser(lexer.getTokensStream());

        coolParser.removeErrorListeners();
        coolParser.addErrorListener(ParsingErrorListener.INSTANCE);
    }

    public String getAST() {
        CoolParser.ProgramContext program = coolParser.program();
        String tree = program.toStringTree(coolParser);
        return tree;
    }

    public void writeAST(String fileName){
        String tree = getAST();

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(tree);
            bw.close();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public ParseTree parse() {
        // coolParser.addParseListener(new CoolBaseListener());
        if (cachedParseTree == null) cachedParseTree = coolParser.globals();
        return cachedParseTree;
    }

}


