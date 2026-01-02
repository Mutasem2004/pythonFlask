package pyhonFlask.SymbolTable;


import java.util.*;

public class SymbolTable {

    public static class SymbolEntry {
        private String name;
        private HashMap<String, Object> attributes = new HashMap<>();

        public SymbolEntry(String name) {
            this.name = name;
        }

        public void setAttribute(String key, Object value) {
            attributes.put(key, value);
        }

        public Object getAttribute(String key) {
            return attributes.get(key);
        }

        public String getName() {
            return name;
        }

    }


    private final Stack<Map<String, SymbolEntry>> scopes = new Stack<>();

    public SymbolTable() {
        allocate();
    }


    public void allocate() {
        scopes.clear();
        scopes.push(new HashMap<>());
    }


    public void free() {
        scopes.clear();
    }

    public void pushScope() {
        scopes.push(new HashMap<>());
    }


    public void popScope() {
        if (scopes.size() <= 1) {
            System.out.println("Error: cannot pop global scope or no scope to pop!");
            return;
        }
        scopes.pop();
    }

    public SymbolEntry lookup(String name) {
        for (Map<String, SymbolEntry> scope : scopes) {
            if (scope.containsKey(name)) {
                return scope.get(name);
            }
        }
        return null;
    }


    public SymbolEntry insert(String name) {
        Map<String, SymbolEntry> cur = scopes.peek();


        if (cur.containsKey(name)) {
            return cur.get(name);
        }


        SymbolEntry entry = new SymbolEntry(name);
        cur.put(name, entry);
        return entry;
    }

    public SymbolEntry insertGlobal(String name) {

        Map<String, SymbolEntry> globalScope = scopes.getFirst();


        if (globalScope.containsKey(name)) {
            return globalScope.get(name);
        }

        SymbolEntry entry = new SymbolEntry(name);
        globalScope.put(name, entry);
        return entry;
    }


    public void setAttribute(String name, String key, Object value) {
        SymbolEntry entry = lookup(name);
        if (entry == null) {
            System.out.println("Error: symbol '" + name + "' not defined!");
            return;
        }
        entry.setAttribute(key, value);
    }


    public Object getAttribute(String name, String key) {
        SymbolEntry entry = lookup(name);
        if (entry == null) {
            System.out.println("Error: symbol '" + name + "' not defined!");
            return null;
        }
        return entry.getAttribute(key);
    }


}
