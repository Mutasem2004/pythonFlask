package pyhonFlask.AST_PY;

public class IdentationTap {
    public static int level = 0;

    public static String indent() {
        return "\t".repeat(level);
    }
}
