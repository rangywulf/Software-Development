import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class RemoveText {
    /** Main Method */
    public static void main(String[] args) throws Exception {
        // Get the string to remove from args[0]
        String targetToRemove = args[0];
        
        // Get the filename from args[1]
        String filename = args[1];

        // Create a File object pointing to the filename
        File file = new File(filename);

        // Create a Scanner object to read that File
        Scanner input = new Scanner(file);

        // Create a place to store all the lines
        StringBuilder result = new StringBuilder();

        // While the Scanner has a next line
        while (input.hasNextLine()) {
            // Read a line using the Scanner
            String line = input.nextLine();

            // Remove all occurrences of the specified string from that line
            line = line.replace(targetToRemove, "");

            // Add the modified line to the stored content
            result.append(line);
            result.append("\n");
        }
        // Close the Scanner
        input.close();

        // Create a PrintWriter to write to the same filename
        PrintWriter output = new PrintWriter(filename);
        
        // Write each modified line using the PrintWriter
        output.print(result);

        // Close the PrintWriter
        output.close();
    }
}