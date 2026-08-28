package Chapter_10.Checkpoints;

public class CheckPoint10_8 {
    /* What are autoboxing and autounboxing?
    autoboxing is when you convert a primitive value to a wrapper object. Unboxing is the reverse.
    Are the following statements correct?
    a.	Integer x = 3 + new Integer(5);
    b.	Integer x = 3;
    c.	Double x = 3;
    d.	Double x = 3.0;  
    e.	int x = new Integer(3);
    f.	int x = new Integer(3) + new Integer(4);

    a. yes
    b. yes
    c. no. This is the same as Double x = new Integer(3);
    d. yes
    e. yes
    f. yes
    */

    /* 10.8.2
    Show the output of the following code:
    public class Test {
        public static void main(String[] args) {
            Double x = 3.5;
            System.out.println(x.intValue());
            System.out.println(x.compareTo(4.5));
        }
        }

    3
    -1
     */
}
