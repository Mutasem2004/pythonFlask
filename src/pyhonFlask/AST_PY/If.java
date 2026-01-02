package pyhonFlask.AST_PY;

import java.util.ArrayList;
import java.util.List;

public class If extends Statement {
    Statement condition;
    BlockCondition body;
    List<Elif> elifStatements;
    Else elseStatement;
    int line;

    public If(Statement condition, BlockCondition body,Else elseStatement, int line) {
        this.condition = condition;
        this.body = body;
        this.elifStatements = new ArrayList<>();
        this.elseStatement = elseStatement;
        this.line = line;
    }

    public void addElifStatement(Elif elifStatement) {
        this.elifStatements.add(elifStatement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("If  \t l(").append(line).append(")\n");

        IdentationTap.level++;
        sb.append(IdentationTap.indent()).append(condition).append('\n');
        sb.append(IdentationTap.indent()).append(body.toString()).append('\n');
        if(!elifStatements.isEmpty()){
            for(Elif elifStatement:elifStatements){
                sb.append(IdentationTap.indent()).append(elifStatement.toString()).append('\n');
            }
        }

        if(elseStatement!=null){
            sb.append(IdentationTap.indent()).append(elseStatement.toString()).append('\n');
        }
        IdentationTap.level--;

        return sb.toString();
    }
}
