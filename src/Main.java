import syntaxchecker.AlphaErrorListener;
import syntaxchecker.generated.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import typechecker.AlphaCompilerTypeChecker;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            // 1️⃣ Leer archivo test.txt
            CharStream input = CharStreams.fromFileName("test.txt");

            // 2️⃣ Crear lexer
            AlphaCompilerLexer lexer = new AlphaCompilerLexer(input);

            // 3️⃣ Crear flujo de tokens
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // 4️⃣ Crear parser
            AlphaCompilerParser parser = new AlphaCompilerParser(tokens);

            AlphaErrorListener errors = new AlphaErrorListener();
            lexer.removeErrorListeners();
            parser.removeErrorListeners();
            lexer.addErrorListener(errors);
            parser.addErrorListener(errors);

            // 7️⃣ Llamar regla inicial (CAMBIA por la tuya)
            ParseTree tree = parser.program();

            if (errors.hasErrors()){
                for (String e: errors.getErrorList()) {
                    System.out.println(e);
                }
                System.out.println("Compilation failed!");
            }else{
                AlphaCompilerTypeChecker typechecker = new AlphaCompilerTypeChecker();
                typechecker.visit(tree);
                if (typechecker.hasErrors()) {
                    System.out.println("Compilation failed!");
                    for(String err : typechecker.getErrorList()){
                        System.out.println(err);
                    }
                } else {
                    //todo: genere código
                    System.out.println("Compilation succesful!");
                }
            }

        } catch (IOException e) {
            System.err.println("No se pudo leer el archivo: " + e.getMessage());
        }
    }
}