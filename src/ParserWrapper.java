import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@SuppressWarnings("ALL")
public class ParserWrapper {

    private  CoolParser coolParser;
    private  String fileName;

    public ParserWrapper(String fileName)throws IOException {
        this.fileName = fileName;
        Lexer lexer = new Lexer(fileName);
        coolParser = new CoolParser(lexer.getTokensStream());
        coolParser.removeErrorListeners();
        coolParser.addErrorListener(ParsingErrorListener.INSTANCE);
    }

    public void printAST(){
        try {
            CoolParser.ProgramContext program = coolParser.program();
            String tree = program.toStringTree(coolParser);

            System.out.println(tree);
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName + "-cst"));
            bw.write(tree);
            bw.close();
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    public void dfs() {
        dfs_rec(coolParser.program());
    }

    private void dfs_rec(ParseTree tree) {
        if (tree.getChildCount() == 0) System.out.println(tree.getText());
        for (int i = 0 ; i < tree.getChildCount() ; ++i) {
            ParseTree child = tree.getChild(i);
            dfs_rec(child);
        }
    }

}


