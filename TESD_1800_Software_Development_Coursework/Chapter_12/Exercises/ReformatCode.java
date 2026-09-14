import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReformatCode {
    /** Main Method */
    public static void main(String[] args) throws Exception{
        // Create a File object pointing to the filename
        String filename = args[0];

        // Create a Scanner object to read that File
        File file = new File(filename);
        Scanner input = new Scanner(file);

        // Create a list to store output lines (ArrayList of Strings)
        ArrayList<String> list = new ArrayList<>();

        // LOOP START: While the Scanner has a next line
        while (input.hasNextLine()) {
            // Read a line using the Scanner
            String line = input.nextLine();

            // Trim the line (remove leading/trailing spaces) to check what it contains
            String trimmedLine = line.trim();
            // If the trimmed line is just "{"
            if (trimmedLine.equals("{")) {
                // Get the last line already stored in the list
                String lastLine = list.get(list.size() - 1);
                // Add " {" to the end of that last line
                lastLine = lastLine + " {";
                // Replace the last line in the list with this updated version
                list.set(list.size() - 1, lastLine);
            } else {
                // Add this line to the list as a brand new entry
                list.add(line);
            }
        }
        // Close the Scanner
        input.close();
        
        // Create a PrintWriter to write to the file
        PrintWriter write = new PrintWriter(filename);

        // LOOP START: For each line stored in the list
        for (int i = 0; i < list.size(); i++) {
            // Write that line using the PrintWriter
            write.print(list.get(i));
            // Write a newline after it
            write.print("\n");
        }

        // Close the PrintWriter
        write.close();
    }
}