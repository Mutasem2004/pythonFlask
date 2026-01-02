package pyhonFlask.AST_PY.expression;

import pyhonFlask.AST_PY.Statement;
public class Identifier extends Statement{
    public String id;
    int line;

    public Identifier(String id, int line) {
        this.id = id;
        this.line = line;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Identifier(").append(id).append(") \t l(").append(line).append(")");
        return sb.toString();
    }
}
