public class CheckPoint13_3 {
    /* 13.3.1
    Why do the following two lines of code compile but cause a runtime error?
    Number numberRef = Integer.valueOf(0);
    Double doubleRef = (Double)numberRef;
    - At runtime, JVM attempts to convert numberRef to a Double object, but numberRef is an instance of Integer, not Double.
    */

    /* 13.3.2 
    Why do the following two lines of code compile but cause a runtime error?
    Number[] numberArray = Integer[2];
    numberArray[0] = Double.valueOf(1.5);
    - numberArray[0] is of the Integer type. It will be a casting error at runtime.
    */

    /* 13.3.3
    Show the output of the following code
    public static void main(String[] args) {
        Number x = 3;
        System.out.println(x.intValue());
        System.out.println(x.doubleValue());
    }
    3
    3.0 
    */

    /* 13.3.4
    What is wrong with the following code? (Note that the compareTo method for the Integer and Double classes was introduced in Section 10.7) 
    public static void main(String[] args) {
        Number x = new Integer(3);
        System.out.println(x.intValue());
        System.out.println(x.compareTo(new Integer(4)));
    }
    - The program has a syntax error because x does not have the compareTo method.
    */

    /* 13.3.5
    What is wrong in the following code?
    public static void main(String[] args) {
        Number x = new Integer(3);
        System.out.println(x.intValue());
        System.out.println((Integer)x.compareTo(new Integer(4)));
    }
    - The program has a syntax error because the member access operator (.) is executed before the casting operator.
    */
}
