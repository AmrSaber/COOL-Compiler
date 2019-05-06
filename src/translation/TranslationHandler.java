package translation;

import org.antlr.v4.runtime.tree.ParseTree;
import translation.translators.ExprTranslator;
import translation.translators.GlobalsTranslator;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;


@SuppressWarnings("unused")
public class TranslationHandler {
    private static BufferedWriter output_stream = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int nextLabel = 0;
    private static int indentations = 0;

    public static void translate(ParseTree tree) {
        new GlobalsTranslator(tree).generate();

        try {
            output_stream.flush();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    /**
     * this function is supposed to write the string given to it to
     * the set stream.
     * */
    public static void write(String text) {
        // generate indentations
        StringBuilder indents = new StringBuilder();
        for (int i = 0 ; i < indentations ; ++i) indents.append("\t");

        try{
            output_stream.write(String.format("%s%s\n", indents, text));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * sets the stream to write the  address code to it.
     * */
    public static void setStream(OutputStream s){
        output_stream = new BufferedWriter(new OutputStreamWriter(s));
    }

    /**
     * get the next unused label for branching
     * @return next unused label
     */
    public static String getNewLabel() {
        ++nextLabel;
        return "_L" + (nextLabel - 1);
    }

    public static void addIndentation() {
        ++indentations;
    }

    public static void removeIndentation(){
        --indentations;
    }
}
