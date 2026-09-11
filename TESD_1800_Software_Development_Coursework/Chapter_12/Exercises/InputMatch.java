import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMatch {
    /** Main Method */
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Create variables
        int a = 0;
        int b = 0;

        while (true) {
            try {
                // Prompt for first integer
                System.out.print("Enter first integer: ");
                a = input.nextInt(); 
                break;
            }
            catch (InputMismatchException ex) {
                System.out.println("Input needs to be a number"); // Display error message
                input.nextLine(); // Clear incorrect input
            }
        }
        
        while (true) {
            try {
                // Prompt for second integer
                System.out.print("Enter second integer: ");
                b = input.nextInt();
                break;
            }
            catch (InputMismatchException ex) {
                System.out.println("Input needs to be a number"); // Display error message
                input.nextLine(); // Clear incorrect input
            }
        }
        
        // Add integers
        int sum = (a + b);

        // Display the sum
        System.out.println("The sum of both integers is: " + sum);
    }
}
