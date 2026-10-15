package Software-Development.TESD_1800_Software_Development_Coursework.Chapter_17.CheckPoints;

public class Checkpoint17_3 {
    /* 17.3.1
    What are the differences between text I/O and binary I/O?
    - Text I/O converts between characters and bytes
    - Binary I/O works directly with the underlying binary represenation of data
    */

    /* 17.3.2
    How is a Java character represented in the memory?
    - As a 16-bit Unicdoe character (char)
    How is a character represented in a text file?
    - As a sequence of bytes encoded using a character encoding, such as UTF-8
    */

    /* 17.3.3
    If you write the string "ABC" to an ASCII text file, what values are stored in the file?
    - The ASCII values 65, 66, and 67 are stored as bytes.
    */

    /* 17.3.4
    If write the string "100" to an ASCII text file, what values are stored in the file?
    - The ASCII values 49, 48, and 48 (representing the charcters '1', and '0')
    If you write a numberic byte-type value 100 using binary I/O, what values are stored in the file?
    - the single byte value 100
    */

    /* 17.3.5
    What is the encoding scheme for representing a charater in a java program?
    - Unicode (Java uses UTF-16 code units to represent char values).
    By default, what is the econding scheme for a text file on Windows?
    - It depends on the Windows configuration and the applicaiton. Modern Java uses UTF-8 by default.
     */
}
