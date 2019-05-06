package helpers.scope;

import translation.TranslationHandler;

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
        TranslationHandler.write(
                String.format(
                        "\r; ======[Enter scope %s]======",
                        ScopeHandler.getCurrentScopeName()
                )
        );
    }

    public static void popScope() {
        TranslationHandler.write(
                String.format(
                        "\r; ======[Exit scope %s]======\n",
                        ScopeHandler.getCurrentScopeName()
                )
        );
        scopes.remove(0);
    }

    public static Reference getReference(String name) {
        int currentScopeIndex = 0;

        while (currentScopeIndex < scopes.size()) {
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
        reference.scopeName = topScope.toString();
    }

    public static String getCurrentScopeName() {
        return scopes.get(0).toString();
    }

    public static void clear() {
        scopes.clear();
    }
}
