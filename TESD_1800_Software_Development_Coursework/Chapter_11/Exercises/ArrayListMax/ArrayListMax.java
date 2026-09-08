import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMax {
    public static void main(String[] args) {
        // Create scanner
        Scanner input = new Scanner(System.in);

        // Create ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Create Prompt for user
        System.out.print("Enter a number (0 to quit): ");
        int number = input.nextInt();

        // Keep asking for numbers until the user enters 0
        while (number != 0) {
            list.add(number);
            System.out.print("Enter a number (0 to quit): ");
            number = input.nextInt();
        }

        // Call max method
        Integer largest = max(list);
        System.out.println("The largest number is " + largest);
    }

    public static Integer max(ArrayList<Integer> list) {
        // Return null if list doesn't exist or is empty
        if (list == null || list.isEmpty()) {
            return null;
        }

        // Assume first number is the largest
        Integer max = list.get(0);

        // Check the rest of the numbers
        for (int i = 1; i < list.size(); i++) {
            // If this number is bigger, make it the new max
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        // return the largest number
        return max;
    }
}
