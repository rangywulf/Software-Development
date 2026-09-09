public class CheckPoint12_10 {
    /* 12.10.1
    What is wrong about creating a File object using the following statement?
    new File("c:\book\test.dat");
    - The \ is a special character. It should be written as \\ in Java using the Escapse sequence. 
    */

    /* 12.10.2
    How do you check whether a file already exists?
    exist()
    How do you delete a file?
    delete()
    How do you rename a file?
    renameTo()
    Can you find the file size (the number of bytes) using the File class?
    yes length()
    How do you create a directory?
    mkdir() or mkdirs()
    */

    /* 12.10.3
    Can you use the File class for I/O?
    - No. 
    The File class can be used to obtain file properties and manipulate files, but cannot perform I/O.
    Does creating a File object create a file on the disk?
    - No. Create a File object does not create a file/directory on the disk.
    */
}
