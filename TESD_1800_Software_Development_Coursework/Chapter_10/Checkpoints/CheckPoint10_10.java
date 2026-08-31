package Chapter_10.Checkpoints;

public class CheckPoint10_10 {
    /* Suppose s1, s2, s3, and s4 are four strings, given as follows: 
    String s1 = "Welcome to Java";
    String s2 = s1;
    String s3 = new String("Welcome to Java"); 
    String s4 = "Welcome to Java";

    What are the results of the following expressions?
    a.	s1 == s2
    b.	s1 == s3
    c.	s1 == s4
    d.	s1.equals(s3) 
    e.	s1.equals(s4) 
    f.	"Welcome to Java".replace("Java", "HTML") 
    g.	s1.replace('o', 'T')
    h.	s1.replaceAll("o", "T")
    i.	s1.replaceFirst("o", "T")
    j.	s1.toCharArray()

    a. True
    b. false
    c. true
    d. true
    e. true
    f. Welcome to HTML
    g. WelcTme tT Java
    h. WelcTme tT Java
    i. WelcTme to Java
    j. returns an array of W, e, l, c, o, m, e, , t, o, , J, a, v, a 
    */

    /* 10.10.2
    To create the string Welcome to Java, you may use a statement like this:
    String s = "Welcome to Java";
    or
    String s = new String("Welcome to Java"); 
    
    Which one is better and why?
    the first one is stored as an interned string. The interned strings of the same value share the same object. */

    /* 10.10.3
    What is the output of the following code?
    String s1 = "Welcome to Java";
    String s2 = s1.replace("o", "abc");
    System.out.println(s1);
    System.out.println(s2);

    Welcome to Jave
    Welcabcme toabc Java
    */

    /* 10.10.4
    Let s1 b " Welcome " and s2 be " welcome ". Write the code for the following statements:
    a. Replace all occurrences of the character e with E in s1 and assign the new string to s3
    - String s3 = s1.replaceAll("e", "E");

    b. Split Welcome to Java and HTML into an array tokens delimited by a space and assign the first two tokens into s1 and s2. 
    String[] tokens = "Welcome to Java and HTML".split(" ");
    s1 = tokens[0];
    s2 = tokens[1];
    */

    /* 10.10.5
    Does any method in the String class change the contents of the string?
    - No */

    /* 10.10.6
    Suppose string s is created using new String(); what is s.length()? 
    - 0*/

    /* 10.10.7
    How do you convert a char, an array of characters, or a number to a string?
    valueOf */

    /* 10.10.8
    Why does the following code cause a NullPointerException?
 1  public class Test {
 2    private String text;
 3
 4    public Test(String s) {
 5      String text  = s;
 6    }
 7
 8    public static void main(String[] args) {
 9      Test test = new Test("ABC");
10      System.out.println(test.text.toLowerCase());
11    }
12  }
    
    s was never assigned so String text never fires
    The text is declared in Line 2 as a data field, but redeclared in Line 5 as a local variable. The local variable is assigned 
    with the string passed to the constructor, but the data field is still null. In Line 10, test.text is null, which causes 
    NullPointerException when invoking the toLowerCase() method. 
    */

    /* 10.10.9 
    What is wrong in the following program?


 1  public class Test {
 2    String text;
 3
 4    public void Test(String s) {
 5      text = s;
 6    }
 7
 8    public static void main(String[] args) {
 9      Test test = new Test("ABC");
10      System.out.println(test);
11    }
12  }

    - the constructor uses void. It's defined incorrectly.It should never have a return type.
    */

    /* 10.10.10
    Show the output of the following code:

    public class Test { 
        public static void main(String[] args) {
            System.out.println("Hi, ABC, good".matches("ABC "));
            System.out.println("Hi, ABC, good".matches(".*ABC.*"));
            System.out.println("A,B;C".replaceAll(",;", "#"));
            System.out.println("A,B;C".replaceAll("[,;]", "#"));
            String[] tokens = "A,B;C".split("[,;]");
            for (int i = 0; i < tokens.length; i++)
            System.out.print(tokens[i] + " ");
        }
    }

    false
    true
    A,B;C
    A#B#C
    A B C */

    /* 10.10.11
    Show the output of the following code.
    public class Test { 
        public static void main(String[] args) {
            String s = "Hi, Good Morning";
            System.out.println(m(s));
        }

    public static int m(String s) {
        int count = 0; 
        for (int i = 0; i < s.length(); i++)
        if (Character.isUpperCase(s.charAt(i)))
            count++;

        return count;
        }
    }
    - 3 
    
    */
}
