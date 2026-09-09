public class CheckPint12_9 {
    /* 12.9.1 
    How do you define a custom exception class?
    you extend Exception or a subclass of Exception
    */

    /* 12.9.2
    Suppose the setRadius method throws the InvalidRadiusException defined in Listing 12.10. What is displayed when running the following program?
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
      Circle c1 = new Circle(1);
      c1.setRadius(-1);
      System.out.println(c1.getRadius());   
    }
    catch (RuntimeException ex) {  
      System.out.println("RuntimeException in method()");
    }   
    catch (Exception ex) {
      System.out.println("Exception in method()");
      throw ex;
    }
  }
}
    - Exception in method()
    Exception in main
    Reason: the setRadius method throws a RadiusException. RadiusException is a subclass 
    of Exception. So it is caught in method()'s handler. The handler rethrows it back to 
    the main method.
     */
}
