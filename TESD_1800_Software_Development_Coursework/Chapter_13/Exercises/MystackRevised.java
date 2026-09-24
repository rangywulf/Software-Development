import java.util.ArrayList;

public class MystackRevised implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>(); // store the elements in the stack

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() { // retrieves the elemnt at the top of the stack without removing it.
        return list.get(getSize() - 1);
    }

    public Object pop() { // removes the top element fromt he stack and returns it.
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) { // adds the specified element to the stack
        list.add(o);
    }

    @Override
    public String toString() { // display the contents of the stack.
        return "stack: " + list.toString(); // returns a string representation of all the elements in the array list.
    }

    @Override
    public Object clone(){
        try {
            MystackRevised copy = (MystackRevised) super.clone();
            copy.list = (ArrayList<Object>) list.clone();
            return copy;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}

    

