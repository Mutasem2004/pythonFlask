package pyhonFlask.AST_PY.expression;

import pyhonFlask.AST_PY.IdentationTap;
import pyhonFlask.AST_PY.Statement;

import java.util.ArrayList;
import java.util.List;


public class AttributeAccess extends Statement {
    Identifier id;
    List<Statement> attribute;
    FunctionAccess  functionAccess;
    int line;

    public AttributeAccess(Identifier id,FunctionAccess functionAccess, int line) {
        this.id = id;
        this.attribute = new ArrayList<>();
        this.functionAccess = functionAccess;
        this.line = line;
    }

    public void  addAttribute(Statement attribute) {
        this.attribute.add(attribute);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AttributeAccess  \t l(").append(line).append(")\n");
        IdentationTap.level++;
        sb.append(IdentationTap.indent()).append(id.toString()).append('\n');
        for(int i=0;i<attribute.size();i++){
            sb.append(IdentationTap.indent()).append(attribute.get(i).toString()).append('\n');
        }
        if(functionAccess!=null){
            sb.append(IdentationTap.indent()).append(functionAccess.toString()).append('\n');
        }
        IdentationTap.level--;
        return sb.toString();
    }
}
