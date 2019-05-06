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
        TranslationHandler.writeUnindented(
                String.format(
                        "; ======[Enter scope %s]======",
                        ScopeHandler.getCurrentScopeName()
                )
        );
    }

    public static void popScope() {
        TranslationHandler.writeUnindented(
                String.format(
                        "; ======[Exit scope %s]======\n",
                        ScopeHandler.getCurrentScopeName()
                )
        );
        scopes.remove(0);
    }

    public static Reference getReference(String name) {
        int currentScopeIndex = 0;

        while (currentScopeIndex < scopes.size()) {
            Scope currentScope = scopes.get(currentScopeIndex);
            if (currentScope.hasReference(name)) return currentScope.getReference(name);
            ++currentScopeIndex;
        }

        throw new RuntimeException("Reference " + name + " not found !");
    }

    public static void addReference(Reference reference) {
        scopes.get(0).addReference(reference);
    }

    public static String getCurrentScopeName() {
        return scopes.get(0).toString();
    }

    public static void clear() {
        scopes.clear();
        Scope.reset();
    }
}
