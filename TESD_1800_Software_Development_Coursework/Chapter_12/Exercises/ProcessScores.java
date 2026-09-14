import java.util.Scanner;
import java.io.File;

public class ProcessScores {
    /** Main Method */
    public static void main(String[] args) throws Exception {
        // Create a Scanner for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the name of the file
        System.out.print("What is the name of the file? ");
        String filename = input.nextLine(); // Get the filename from the user

        // Create a File object using the filename
        File file = new File(filename);

        // Create a Scanner to read the file
        Scanner inputFile = new Scanner(file);

        // Create a variable to store the total of the scores
        double total = 0;

        // Create a variable to store the number of scores
        int numScores = 0;

        // While there are more scores in the file
        while (inputFile.hasNextDouble()) {
            // Read the next score
            double score = inputFile.nextDouble();
            // Add the score to the total
            total += score;
            // Add 1 to the number of scores
            numScores++;
        }
        
        // Calculate the average using the total score and number of scores
        double average = total / numScores;

        // Display the average
        System.out.println("Average Score: " + average);
        
        // Close the file Scanner
        inputFile.close();
    }
}
