package pyhonFlask.AST_PY;

import java.util.ArrayList;
import java.util.List;

public class Array extends Statement {
    List<Statement> expressions;
    int line;
    public Array(int line) {
        this.expressions = new ArrayList<>();
        this.line = line;
    }

    public void addExpression(Statement expression) {
        this.expressions.add(expression);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Array  \t l(").append(line).append(")\n");
        IdentationTap.level++;
        for(int i=0;i<expressions.size();i++){
            sb.append(IdentationTap.indent()).append(expressions.get(i)).append('\n');
        }
        IdentationTap.level--;

        return sb.toString();
    }
}
