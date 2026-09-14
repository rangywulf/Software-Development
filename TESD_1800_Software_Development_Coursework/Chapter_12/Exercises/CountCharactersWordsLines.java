import java.io.File;
import java.util.Scanner;

public class CountCharactersWordsLines {
    /** Main Method */
    public static void main(String[] args) throws Exception {
        // Get the filename from args[0]
        String filename = args[0];

        // Create a File object pointing to the filename
        File file = new File(filename);

        // Create a Scanner object to read that File
        Scanner input = new Scanner(file);

        // Create a counter for characters, starting at 0
        int chaCount = 0;

        // Create a counter for words, starting at 0
        int wordsCount = 0;

        // Create a counter for lines, starting at 0
        int linesCount = 0;

        while (input.hasNextLine()) {
            // Read a line using the Scanner
            String line = input.nextLine();

            // Add 1 to the line counter
            linesCount++;

            // Add the line's length to the character counter
            chaCount += line.length();

            // Add 1 to the character counter (for the newline character)
            chaCount++;

            // Split the line into words (separated by whitespace)
            if (!line.isBlank()) {
                String[] words = line.trim().split("\\s+");
                // Add the number of words found to the word counter
                wordsCount += words.length;
            }
        }

        // Close the Scanner
        input.close();

        // Print "File " + filename + " has"
        System.out.println("File " + filename + " has");

        // Print the character count + " characters"
        System.out.println(chaCount + " characters");

        // Print the word count + " words"
        System.out.println(wordsCount + " words");

        // Print the line count + " lines"
        System.out.println(linesCount + " lines");
    }
}