package Chapter_10.Checkpoints;

public class CheckPoint10_7 {
    /* 10.7.1
    Describe primitive-type wrapper classes
    - Boolean, Character, Double, Float, Byte, Short, Integer, and Long */

    /* 10.7.2
    Can each of the following statements be compiled?
    a.	Integer i = new Integer("23");
    b.	Integer i = new Integer(23);
    c.	Integer i = Integer.valueOf("23");
    d.	Integer i = Integer.parseInt("23", 8);
    e.	Double d = new Double();
    f.	Double d = Double.valueOf("23.45");
    g.	int i = (Integer.valueOf("23")).intValue();
    h.	double d = (Double.valueOf("23.4")).doubleValue();
    i.	int i = (Double.valueOf("23.4")).intValue();
    j.	String s = (Double.valueOf("23.4")).toString();

    a. yes
    b. yes
    c. yes
    d. 19
    e. no, no default constructor in Double
    f. yes
    g. yes
    h. yes
    i. yes
    j. yes
    */

    /* 10.7.3
    How do you convert an integer into a string?
    "number" or Integer(int).toString()
    How do you convert a numeri string into an integer?
    Integer.parseInt(s)
    How do you convert a double number into a string?
    Double(double).toString()
    How do you convert a number string into a double vale?
    Double.parseDouble(s)
    */

    /* 10.7.4
    Show the output of the following code
    public class Test {
    public static void main(String[] args) {
        Integer x = new Integer(3);
        System.out.println(x.intValue());
        System.out.println(x.compareTo(new Integer(4)));
    }
    }  
    
    3
    -1
    */

    /* What is the output of the following code? 
    public class Test {
        public static void main(String[] args) {
            System.out.println(Integer.parseInt("10"));
            System.out.println(Integer.parseInt("10", 10));
            System.out.println(Integer.parseInt("10", 16));
            System.out.println(Integer.parseInt("11"));
            System.out.println(Integer.parseInt("11", 10));
            System.out.println(Integer.parseInt("11", 16));
        }
        }

    10
    10
    16
    11
    11
    17
    */

}
