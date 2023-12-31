import generatedMiniPython.MiniPythonLexer;
import generatedMiniPython.MiniPythonParser;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;


public class ErrorListener extends BaseErrorListener {

    public ArrayList<String> errorMsgs = new ArrayList<>();

    public ErrorListener ( ) {
        this.errorMsgs = new ArrayList<String>();
    }

    public void addContextualError (String msg) {
        errorMsgs.add(new String("CONTEXTUAL ERROR: " +  msg));
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        if(recognizer instanceof MiniPythonParser)
            errorMsgs.add(new String("PARSER ERROR - LINE" + line+":"+charPositionInLine + " " + msg));
        else if (recognizer instanceof MiniPythonLexer)
            errorMsgs.add(new String("SCANNER ERROR - LINE" + line+":"+charPositionInLine + " " + msg));
        else
            errorMsgs.add(new String("Other Error"));
    }

    public boolean hasErrors () {return  this.errorMsgs.size() > 0 ;}

    public ArrayList<String> getErrorMsgs(){return this.errorMsgs;}

    @Override
    public String toString() {
        if (!hasErrors()) return "0 errors";
        StringBuilder builder = new StringBuilder();

        for (String s: errorMsgs){
            builder.append( String.format("%s\n", s));
        }
        return builder.toString();
    }
}
