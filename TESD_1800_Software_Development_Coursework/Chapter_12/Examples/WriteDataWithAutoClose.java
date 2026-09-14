public class  WriteDataWithAutoClose {
    public static void main(String[] args) throws Exception {
        java.io.File file = new java.io.File("scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }

        try (
            // Create a file
            java.io.PrintWriter output = new java.io.PrintWriter(file);
        )  {
            // Write formatted output to the file
            output.print("John T Smith ");
            output.println(90);
            output.print("Eric K Jones ");
            output.println(85);
        }
    }
}

/*
A resource is declared and created in the parentheses following the keyword try. The resources must be a subtype of 
AutoCloseable such as a PrinterWriter that has the close() method. A resource must be declared and created in the 
same statement, and multiple resources can be declared and created inside the parentheses. The statements in the 
block (lines 12–18) immediately following the resource declaration use the resource. After the block is finished, 
the resource’s close() method is automatically invoked to close the resource. Using try-with-resources can not only 
avoid errors, but also make the code simpler. Note the catch clause may be omitted in a try-with-resources statement.
*/