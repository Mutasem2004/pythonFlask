package pyhonFlask.AST_PY;

import java.util.ArrayList;
import java.util.List;

public class Dictionary extends Statement{
    List<DictionaryElement> elements;
    int line;

    public Dictionary(int line) {
        this.elements = new ArrayList<>();
        this.line = line;
    }

    public void   addElement(DictionaryElement e){
        elements.add(e);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Dictionary  \t l(").append(line).append(")\n");
        IdentationTap.level++;
        for(int i=0;i<elements.size();i++){
            sb.append(IdentationTap.indent()).append(elements.get(i)).append('\n');
        }
        IdentationTap.level--;

        return sb.toString();
    }
}
