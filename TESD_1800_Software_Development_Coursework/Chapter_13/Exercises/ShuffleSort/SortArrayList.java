import java.util.ArrayList;
public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();

        // Autoboxing wraps these into Integer and Double objects
        list.add(8);
        list.add(2.5);
        list.add(-4);
        list.add(10.75);
        list.add(3);

        System.out.println("Before: " + list);
        sort(list);
        System.out.println("After:  " + list);
    }

    public static void sort (ArrayList<Number> list) {
       // i marks the start of the "Not yet sorted" part of the list
        for (int i = 0; i < list.size() - 1; i++) {
            // Assume the smallest item is the one at position i
            int minIndex = i;

            // Scan everything to the right of i, looking for something smaller
            for (int j = i + 1; j < list.size(); j++) {
                // Convert both to double so we can use the < operator
                if (list.get(j).doubleValue() < list.get(minIndex).doubleValue()) {
                    minIndex = j; // remember where the new smallest item lives
                }
            }

            // Swap the smallest item into position i (skip if already there)
            if (minIndex != i) {
                Number temp = list.get(i); // save item i
                list.set(i, list.get(minIndex)); // move smallest into slot i
                list.set(minIndex, temp); // put saved item where smallest was
            }
       }
       
    }
}
