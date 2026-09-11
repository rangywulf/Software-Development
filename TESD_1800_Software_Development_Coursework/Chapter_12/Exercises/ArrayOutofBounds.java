import java.util.Scanner;

public class ArrayOutofBounds {
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Create an array of 100 integers
        int[] numbers = new int[100];

        // Loop through the array
        for (int i = 0; i < numbers.length; i++) {
            int randomNumber = (int)(Math.random() * 100); // generate a random integer
            numbers[i] = randomNumber; // store the random integer in the current array position
        }
        
        try {
            // Prompt the user to enter an index
            System.out.print("Enter an index to display its value: ");
            int index = input.nextInt(); 
            
            System.out.println(numbers[index]); // Display the element value
        }
        catch (ArrayIndexOutOfBoundsException ex) { // Catch ArrayIndexOutOfBoundsException
            System.out.println("Out of bounds"); // Display error
        }
    }
}
