package helpers.scope;

import java.util.HashMap;
import java.util.Map;

public class Scope {
    private static int nextId = 0;

    public int id;
    public Map<String, Reference> map;

    public Scope() {
        this.id = nextId;
        ++nextId;

        this.map = new HashMap<>();
    }

    @Override
    public String toString() {
        return String.format("S%d", this.id);
    }
}
