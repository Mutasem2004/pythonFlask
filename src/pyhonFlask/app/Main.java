package pyhonFlask.app;

import pyhonFlask.AST_PY.Program;
import pyhonFlask.Visitor_Py.ProgramVisitor;
import pyhonFlask.antlr.PythonLexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import pyhonFlask.antlr.PythonParser;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static void main(String[] args) throws IOException {

        String path = "tests/test3.txt";
        CharStream input = fromFileName(path);
        PythonLexer lexer = new PythonLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        PythonParser parser = new PythonParser(tokens);
        //comment

        ParseTree tree = parser.program();
        ProgramVisitor programVisitor = new ProgramVisitor();
        Program program = programVisitor.visit(tree);
        System.out.println(program);

    }
}
