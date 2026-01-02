package pyhonFlask.AST_PY;

import pyhonFlask.AST_PY.expression.Identifier;

public class AssignmentID extends Statement {
    Identifier id;
    Statement expression;
    int line;

    public AssignmentID(Identifier id, Statement expression,int line) {
        this.id = id;
        this.expression = expression;
        this.line = line;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("AssignmentID  \t l(").append(line).append(")\n");
        IdentationTap.level++;
        sb.append(IdentationTap.indent()).append(id.toString()).append('\n');
        sb.append(IdentationTap.indent()).append(expression.toString()).append('\n');
        IdentationTap.level--;
        return sb.toString();
    }
}