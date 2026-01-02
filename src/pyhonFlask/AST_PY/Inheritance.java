package pyhonFlask.AST_PY;

import pyhonFlask.AST_PY.expression.Identifier;

public class Inheritance extends Statement{
    Identifier id ;
    int line;

    public Inheritance(Identifier id, int line) {
        this.id = id;
        this.line = line;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Inheritance  \t l(").append(line).append(")\n");

        IdentationTap.level++;
        sb.append(IdentationTap.indent()).append(id.toString()).append("\n");
        IdentationTap.level--;

        return sb.toString();
    }
}
