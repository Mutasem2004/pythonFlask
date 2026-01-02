package pyhonFlask.AST_PY.expression;

import pyhonFlask.AST_PY.Statement;

public class Bool extends Statement {
    boolean bool;
    int line;

    public Bool(boolean bool, int line) {
        this.bool = bool;
        this.line = line;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bool(").append(bool).append(") \t l(").append(line).append(")");
        return sb.toString();
    }
}
