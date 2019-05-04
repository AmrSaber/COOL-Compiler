package Translation;

import org.antlr.v4.runtime.tree.ParseTree;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;


public class TranslationHandler {
    private static BufferedWriter output_stream = new BufferedWriter(new OutputStreamWriter(System.out));

    public void translate(ParseTree tree) throws Exception{
        throw new NotImplementedException();
    }

    /**
     * this function is supposed to write the string given to it to
     * the set stream.
     * */
    void write(String s) throws Exception{
        output_stream.write(s);
    }

    /**
     * sets the stream to write the  address code to it.
     * */
    void setStream(OutputStream s){
        output_stream = new BufferedWriter(new OutputStreamWriter(s));
    }
}
