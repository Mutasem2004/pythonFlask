package pyhonFlask.AST_PY;

import java.util.ArrayList;
import java.util.List;

public class AssignmentListIdx extends Statement{
    ListIndex listIndex ;
    List<Statement> attributes;
    Statement expression;
    int line;

    public AssignmentListIdx(ListIndex listIndex, Statement expression,int line) {
        this.listIndex = listIndex;
        this.attributes = new ArrayList<>();
        this.expression = expression;
        this.line = line;
    }

    public void addAttribute(Statement attribute){
        this.attributes.add(attribute);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AssignmentListIdx  \t l(").append(line).append(")\n");

        IdentationTap.level++;
        sb.append(IdentationTap.indent()).append(listIndex.toString()).append("\n");
        for(Statement attribute : attributes){
            sb.append(IdentationTap.indent()).append(attribute.toString()).append("\n");
        }
        sb.append(IdentationTap.indent()).append(expression.toString()).append("\n");
        IdentationTap.level--;

        return sb.toString();
    }
}
