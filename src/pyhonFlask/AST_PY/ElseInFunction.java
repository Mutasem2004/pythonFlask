package pyhonFlask.AST_PY;

public class ElseInFunction extends Statement{
    BlockConditionInFun body ;
    int line;

    public ElseInFunction(BlockConditionInFun body, int line) {
        this.body=body;
        this.line=line;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("ElseInFunction  \t l(").append(line).append(")\n");

        IdentationTap.level++;
        sb.append(IdentationTap.indent()).append(body.toString()).append("\n");
        IdentationTap.level--;

        return sb.toString();
    }
}
