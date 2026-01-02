package pyhonFlask.AST_PY;

import java.util.ArrayList;
import java.util.List;

public class IfInFunction extends Statement {
    Statement condition;
    BlockConditionInFun body;
    List<ElifInFunction> elifStatements;
    ElseInFunction elseStatement;
    int line;

    public IfInFunction(Statement condition, BlockConditionInFun body,ElseInFunction elseStatement, int line) {
        this.condition = condition;
        this.body = body;
        this.elifStatements = new ArrayList<>();
        this.elseStatement = elseStatement;
        this.line = line;
    }

    public void addElifStatement(ElifInFunction elifStatement) {
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
            for(ElifInFunction elifStatement:elifStatements){
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
