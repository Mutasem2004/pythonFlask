package pyhonFlask.AST_PY;

public class Else extends Statement{
    BlockCondition body ;
    int line;

    public Else(BlockCondition body, int line) {
        this.body=body;
        this.line=line;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Else  \t l(").append(line).append(")\n");

        IdentationTap.level++;
        sb.append(IdentationTap.indent()).append(body.toString()).append("\n");
        IdentationTap.level--;

        return sb.toString();
    }
}
