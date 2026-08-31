package Chapter_10.Checkpoints;

public class CheckPoint10_11 {
    /* 10.11.1
    What is the difference between StringBuilder and StringBuffer?
    - The StringBuilder class is similar to StringBuffer except that the methods for modifying the buffer in StringBuffer are synchronized, 
    which means that only one task is allowed to execute the methods. */

    /* 10.11.2
    How do you create a string builder from a string?
    - StringBuilder stringBuilder = new StringBuilder();
    How do you return a string from a string builder?
    return stringBuilder.toString();
    */

    /* 10.11.3
    Write three statements to reverse a string s using the reverse method in the StringBuilder class
    StringBuilder stringBuilder = stringBuilder.reverse(s);
    stringBuilder.reverse();
    s = stringBuilder.toString()
    */

    /* 10.11.4
    Write three statements to delete a substring from a string s of 20 characters, starting at index 4 and ending with index 10.
    Use the delete method in the StringBuilder class
    StringBuilder stringBuilder = new StringBuilder(s);
    stringBuilder.delete(4, 11);
    s = stringBuilder.toString();
     */

    /* 10.11.5
    What is the internal storage for characters in a string and a string builder 
    - Both string and string buffer use arrays to hold characters. The array in a string is fixed once a string is created. 
    The array in a string buffer may change if the buffer capacity is changed. To accommodate the change, a new array is created.
    */

    /* 10.11.6
    Suppose that s1 and s2 are given as follows:
    StringBuilder s1 = new StringBuilder("Java");
    StringBuilder s2 = new StringBuilder("HTML");

    Show the value of s1 after each of the following statements. Assume that the statements are independent.
    a.	s1.append(" is fun"); 
    - Java is fun
    b.	s1.append(s2);
    - JavaHTML
    c.	s1.insert(2, "is fun");
    - jais funva
    d.	s1.insert(1, s2);
    - JHTMLava
    e.	s1.charAt(2);
    - v
    f.	s1.length();
    - 4
    g.	s1.deleteCharAt(3); 
    - Jav
    h.	s1.delete(1, 3);
    - Ja
    i.	s1.reverse();
    - avaJ
    j.	s1.replace(1, 3, "Computer");
    - JComputera
    k.	s1.substring(1, 3);
    - av
    l.	s1.substring(2);
    - va

    */

    /* 10.11.7
    Show the output of the following program:
    public class Test {  
        public static void main(String[] args) {
            String s = "Java";
            StringBuilder builder = new StringBuilder(s);
            change(s, builder);

            System.out.println(s);
            System.out.println(builder);
        }

        private static void change(String s, StringBuilder builder) {
            s = s + " and HTML";
            builder.append(" and HTML");
        }
    }
    
    - Java
    - Java and HTML
    */
}
