package pyhonFlask.AST_PY;

import java.util.ArrayList;
import java.util.List;

public class BlockFun extends Statement {
    List<Statement> statements;
    Return ret;
    int line;

    public BlockFun(Return ret,int line) {
        statements = new ArrayList<>();
        this.ret = ret;
        this.line = line;
    }

    public void add(Statement st) {
        statements.add(st);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BlockFun  \t l(").append(line).append(")\n");

        IdentationTap.level++;

        for (Statement st : statements) {
            sb.append(IdentationTap.indent()).append(st.toString()).append("\n");
        }
        if(ret != null) {
            sb.append(IdentationTap.indent()).append(ret.toString()).append("\n");
        }
        IdentationTap.level--;

        return sb.toString();
    }
}
