package helpers.scope;

import java.util.List;

@SuppressWarnings("ALL")
public class Reference {
    public String name;
    public String type;

    public boolean isFunction;
    public List<Reference> params;
    public String returnType;

    public Reference(String name, String type) {
        this.name = name;
        this.type = type;
        this.isFunction = false;

        this.params = null;
        this.returnType = null;
    }

    public Reference(String name, List<Reference> params, String returnType) {
        this.name = name;
        this.params = params;
        this.returnType = returnType;
        this.isFunction = true;

        this.type = null;
    }
}
