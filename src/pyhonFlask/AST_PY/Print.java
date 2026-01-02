package pyhonFlask.AST_PY;

import java.util.ArrayList;
import java.util.List;

public class Print extends Statement {
    List<Statement> expresions ;
    int line;
    public Print(int line) {
        expresions = new ArrayList<>();
        this.line = line;
    }

    public void addExpresion(Statement expresion){
        expresions.add(expresion);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Print  \t l(").append(line).append(")\n");
        IdentationTap.level++;
        for(int i=0;i<expresions.size();i++){
            sb.append(IdentationTap.indent()).append(expresions.get(i).toString()).append("\n");
        }
        IdentationTap.level--;
        return sb.toString();
    }
}