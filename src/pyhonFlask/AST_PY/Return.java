package pyhonFlask.AST_PY;

import java.util.ArrayList;
import java.util.List;

public class Return extends Statement{
    List<Statement> expressions;
    int line;

    public Return(int line){
        this.expressions = new ArrayList<>();
        this.line = line;
    }

    public void addExpression(Statement expression){
        this.expressions.add(expression);
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Return  \t l(").append(line).append(")\n");

        IdentationTap.level++;
        for (int i = 0; i<this.expressions.size();i++) {
                sb.append(IdentationTap.indent()).append(expressions.get(i).toString()).append('\n');
        }
        IdentationTap.level--;

        return sb.toString();
    }

}
