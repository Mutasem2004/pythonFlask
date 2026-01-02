package pyhonFlask.AST_PY.expression;

import pyhonFlask.AST_PY.IdentationTap;
import pyhonFlask.AST_PY.Statement;

public class Not extends Statement {
    Statement expression;
    int line;

    public Not(Statement expression, int line) {
        this.expression = expression;
        this.line = line;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Not  \t l(").append(line).append(")\n");

        IdentationTap.level++;
        sb.append(IdentationTap.indent()).append(expression.toString()).append("\n");
        IdentationTap.level--;

        return sb.toString();
    }
}
