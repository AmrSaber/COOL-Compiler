package helpers.scope;

import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("unused")
public class ScopeHandler {

    // private constructor to forbid object creation
    private ScopeHandler() {

    }

    private static List<Scope> scopes;

    static {
        scopes = new LinkedList<>();
    }

    public static void pushScope() {
        Scope newScope = new Scope();
        scopes.add(0, newScope);
    }

    public static void popScope() {
        scopes.remove(0);
    }

    public static Reference getReference(String name) {
        int currentScopeIndex = 0;

        while(currentScopeIndex < scopes.size()) {
            Scope currentScope = scopes.get(currentScopeIndex);
            if (currentScope.map.containsKey(name)) {
                Reference reference = currentScope.map.get(name);
                reference.scopeName = currentScope.toString();
                return reference;
            }
            ++currentScopeIndex;
        }

        throw new RuntimeException("Reference " + name + " not found !");
    }

    public static void addReference(Reference reference) {
        Scope topScope = scopes.get(0);
        topScope.map.put(reference.name, reference);
    }

    public static void clear() {
        scopes.clear();
    }
}
