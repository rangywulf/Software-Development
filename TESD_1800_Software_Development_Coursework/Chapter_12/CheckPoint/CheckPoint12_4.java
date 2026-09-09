public class CheckPoint12_4 {
    /* 12.4.1
    What is the purpose of declaring exceptions?
    - To notify the caller that the method may produce a particular exception and that the caller
    must handle it or pass it along.
    How do you declare an exception and where?
    - It is declared in the method header, after the paremeter list, using the throws keyword.
    Can you declare multiple exceptions in a method header?
    - Yes. You separate them by commas.
     */

    /* 12.4.2 
    How do you throw an exception?
    - throw new ExceptionType("message");
    Can you throw multiple exceptions in one throw statement?
    - No. 
    */

    /* 12.4.3
    What is the keyword throw used for?
    - throw is used to actually throw an exception
    What is the keyword throws used for? 
    - throws is the declaration in the method to throw one or more exceptions.
    */

    /* 12.4.4
    Suppose statement2 causes an exception in the following try-catch block:
    try {
    statement1;
    statement2;
    statement3;
    }
    catch (Exception1 ex1) {
    }
    catch (Exception2 ex2) {
    }

    statement4;

    Answer the following questions:
    Will statement3 be executed? No
    If the exception is not caught, will statement4 be executed? No - the program will error out
    and not complete the next statements. 
    If the exception is caught in the catch block, will statement4 be executed? Yes
    */

    /* 12.4.5
    What is displayed when running the following program?
public class Test {
  public static void main(String[] args) {
    try {
      int[] list = new int[10];
      System.out.println("list[10] is " + list[10]);      
    }   
    catch (ArithmeticException ex) {
      System.out.println("ArithmeticException");   
    }   
    catch (RuntimeException ex) {
      System.out.println("RuntimeException");   
    }   
    catch (Exception ex) {   
      System.out.println("Exception");   
    }   
  }
}
    - RuntimeException
    Reason: list[10] throws ArrayIndexOutOfBoundsException that is a subclass of RuntimeException
    */

    /* 12.4.6
    What is displayed when running the following program?


public class Test {
  public static void main(String[] args) {
    try {
      method();
      System.out.println("After the method call");
    }
    catch (ArithmeticException ex) {
      System.out.println("ArithmeticException");
    }
    catch (RuntimeException ex) {
      System.out.println("RuntimeException");
    }
    catch (Exception e) {
      System.out.println("Exception");
    }
  }
  static void method() throws Exception {
     System.out.println(1 / 0);
   }
}
    - ArithmeticException
    Reason: method() throws ArithmeticException because of dividing by 0
     */

    /* 12.4.7
    What is displayed when running the following program?
public class Test { 
  public static void main(String[] args) {
    try {
      method();
      System.out.println("After the method call");   
    }   
    catch (RuntimeException ex) {
      System.out.println("RuntimeException in main");   
    }   
    catch (Exception ex) {
      System.out.println("Exception in main");   
    }   
  }

  static void method() throws Exception {
    try {
      String s ="abc";
      System.out.println(s.charAt(3));
    }
    catch (RuntimeException ex) {
      System.out.println("RuntimeException in method()");   
    }   
    catch (Exception ex) {
      System.out.println("Exception in method()");   
    }
  }
}
    - RuntimeException in method()
    After the method call
    Reason: s.charAt(3) throws StringIndexOutOfBoundsException that is a subclass of RuntimeException.
    This exception is caught in the method(). The main method continues its normal execution flow.

    Think of it as the exception getting "caught" inside method()
main()
  │
  │ calls method()
  ↓
method()
  │
  │ s.charAt(3)
  ↓
StringIndexOutOfBoundsException
  │
  ↓
RuntimeException catch
  │
  └── prints "RuntimeException in method()"
          │
          ↓
       exception handled
          │
          ↓
       returns to main()
          │
          ↓
"After the method call"
And the catch blocks in main() never run.
That's because method() caught the exception before it could reach main().
    */

    /* 12.4.8
    What does the method getMessage() do?
    - Returns the message that describes the exception, which is the argument 
    provided when the exception object was created.
    */

    /* 12.4.9
    What does the method printStackTrace() do?
    Prints information about an exception, including where the exception occurred 
    and the sequence of method calls that led to it.
     */

    /* 12.4.10
    Does the presence of a try-catch block imposse overhead when no exception occurs?
    No.
    */

    /* 12.4.11
    Correct a compile error in the following code:
    public void m(int value) {
        if (value < 40)
            throw new Exception("value is too small");
    }

    public void m(int value) throws Exception {
        if (value < 40)
            throw new Exception("value is too small");
    }
    */
}
