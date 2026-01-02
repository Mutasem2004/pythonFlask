package pyhonFlask.Visitor_Py;

import pyhonFlask.AST_PY.Program;
import pyhonFlask.antlr.PythonParser;
import pyhonFlask.antlr.PythonParserBaseVisitor;

public class ProgramVisitor extends PythonParserBaseVisitor<Program> {
    @Override
    public Program visitProgram(PythonParser.ProgramContext ctx) {
        Program program = new Program();
        StatementVisitor statementVisitor = new StatementVisitor();
        for (int i = 0; i < ctx.statement().size(); i++) {
            program.addStatement(statementVisitor.visit(ctx.statement(i)));
        }
        return program;
    }
}
