package helpers.scope;

@SuppressWarnings("ALL")
public class Reference {
    public String name;
    public String type;

    public String scopeName;

    public Reference(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%s_%s", this.scopeName, this.name);
    }
}
