package pyhonFlask.AST_PY;

import pyhonFlask.AST_PY.expression.Identifier;

import java.util.ArrayList;
import java.util.List;

public class FromImport extends Statement{
    Identifier id;
    List<Identifier> attributes;
    ImportElemnets importElemnets;
    int line;

    public FromImport(Identifier id, ImportElemnets importElemnets, int line) {
        this.id = id;
        this.attributes = new ArrayList<>();
        this.importElemnets = importElemnets;
        this.line = line;
    }

    public void addAttribute(Identifier attribute){
        attributes.add(attribute);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FromImport  \t l(").append(line).append(")\n");

        IdentationTap.level++;
       sb.append(IdentationTap.indent()).append(id.toString()).append("\n");
       for(int i = 0; i < attributes.size(); i++){
           sb.append(IdentationTap.indent()).append(attributes.get(i).toString()).append("\n");
       }
       sb.append(IdentationTap.indent()).append(importElemnets.toString()).append("\n");
        IdentationTap.level--;

       return sb.toString();
    }
}
