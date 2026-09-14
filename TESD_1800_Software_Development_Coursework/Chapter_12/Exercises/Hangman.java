import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class Hangman {
    /** Main Method */
    public static void main(String[] args) throws Exception {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Read the words from hangman.txt
        File file = new File("hangman.txt");

        // Read the words from the hangman.txt
        ArrayList<String> words = readWord(file);

        // Create variable
        String playAgain = "y";

        // while word is not complete
        while (playAgain.equals("y")) {
            int misses = 0; // Misses count
            // Randomly select a word
            int index = (int)(Math.random() * words.size()); // Randomly selects from index
            String word = words.get(index); // gets the string in the randomly selected index

            // Create an empty string for astericks
            char[] astericks = new char[word.length()];

            // Create the astericks for the selected word
            for (int i = 0; i < word.length(); i++) {
                astericks[i] = '*';
            }

            // Display the word as astericks
            displayWord(astericks);

            while (new String(astericks).contains("*")) {
                // guess letter method
                misses = guessLetter(input, word, astericks, misses);

                // display the current word
                displayWord(astericks);
            }
            
            // Display the number of misses
            System.out.println("Number of misses: " + misses);

            // As the user whether they want to play another word
            System.out.println("Do you want to play again? y/n ");
            playAgain = input.nextLine();
        }
    }

    /** Read Words Method */
    public static ArrayList<String> readWord(File file) throws Exception {
        Scanner readFile = new Scanner(file); // Create a scanner to read from hangman.txt

        ArrayList<String> words = new ArrayList<>();

        // While there is another word in the file
        while (readFile.hasNext()) {
            String word = readFile.next(); // Read the next word
            // Add the word to the ArrayList
            words.add(word);
        }
        // Close the scanner
        readFile.close();
        return words; // Return the ArrayList
    }

    /** Guess Letter Method */
    public static int guessLetter(Scanner input, String word, char[] astericks, int misses) {
        // Prompt the user to guess a letter
        System.out.print("Guess a letter: ");
        String letter = input.nextLine();

        // Check the guessed letter
        boolean found = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter.charAt(0)) {
                // Reveal the letter if correct
                astericks[i] = letter.charAt(0);
                found = true;
            }
        }

        // Increase the number of misses if incorrect
        if (!found) {
            misses++;
        }

        return misses;
    }
    
    /** Display Word Method */
    public static void displayWord(char[] astericks) {
        // Loop through each letter in the word
        for (int i = 0; i < astericks.length; i++) {
            // Display the letter or asterisk
            System.out.print(astericks[i]);
        }
        System.out.println();
    }
    
}
