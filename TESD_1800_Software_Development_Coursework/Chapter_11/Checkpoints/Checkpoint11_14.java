public class Checkpoint11_14 {
    /* 11.14.1
    What modifier should you use on a class so a class in the same package can access it, 
    but a class in a different package cannot access it 
    - Default 
    */

    /* 11.14.2
    What modifier should you use so that a class in a different package cannot access the class,
    but it's subclasses in any package can access it?
    - Protected
    */

    /* 11.14.3
    In the following code, the classes A and B are in the same package. 
    If the question marks in (a) are replaced by blanks, can class B be compiled? 
    - yes
    If the question marks are replaced by private, can class B be compiled? 
    - No
    If the question marks are replaced by protected, can class B be compiled?
    - yes
(a)
package p1;

public class A {
  ?  int i;

  ?  void m() {
    ...
  }
}

(b)
package p1;

public class B extends A {
  public void m1(String[] args) {
    System.out.println(i);
    m();
  }
}
    
    */

    /* 11.14.4 
    In the following code, the classes A and B are in different packages. 
    If the question marks in (a) are replaced by blanks, can class B be compiled? 
    - No
    If the question marks are replaced by private, can class B be compiled?
    - No
    If the question marks are replaced by protected, can class B be compiled?
    - Yes
(a)
package p1;

public class A {
  ?   int i;

  ?   void m() {
    ...
  }
}

(b)
package p2;

public class B extends A {
  public void m1(String[] args) {
    System.out.println(i);
    m();
  }
}
    */

    /* 11.14.5
    In the following code, the classes A, B, and Main are in the same package. 
    Can the Main class be compiled?
    - Yes
class A {
  protected void m() {
  }
}

class B extends A {
}

class Main {
  public void p() {
    B b = new B();
    b.m();
  }
}
    */

}
