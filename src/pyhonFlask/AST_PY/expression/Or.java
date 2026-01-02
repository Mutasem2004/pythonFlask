package pyhonFlask.AST_PY.expression;

import pyhonFlask.AST_PY.IdentationTap;
import pyhonFlask.AST_PY.Statement;

public class Or extends Statement {
    Statement left;
    Statement right;
    int line;

    public Or(Statement left, Statement right,int line) {
        this.left = left;
        this.right = right;
        this.line = line;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Or  \t l(").append(line).append(")\n");

        IdentationTap.level++;
        sb.append(IdentationTap.indent()).append(left.toString()).append("\n");
        sb.append(IdentationTap.indent()).append(right.toString()).append("\n");
        IdentationTap.level--;

        return sb.toString();
    }
}
