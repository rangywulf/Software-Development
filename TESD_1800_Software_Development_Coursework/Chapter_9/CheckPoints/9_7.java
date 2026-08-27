public class 9_7 {
    /* 9.7.1
     Suppose the class F is defined in (a). Let f be an instance of F. Which of the ­statements in (b) are correct?

A)
public class F {
  int i;
  static String s;
  void imethod() {
  }
  static void smethod() {
  }
}

B)
System.out.println(f.i);
System.out.println(f.s);
f.imethod();
f.smethod();
System.out.println(F.i);
System.out.println(F.s);
F.imethod();
F.smethod();

System.out.println(f.i);
Answer: Correct

System.out.println(f.s);
Answer: Correct

f.imethod();
Answer: Correct

f.smethod();
Answer: Correct

System.out.println(F.i);
Answer: Incorrect

System.out.println(F.s);
Answer: Correct

F.imethod();
Answer: Incorrect

F.smethod();
Answer: Correct

    */

/* 9.7.2
Add the static keyword in the place of ? if appropriate 

public class Test {
  int count;
  public static void main(String[] args) {
    ...
  }
  public ? int getCount() {
    return count;
  }
  public static int factorial(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++)
      result *= i;
    return result;
  }
}
*/

/* 9.7.3 
Can you invoke an instance method or reference an instance variable from a static method? 
- No.
Can you invoke a static method or reference a static variable from an instance method?
- yes. 
What is wrong with the following code?

1  public class C {
 2    Circle c = new Circle();
 3
 4    public static void main(String[] args) {
 5      method1();
 6    }
 7
 8    public void method1() {
 9      method2();
10    }
11
12    public static void method2() {
13      System.out.println("What is radius " + c.getRadius());
14    }
15  }

- a) The main method is static and cannot invoke the instance method method1. 
- b) c is an instance variable, which cannot be accessed from the static context in method2.
*/
}
