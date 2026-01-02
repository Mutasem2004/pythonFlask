package pyhonFlask.AST_PY;

import pyhonFlask.AST_PY.expression.Identifier;

public class ListIndexAttribute extends Statement{
    Identifier id;
    Statement index;
    int line;

    public ListIndexAttribute(Identifier id, Statement index,int line) {
        this.id = id;
        this.index = index;
        this.line = line;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ListIndexAttribute  \t l(").append(line).append(")\n");

        IdentationTap.level++;
        sb.append(IdentationTap.indent()).append(id.toString()).append('\n');
        sb.append(IdentationTap.indent()).append(index.toString()).append('\n');
        IdentationTap.level--;

        return sb.toString();
    }
}
