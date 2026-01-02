package pyhonFlask.AST_PY;

import pyhonFlask.AST_PY.expression.Identifier;

public class IdentifierAttribute extends Statement{
    Identifier id;
    int line;

    public IdentifierAttribute(Identifier id,int line) {
        this.id = id;
        this.line = line;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IdentifierAttribute  \t l(").append(line).append(")\n");

        IdentationTap.level++;
        sb.append(IdentationTap.indent()).append(id.toString()).append('\n');
        IdentationTap.level--;

        return sb.toString();
    }
}
