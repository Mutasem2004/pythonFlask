package pyhonFlask.AST_PY;

public class WhileInFun extends Statement {
    Statement condition;
    BlockFun body;
    int line;

    public WhileInFun(Statement condition, BlockFun body, int line) {
        this.condition = condition;
        this.body = body;
        this.line = line;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("WhileInFun  \t l(").append(line).append(")\n");

        IdentationTap.level++;
        sb.append(IdentationTap.indent()).append(condition.toString()).append("\n");
        sb.append(IdentationTap.indent()).append(body.toString()).append("\n");
        IdentationTap.level--;

        return sb.toString();
    }
}
