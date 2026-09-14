public class CheckPoint12_11 {
    /* 12.11.1
    How do you create a PrintWriter to write data to a file?
    - new PrintWriter(filename)
    What is the reason to declare throws Exception in the main method of WriteData.java?
    - This statement may throw an exception. Java forces you to write the code to deal with exceptions. 
    - One way to deal with it is to declare throws java.io.IOException in the method declaration.
    What would happen if the close() method were not invoked in Listing 12.13
    - If the close() method is not invoked, the data may not be saved properly.
    */

    /* 12.11.2
    Show the contents of the file temp.txt after the following program is executed.
public class Test {
  public static void main(String[] args) throws java.io.IOException {
    java.io.PrintWriter output = new java.io.PrintWriter("temp.txt");
    output.printf("amount is %f %e\r\n", 32.32, 32.32);
    output.printf("amount is %5.4f %5.4e\r\n", 32.32, 32.32);
    output.printf("%6b\r\n", (1 > 2));
    output.printf("%6s\r\n", "Java");
    output.close();
  }
}
    - amount is 32.320000 3.232000e+01
    - amount is 32.3200 3.2320e+01
    - false
    - Java
    */

    /* 12.11.3
    Rewrite the code in the preceding question using a try-with-resources syntax 
    
    public class Test {
        public static void main(String[] args) throws Exception {
            try (java.io.PrintWriter output = new java.io.PrintWriter("temp.txt");) {
                output.printf("amount is %f %e\r\n", 32.32, 32.32);
                output.printf("amount is %5.4f %5.4e\r\n", 32.32, 32.32);
                output.printf("%6b\r\n", (1 > 2));
                output.printf("%6s\r\n", "Java");
                output.close();
            }
        }
    }

    */

    /* 12.11.4
    How do you create a Scanner to read data from a file? 
    - new Scanner(new File(filename))
    What is the reason to define throws Exception in the main method in Listing 12.15, ReadData.java?
    - This statement may throw an exception. Java forces you to write the code to deal with exceptions. 
    - One way to deal with it is to declare throws Exception in the method declaration. 
    What would happen if the close() method were not invoked in Listing 12.15?
    -  If the close() method is not invoked, the problem will run fine. 
    But it is a good practice to close the file to release the resource on the file.
     */

    /* 12.11.5
    What will happen if you attempt to create a Scanner for a nonexistent file?
    - An exception will occur
    What will happen if you attempt to create a PrintWriter for an existing file?
    - The contents of the existing file will be gone.
    */

    /* 12.11.6
    Is the line separator the same on all platforms?
    - No
    What is the line separator on Windows? 
    - \r\n
    */

    /* 12.11.7
    Suppose you enter 45 57.8 789, then press the Enter key. Show the contents of the variables after the following code is executed.
    Scanner input = new Scanner(System.in);
    int intValue = input.nextInt();
    double doubleValue = input.nextDouble();
    String line = input.nextLine();

    - intValue = 45
    - doubleValue = 57.8
    - nextLine ' ', '7 ', '8 ', '9'.
     */

    /* 12.11.8
    Suppose you enter 45, press the Enter key, 57.8, press the Enter key, 789, and press the Enter key. 
    Show the contents of the variables after the following code is executed.
    Scanner input = new Scanner(System.in);
    int intValue = input.nextInt();
    double doubleValue = input.nextDouble();
    String line = input.nextLine();

    - intValue = 45
    - doubleValue = 57.8
    - line is empty

    When nextLine() runs, the cursor is sitting right after 57.8 but before its \n. So nextLine() reads "everything until the next newline"... 
    and there's nothing there except the newline itself. That's an empty string.

Visually:
45\n57.8\n789\n
        ^
        cursor is HERE after nextDouble() runs
        
nextLine() reads from ^ to the next \n
That gap contains: (nothing)  →  line = ""

The Fix (for future reference)

This is such a common gotcha that there's a standard fix: add an extra input.nextLine() right after nextInt() or nextDouble() to "eat" that 
leftover newline before you try to read a real line of text.
     */
}
