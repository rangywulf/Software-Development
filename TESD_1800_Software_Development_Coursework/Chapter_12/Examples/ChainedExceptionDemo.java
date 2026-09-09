public class ChainedExceptionDemo {
    public static void main(String[] args) {
        try {
            method1();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void method1() throws Exception {
        try {
            method2();
        }
        catch (Exception ex) {
            throw new Exception("New info from method1", ex);
        }
    }

    public static void method2() throws Exception {
        throw new Exception("New info from method2");
    }
}

/*
java.lang.Exception: New info from method1
  at ChainedExceptionDemo.method1(ChainedExceptionDemo.java:16)
  at ChainedExceptionDemo.main(ChainedExceptionDemo.java:4)
Caused by: java.lang.Exception: New info from method2
  at ChainedExceptionDemo.method2(ChainedExceptionDemo.java:21)
  at ChainedExceptionDemo.method1(ChainedExceptionDemo.java:13)
  ... 1 more
*/

/*
The main method invokes method1 (line 4), method1 invokes method2 (line 13), 
and method2 throws an exception (line 21). This exception is caught in the catch 
block in method1 and is wrapped in a new exception in line 16. The new exception is 
thrown and caught in the catch block in the main method in line 6. The sample output 
shows the output from the printStackTrace() method in line 7. The new exception thrown 
from method1 is displayed first, followed by the original exception thrown from method2.
*/
