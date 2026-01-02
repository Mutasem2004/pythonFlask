package pyhonFlask.AST_PY.expression;

import pyhonFlask.AST_PY.Statement;

public class Number extends Statement {
    String number;
    int line;

    public Number(String number,int line) {
        this.number = number;
        this.line = line;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Number(").append(number).append(") \t l(").append(line).append(")");
        return sb.toString();
    }
}
