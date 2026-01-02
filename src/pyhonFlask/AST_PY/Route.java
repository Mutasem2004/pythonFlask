package pyhonFlask.AST_PY;

import pyhonFlask.AST_PY.expression.FunctionAccess;
import pyhonFlask.AST_PY.expression.Identifier;

public class Route extends Statement{
    Identifier id;
    FunctionAccess functionAccess;
    int line;

    public Route(Identifier id,FunctionAccess functionAccess, int line) {
        this.id = id;
        this.functionAccess = functionAccess;
        this.line = line;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Route  \t l(").append(line).append(")\n");

        IdentationTap.level++;
        sb.append(IdentationTap.indent()).append(id.toString()).append('\n');
        sb.append(IdentationTap.indent()).append(functionAccess.toString()).append('\n');
        IdentationTap.level--;

        return sb.toString();
    }
}
