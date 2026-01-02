package pyhonFlask.AST_PY;

import pyhonFlask.AST_PY.expression.Identifier;

import java.util.ArrayList;
import java.util.List;

public class AssignmentOpj extends Statement{
    Identifier id;
    List<Statement> attribute;
    Statement expression;
    int line;

    public AssignmentOpj(Identifier id, Statement expression, int line) {
        this.id = id;
        this.attribute = new ArrayList<>();
        this.expression = expression;
        this.line = line;
    }

    public void addAttribute(Statement attribute) {
        this.attribute.add(attribute);
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AssignmentOpj  \t l(").append(line).append(")\n");

        IdentationTap.level++;
        sb.append(IdentationTap.indent()).append(id.toString()).append('\n');
        for(int j=0;j<attribute.size();j++){
            sb.append(IdentationTap.indent()).append(attribute.get(j).toString()).append('\n');
        }
        sb.append(IdentationTap.indent()).append(expression.toString()).append('\n');
        IdentationTap.level--;

        return sb.toString();
    }
}
