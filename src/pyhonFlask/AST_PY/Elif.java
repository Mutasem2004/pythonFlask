package pyhonFlask.AST_PY;

public class Elif extends Statement {
    Statement condition;
    BlockCondition body;
    int line;

    public Elif(Statement condition, BlockCondition body, int line) {
        this.condition = condition;
        this.body = body;
        this.line = line;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Elif  \t l(").append(line).append(")\n");

        IdentationTap.level++;
        sb.append(IdentationTap.indent()).append(condition.toString()).append("\n");
        sb.append(IdentationTap.indent()).append(body.toString()).append("\n");
        IdentationTap.level--;

        return sb.toString();
    }
}
