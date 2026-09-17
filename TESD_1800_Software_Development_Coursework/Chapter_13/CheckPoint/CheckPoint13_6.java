public class CheckPoint13_6 {
    /* 13.6.1
    True or False? If a class implements Comparable, the object of the class can invoke
    the compareTo method.
    - True 
    */

    /* 13.6.2
    Whic of the following is the correct method header for the compareTo method in the String class?
    public int compareTo(String o) - correct
    public int compareTo(Object o) 
    */

    /* 13.6.3
    Can the following code be compiled? Why?
    Integer n1 = 3;
    Object n2 = 4;
    System.out.println(n1.compareTo(n2));
    - no. You can't compare an Integer to an Object
    */

    /* 13.6.4
    You can define the compareTo method in a class without implementing the Comparable interface.
    What are the benefits of implementing the Comparable interface?
    the object of the class can be passed to a method that requires a Comparable type 
    */

    /* 13.6.5
    What is wrong in the following code?
public class Test {
  public static void main(String[] args) {
    Person[] persons = {new Person(3), new Person(4), new Person(1)};
    java.util.Arrays.sort(persons);
  }
}

class Person {
  private int id;

  Person(int id) {
    this.id = id;         
  }
}
- class Person implements Comparable<Person>
*/

}
