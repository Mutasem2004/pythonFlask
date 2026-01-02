package pyhonFlask.AST_PY.expression;

import pyhonFlask.AST_PY.Statement;

public class StringValue extends Statement {
    String value;
    int line;

    public StringValue(String value,int line)
    {
        this.value=value;
        this.line=line;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("String(").append(value).append(") \t l(").append(line).append(")");
        return sb.toString();
    }
}
