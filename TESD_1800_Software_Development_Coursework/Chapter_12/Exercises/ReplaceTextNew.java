import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class ReplaceTextNew {

    public static void main(String[] args) throws Exception {

        // Check command line parameter usage
        // 1. args.length counts how many arguments were typed after the class name.
        // The program needs exactly 3 arguments: the source file, the old text, and the new text.
        // If there are not exactly 3 arguments, display the usage message and stop the program.
        if (args.length != 3) {
            System.out.println("Usage: java ReplaceText sourceFile oldStr newStr");
            System.exit(1);
        }

        // Check if source file exists
        // 2. Create a File object using the first command line argument.
        // .exists() checks whether that file actually exists.
        // If the file does not exist, display an error message and stop the program.
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        // Create an ArrayList to store each line after the old text has been replaced.
        // The lines must be stored first because the original file cannot be read
        // and overwritten at the same time.
        ArrayList<String> lines = new ArrayList<>();

        // Create a Scanner to read the original source file.
        // The Scanner is automatically closed when the try block finishes.
        try (
            Scanner input = new Scanner(sourceFile);
        ) {
            // 3. Continue reading the file while there is another line to read.
            while (input.hasNext()) {

                // 4. Read the next line from the source file and store it in s1.
                String s1 = input.nextLine();

                // 5. Replace every occurrence of the old text with the new text
                // and store the changed line in s2.
                String s2 = s1.replaceAll(args[1], args[2]);

                // 6. Add the changed line to the ArrayList.
                lines.add(s2);
            }
        }

        // 7. Open the original source file for writing.
        // This replaces the existing contents of the file.
        PrintWriter output = new PrintWriter(sourceFile);

        // 8. Go through each changed line stored in the ArrayList
        // and write it back into the original source file.
        for (int i = 0; i < lines.size(); i++) {
            output.println(lines.get(i));
        }

        // 9. Close the PrintWriter after all of the changed lines
        // have been written to the original source file.
        output.close();
    }
}

