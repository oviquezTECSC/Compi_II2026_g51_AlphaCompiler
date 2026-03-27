package syntaxchecker;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import syntaxchecker.generated.AlphaCompilerLexer;
import syntaxchecker.generated.AlphaCompilerParser;

import java.util.LinkedList;

public class AlphaErrorListener extends BaseErrorListener {
    private LinkedList<String> errorList = new LinkedList<>();

    public boolean hasErrors() {
        return !errorList.isEmpty();
    }

    public LinkedList<String> getErrorList() {
        return errorList;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        if (recognizer instanceof AlphaCompilerLexer){
            this.errorList.add(
                    "SCANNER ERROR: " +
                            msg+
                            " (line: "+
                            line+
                            " , column: "+
                            charPositionInLine+
                            ")"
            );
        }else if (recognizer instanceof AlphaCompilerParser){
            this.errorList.add(
                    "PARSER ERROR: " +
                            msg+
                            " (line: "+
                            line+
                            " , column: "+
                            charPositionInLine+
                            ")"
            );
        }
    }
}
