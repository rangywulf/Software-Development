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
}
