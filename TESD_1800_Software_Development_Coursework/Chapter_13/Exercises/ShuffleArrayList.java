import java.util.ArrayList;

public class ShuffleArrayList {
    // Write the following method that shuffles an ArrayList of numbers
    public static void shuffle(ArrayList<Number> list) {
        ArrayList<Number> numbersArray = new ArrayList<>();
        numbersArray.add(1);
        numbersArray.add(2);
        numbersArray.add(54);
        numbersArray.add(234);
        numbersArray.add(179);

        // An empty list to hold the shuffled result
        ArrayList<Number> shuffled = new ArrayList<>();

        // Keep going until all OG list is empty
        while (numbersArray.size() > 0) {
            int randomIndex = (int) (Math.random() * numbersArray.size());
            Number pulled = numbersArray.remove(randomIndex);
            shuffled.add(pulled);
        }

        System.out.println(shuffled);
    }
}
