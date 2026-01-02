package pyhonFlask.AST_PY;

import pyhonFlask.AST_PY.expression.Identifier;

import java.util.ArrayList;
import java.util.List;

public class FunctionDef extends Statement {
    Identifier name;
    List<Parameter> parameters;
    BlockFun body;
    int line;

    public FunctionDef(Identifier name, BlockFun body, int line) {
        this.name = name;
        this.parameters = new ArrayList<>();
        this.body = body;
        this.line = line;
    }

    public void addParameter(Parameter parameter) {
        this.parameters.add(parameter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FunctionDef  \t l(").append(line).append(")\n");

        IdentationTap.level++;
        sb.append(IdentationTap.indent()).append(name).append('\n');
        for(int i=0;i<parameters.size();i++){
            sb.append(IdentationTap.indent()).append(parameters.get(i)).append('\n');
        }
        sb.append(IdentationTap.indent()).append(body).append('\n');
        IdentationTap.level--;

        return sb.toString();
    }
}
