package pyhonFlask.AST_PY;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public List<Statement> statements;

    public Program()
    {
        this.statements = new ArrayList<>();

    }


    public void addStatement(Statement st){
        statements.add(st);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Statement st : statements) {
            stringBuilder.append(st.toString());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}