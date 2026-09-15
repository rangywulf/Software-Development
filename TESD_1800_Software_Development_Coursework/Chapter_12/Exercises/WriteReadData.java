/*
Author: Jess Stubbs
Date: 09/15/2026

Writes 100 random integers to a file, reads them back into an array, and prints them sorted in increasing order.
*/

import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class WriteReadData {
    /** Main Method */
    public static void main(String[] args) throws Exception {
        // Create the file named Exercise12_15.txt
        File file = new File("Exercise12_15.txt");

        // Create a way to write text to the file
        PrintWriter output = new PrintWriter(file);

        // Generate 100 random integers
        for (int i = 0; i < 100; i++) {
            int number = (int)(Math.random() * 100); // Generate one random integer
            output.print(number); // Write the integer to the file
            output.print(" "); // Write a space after the integer
        }
        
        // Close the file use for writing
        output.close();

        // Create a way to read the integers from the file
        Scanner readFile = new Scanner(file);

        // Create an array to store the 100 integers
        int[] array = new int[100];

        // Read the integers from the file
        for (int i = 0; i < 100; i++) {
            int oneNumber = readFile.nextInt(); // read one integer
            array[i] = oneNumber; // Store the integer in the array
        }
        
        // Close the file used for reading
        readFile.close();

        // Sort the array in increasing order
        Arrays.sort(array);

        // Display the integers in increasing order
        System.out.print(Arrays.toString(array));
    }
}
