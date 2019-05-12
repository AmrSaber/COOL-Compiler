package translation;

import helpers.scope.Reference;

import java.util.HashSet;
import java.util.Set;

public class Temp {

    private static Set<Integer> taken = new HashSet<>();

    private int index = -1;
    private String constValue = null;
    private Reference reference = null;
    private boolean isReleased = false;

    public Temp(){
        index = 0;
        while (taken.contains(index)) ++index;
        taken.add(index);
    }

    public Temp(String constValue) {
        this.constValue = constValue;
    }

    public Temp(Reference reference) {
        this.reference = reference;
    }


    public void release(){
        if(isReleased)
            throw new RuntimeException("This temp should have been already released");

        if (index != -1) taken.remove(index);
        isReleased = true;
    }

    @Override
    public String toString(){
        if(isReleased)
            throw new RuntimeException("This temp should have been already released");

        if (this.index != -1) return String.format("_t%d", this.index);
        if (this.constValue != null) return this.constValue;
        if (this.reference != null) return this.reference.toString();

        throw new RuntimeException("This temp no valid value!!");
    }
}
