package helpers.scope;

import java.util.HashMap;
import java.util.Map;

public class Scope {
    private static int nextId = 0;

    public int id;
    private Map<String, Reference> map;

    Scope() {
        this.id = nextId;
        ++nextId;

        this.map = new HashMap<>();
    }

    void addReference(Reference reference) {
        if (this.hasReference(reference.name))
            throw new RuntimeException(
                    String.format(
                            "Reference %s already declared in scope %s",
                            reference.name,
                            this
                    )
            );

        this.map.put(reference.name, reference);
        reference.scopeName = this.toString();
    }

    boolean hasReference(String name) {
        return this.map.containsKey(name);
    }

    Reference getReference(String name) {
        if (!this.hasReference(name))
            throw new RuntimeException(
                    String.format(
                            "Reference %s not declared in scope %s",
                            name,
                            this
                    )
            );

        return this.map.get(name);
    }

    @Override
    public String toString() {
        return String.format("S%d", this.id);
    }

    @SuppressWarnings("WeakerAccess")
    public static void reset() {
        nextId = 0;
    }
}
