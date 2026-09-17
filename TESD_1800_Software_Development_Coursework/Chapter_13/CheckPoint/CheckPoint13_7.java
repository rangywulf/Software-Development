public class CheckPoint13_7 {
    /* 13.7.1
    Can a class invoke super.clone() when implementing the clone() method
    if the class does not implement java.lang.Cloneable?
    - Yes
    Does the Date class implement Cloneable?
    - Yes
     */

    /* 13.7.2
    What would happen if the House class did not override the clone() method or if House did not
    implement java.lang.Cloneable?
    - The program would receive a syntax error
    */

    /* 13.7.3
    Show the output of the following code:
    java.util.Date date = new java.util.Date();
    java.util.Date date1 = date;
    java.util.Date date2 = (java.util.Date)(date.clone());
    System.out.println(date == date1);
    System.out.println(date == date2);
    System.out.println(date.equals(date2));

    - true
    - false
    - true
    */

    /* 13.7.4
    Show the output of the following code:
    ArrayList<String> list = new ArrayList<>();
    list.add("New York"); 
    ArrayList<String> list1 = list;
    ArrayList<String> list2 = (ArrayList<String>)(list.clone());
    list.add("Atlanta"); 
    System.out.println(list == list1);
    System.out.println(list == list2);
    System.out.println("list is " + list);
    System.out.println("list1 is " + list1);
    System.out.println("list2.get(0) is " + list2.get(0));
    System.out.println("list2.size() is " + list2.size());
    - true
    - false
    - list is [New York, Atlanta]
    - list1 is [New York, Atlanta]
    - list2.get(0) is New York
    - list2.size() is 1
     */

    /* 13.7.5
    What is wrong in the code in (a)? What does the code in (b) have no compile errors? (see book)

    In (a), a compile error is reported because clone() is protected in Object. To enable cloning, 
    do two things: (1) override clone() in the class for the object to be cloned; 
    (2) implement java.lang.Cloneable for the class.

    In (b), no compile errors, because Test5 extends Object and the clone() method is defined 
    in the Obejct class, which is visible in Test5. However, when you run the code, a 
    CloneNotSupportedException will be thrown, because the clone() method is not implemented 
    in Test5 and Test5 does not implement the Cloneable interface.
     */

    /* 13.7.6
    Show the output of the following code.
public class Test {
  public static void main(String[] args) {
    House house1 = new House(1, 1750, 50);
    House house2 = (House)house1.clone();  
    System.out.println(house1.equals(house2);
  }
}
    - false
     */
}
