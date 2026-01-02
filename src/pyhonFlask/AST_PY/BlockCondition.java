package pyhonFlask.AST_PY;

import java.util.ArrayList;
import java.util.List;

public class BlockCondition extends Statement{
    List<Statement> statements;
    int line;

    public BlockCondition(int line) {
        statements = new ArrayList<>();
        this.line = line;
    }

    public void add(Statement st) {
        statements.add(st);
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BlockCondition  \t l(").append(line).append(")\n");

        IdentationTap.level++;

        for (Statement st : statements) {
            sb.append(IdentationTap.indent()).append(st.toString()).append("\n");
        }
        IdentationTap.level--;

        return sb.toString();
    }
}
