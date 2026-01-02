package pyhonFlask.AST_PY;

import pyhonFlask.AST_PY.expression.Identifier;

import java.util.ArrayList;
import java.util.List;

public class GlobalIdentifier extends Statement{
    List<Identifier> identifiers;
    int line;

    public GlobalIdentifier(int line){
        this.identifiers = new ArrayList<>();
        this.line=line;
    }

    public void addIdentifier(Identifier id){
        this.identifiers.add(id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GlobalIdentifier  \t l(").append(line).append(")\n");

        IdentationTap.level++;
        for(int i = 0; i < identifiers.size(); i++) {
            sb.append(IdentationTap.indent()).append(identifiers.get(i).toString()).append('\n');
        }
        IdentationTap.level--;

        return sb.toString();
    }
}
