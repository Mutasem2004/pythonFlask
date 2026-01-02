package pyhonFlask.AST_PY;

import pyhonFlask.AST_PY.expression.Identifier;

public class ForInFun extends Statement {
    Identifier id;
    Statement expression;
    BlockFun body;
    int line;

    public ForInFun(Identifier id, Statement expression, BlockFun body, int line) {
        this.id = id;
        this.expression = expression;
        this.body = body;
        this.line = line;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("ForInFun  \t l(").append(line).append(")\n");

        IdentationTap.level++;
        sb.append(IdentationTap.indent()).append(id.toString()).append("\n");
        sb.append(IdentationTap.indent()).append(expression.toString()).append("\n");
        sb.append(IdentationTap.indent()).append(body.toString()).append("\n");
        IdentationTap.level--;

        return sb.toString();
    }
}
