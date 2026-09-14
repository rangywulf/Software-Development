import java.io.*;
import java.util.*;

public class ReplaceText {
    public static void main(String[] args) throws Exception {

        // Check command line parameter usage
        // 1. args.length counts how many arguments were typed after "java ReplaceText" on the command line. 
        // If it's not exactly 4, print the usage message and call System.exit(1), which immediately kills the program
        if (args.length != 4) {
            System.out.println("Usage: java ReplaceText sourceFile targetFile oldStr newStr");
            System.exit(1);
        }

        // Check if source file exists
        // 2. Wraps the first argument (args[0]) in a File object, which represents a path on disk but doesn't 
        // open anything yet. .exists() then checks if a real file is actually there. If not, print an error and System.exit(2) kills the program
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        // Check if target file exists
        // 3. Same idea as step 2, but for the second argument (args[1]), and checking the opposite condition:
        //  if a file is ALREADY there, stop, so we don't accidentally overwrite something. System.exit(3) kills the program if so
        File targetFile = new File(args[1]);
        if (targetFile.exists()) {
            System.out.println("Target file " + args[1] + " already exists");
            System.exit(3);
        }

        // Create input and output files
        // 4. Scanner is a tool for reading text out of a file, line by line. PrintWriter is a tool for 
        // writing text into a file. Both are created here, and because they're inside try(...), Java will 
        // automatically close them when the block ends, even if an error happens
        try (
            Scanner input = new Scanner(sourceFile);
            PrintWriter output = new PrintWriter(targetFile);
        ) {
            // 5. input.hasNext() checks if there's at least one more line left unread in the source file. 
            // This condition is rechecked every time the loop finishes a pass, which is what makes it a loop
            while (input.hasNext()) {

                // 6. input.nextLine() grabs the next unread line as a String and moves the Scanner's 
                // position forward past it, storing that text in s1
                String s1 = input.nextLine();

                // 7. .replaceAll(args[2], args[3]) scans through s1 and swaps every match of the old text (args[2]) 
                // with the new text (args[3]), producing a new String s2. s1 itself is not changed, Strings in Java can't be modified in place
                String s2 = s1.replaceAll(args[2], args[3]);

                // 8. output.println(s2) writes that new line into the target file, followed by a line break. T
                // hen control jumps back to step 5 to check if there's another line
                output.println(s2);
            }
        } // 9. Once step 5's check fails (no lines left), Java exits the try block and automatically calls 
        // .close() on both input and output for you
    }
}