package translation;

import java.util.LinkedList;

public class Temp {
    /**
     * class Temp:
     *      this class holds static data for the allocation of temporary variables
     *      as well as data members to hold temp variable data which is basically its
     *      index number.
     *
     *  next: number of next temp to be allocated
     *  free: a linked list holding the released temps
     *
     * */

    private static int next = 0;
    private static LinkedList<Integer> free = new LinkedList<>();

    private int index;

    /**
     * this function checks is called to allocate a temp variable
     * when it's called it checks if there are aby freed temp variables in free list
     * if this is the case then use one of them, and remove it from list
     * otherwise allocate a new one and increment next.
     */
    public Temp(){
        if(free.isEmpty()) {
            index = next;
            next += 1;
        }else{
            index = free.pop();
        }
    }


    /**
     * this function is supposed to free this object.
     * as this object is now freed it adds it to free list
     * assigns -1 to index to mark it as freed.
     *
     * exception: RuntimeException : is thrown if the object is already freed once.
     */
    public void release(){
        if(index == -1)
            throw new RuntimeException("this temp should have been already released");
        free.add(index);
        index = -1;
    }

    @Override
    public String toString(){
        if(index == -1)
            throw new RuntimeException("this temp should have been already released");
        return String.format("_t%d", index);
    }
}
