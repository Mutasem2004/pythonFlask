package pyhonFlask.AST_PY.expression;

import pyhonFlask.AST_PY.Statement;

public class Negative extends Statement {
    Statement statement;

    public Negative(Statement operand) {
        this.statement = operand;
    }

    @Override
    public String toString() {
        return "-" + statement.toString();
    }
}