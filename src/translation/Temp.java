package translation;

import java.util.HashSet;
import java.util.Set;

public class Temp {

    private static Set<Integer> taken = new HashSet<>();

    private int index;

    public Temp(){
        index = 0;
        while (taken.contains(index)) ++index;
        taken.add(index);
    }


    public void release(){
        if(index == -1)
            throw new RuntimeException("This temp should have been already released");
        taken.remove(index);
        index = -1;
    }

    @Override
    public String toString(){
        if(index == -1)
            throw new RuntimeException("This temp should have been already released");
        return String.format("_t%d", index);
    }
}
