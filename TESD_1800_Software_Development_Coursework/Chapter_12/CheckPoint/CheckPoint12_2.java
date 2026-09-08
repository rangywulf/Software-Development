public class CheckPoint12_2 {
    /* 12.2.1
    What is the advantage of using exception handling?
    - Separating the detection of an error (done in a called method) 
    from the handling of an error (done in the calling method) */

    /* 12.2.2
    Which of the following statements will throw an exception?
    System.out.println(1 / 0); - Throws an exception
    System.out.println(1.0 / 0); - does not throw
    */

    /* 12.2.3 
    Point out the problem in the following code. Does the code throw any exceptions?
    long value = Long.MAX_VALUE + 1;
    System.out.println(value);

    - Adding 1 to Long.MAX_VALUE exceeds the maximum value allowed by a long value. But the current
    versions of Java does not report this as an exception.
    */

    /* 12.2.4
    What does the JVM do when an exception occurs?
    - Java searches for a handler in the catch clause. 
    How do you catch an exception?
    - You need to write a try-catch statement
    */

    /* 12.2.5
    What is the output of the following program? 
    public static void main(String[] args) {
        try {
            int value = 30;
            if (value < 40)
                throw new Exception("value is too small");
        }    
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Continue after the catch block");
    }
    What would be the output if the line
    int value = 30;
    were changed to
    int value = 50;   
    - output is
    value is too small
    Continue after the catch block

    the output would be if Line int value = 30; is changed to int value = 50; Continue after the catch block
    */

    /* 12.2.6 
    Show the output of the following code.
(a)
public class Test {
  public static void main(String[] args) {
    for (int i = 0; i < 2; i++) {
      System.out.print(i + " ");
      try {
        System.out.println(1 / 0);
      }
      catch (Exception ex) {
      }
    }
  }
}

(b)
public class Test {
  public static void main(String[] args) {
    try {
      for (int i = 0; i < 2; i++) {
        System.out.print(i + " ");
        System.out.println(1 / 0);
      }
    }
    catch (Exception ex) {
    }
  }
}

a. 0 1
b. 0
    */
}
