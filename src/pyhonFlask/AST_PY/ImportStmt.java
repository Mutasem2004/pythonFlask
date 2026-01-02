package pyhonFlask.AST_PY;

import pyhonFlask.AST_PY.expression.Identifier;

public class ImportStmt extends Statement{
    Identifier identifier;
    int line;

    public ImportStmt(Identifier identifier, int line){
        this.identifier = identifier;
        this.line = line;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("ImportStmt  \t l(").append(line).append(")\n");

        IdentationTap.level++;
        sb.append(IdentationTap.indent()).append(identifier.toString()).append("\n");
        IdentationTap.level--;

        return sb.toString();
    }
}
