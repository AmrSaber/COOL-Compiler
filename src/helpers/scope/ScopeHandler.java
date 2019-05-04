package helpers.scope;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
public class ScopeHandler {

    // private constructor to forbid object creation
    private ScopeHandler() {

    }

    private static List<Map<String, Reference>> scopes;

    static {
        scopes = new LinkedList<>();
    }

    public static void pushScope() {
        Map<String, Reference> newScope = new HashMap<>();
        scopes.add(0, newScope);
    }

    public static void popScope() {
        scopes.remove(0);
    }

    public static Reference getReference(String name) {
        int currentScopeIndex = 0;

        while(currentScopeIndex < scopes.size()) {
            Map<String, Reference> currentScope = scopes.get(currentScopeIndex);
            if (currentScope.containsKey(name))
                return currentScope.get(name);
            ++currentScopeIndex;
        }

        throw new RuntimeException("Reference " + name + " not found !");
    }

    public static void addReference(Reference reference) {
        Map<String, Reference> topScope = scopes.get(0);
        topScope.put(reference.name, reference);
    }

    public static void clear() {
        scopes.clear();
    }
}
