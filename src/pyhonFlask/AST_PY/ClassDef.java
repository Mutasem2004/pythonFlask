package pyhonFlask.AST_PY;

import pyhonFlask.AST_PY.expression.Identifier;

import java.util.ArrayList;
import java.util.List;

public class ClassDef extends Statement{
    Identifier id ;
    List<Inheritance> inheritances;
    Block body;
    int line;

    public ClassDef(Identifier id,Block body,int line) {
        this.id = id;
        this.inheritances = new ArrayList<>();
        this.body = body;
        this.line = line;

    }

    public void addInheritance(Inheritance inheritance) {
        this.inheritances.add(inheritance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ClassDef  \t l(").append(line).append(")\n");

        IdentationTap.level++;
        sb.append(IdentationTap.indent()).append(id).append('\n');
        if(inheritances!=null){
            for(int i=0;i<inheritances.size();i++){
                sb.append(IdentationTap.indent()).append(inheritances.get(i)).append('\n');
            }
        }

        sb.append(IdentationTap.indent()).append(body).append('\n');
        IdentationTap.level--;

        return sb.toString();
    }


}
