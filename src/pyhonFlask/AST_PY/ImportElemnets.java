package pyhonFlask.AST_PY;

import pyhonFlask.AST_PY.expression.Identifier;

import java.util.ArrayList;
import java.util.List;

public class ImportElemnets extends Statement{
    List<Identifier> attributes;
    int line;

    public ImportElemnets(int line) {
        this.attributes = new ArrayList<>();
        this.line = line;
    }

    public void  addAttribute(Identifier id) {
        this.attributes.add(id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ImportElemnets  \t l(").append(line).append(")\n");

        IdentationTap.level++;
        for(int i = 0; i < this.attributes.size(); i++){
            sb.append(IdentationTap.indent()).append(attributes.get(i).toString()).append('\n');
        }
        IdentationTap.level--;

        return sb.toString();
    }
}
