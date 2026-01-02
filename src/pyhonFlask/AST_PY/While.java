package pyhonFlask.AST_PY;

public class While extends Statement {
    Statement condition;
    Block body;
    int line;

    public While(Statement condition, Block body, int line) {
        this.condition = condition;
        this.body = body;
        this.line = line;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("While  \t l(").append(line).append(")\n");

        IdentationTap.level++;
        sb.append(IdentationTap.indent()).append(condition.toString()).append("\n");
        sb.append(IdentationTap.indent()).append(body.toString()).append("\n");
        IdentationTap.level--;

        return sb.toString();
    }
}
