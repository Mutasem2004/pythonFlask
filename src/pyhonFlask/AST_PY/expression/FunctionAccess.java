package pyhonFlask.AST_PY.expression;

import pyhonFlask.AST_PY.IdentationTap;
import pyhonFlask.AST_PY.Statement;

import java.util.ArrayList;
import java.util.List;

public class FunctionAccess extends Statement {
    Identifier id;
    List<Statement> argaments;
    int line;

    public FunctionAccess(Identifier id,int line) {
        this.id = id;
        this.argaments = new ArrayList<>();
        this.line = line;
    }

    public void addArgament(Statement statement) {
        argaments.add(statement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FunctionAccess  \t l(").append(line).append(")\n");
        IdentationTap.level++;
        sb.append(IdentationTap.indent()).append(id.toString()).append("\n");
        if (argaments != null) {
            for (int i = 0; i < argaments.size(); i++) {
                sb.append(IdentationTap.indent()).append(argaments.get(i)).append('\n');
            }
        }
        IdentationTap.level--;

        return sb.toString();
    }
}
