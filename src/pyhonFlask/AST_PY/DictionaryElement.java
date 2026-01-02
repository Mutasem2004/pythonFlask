package pyhonFlask.AST_PY;

public class DictionaryElement extends Statement{
    Statement key;
    Statement value;
    int line;

    public DictionaryElement(Statement key,Statement value, int line) {
        this.key=key;
        this.value=value;
        this.line=line;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("DictionaryElement  \t l(").append(line).append(")\n");

        IdentationTap.level++;
        sb.append(IdentationTap.indent()).append(key.toString()).append("\n");
        sb.append(IdentationTap.indent()).append(value.toString()).append("\n");
        IdentationTap.level--;

        return sb.toString();
    }
}
