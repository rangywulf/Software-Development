public class CheckPoint11_8 {
    /* 11.8.1 
    What is dynamic binding? 
    - A method may be implemented in several classes along the inheritance chain. The JVM decides
    which method is invoked at runtime.
    */

    /* 11.8.2
    Describe the difference between method matching and method binding.
    - Method matching: The process Java uses to figure out which method(among possibly several overloaded
    ones) fits a given method call, based on the number, order, and types of the arguments
    - Method Binding: Connecting a method call to the actual method body that will run. Can happen at
    compile time (static binding, based on the declared type) or at run time (dynamic binding,
    based on the actual object type). 
    */

    /* 11.8.3
    Can you assign new int[50], new Integer[50], new String[50], or new Object[50], into a variable
    of Object[] type?
    - all but new int[50] can be assigned into Object[] type because int is a primative*/

    /* 11.8.4
    What is wrong in the following code? 
    1  public class Test {
    2    public static void main(String[] args) {
    3      Integer[] list1 = {12, 24, 55, 1};
    4      Double[] list2 = {12.4, 24.0, 55.2, 1.0};
    5      int[] list3 = {1, 2, 3};
    6      printArray(list1);
    7      printArray(list2);
    8      printArray(list3);
    9    }
    10
    11    public static void printArray(Object[] list) {
    12      for (Object o: list)
    13        System.out.print(o + " ");
    14      System.out.println();
    15    }
    16  }

    - int[] list3 can't be passed to Object[] list as it's a primative type
    */

    /* 11.8.5
    Show the output of the following code:
    (a)
    public class Test {
    public static void main(String[] args) {
        new Person().printPerson();
        new Student().printPerson();
    }
    }

    class Student extends Person {
    @Override
    public String getInfo() {
        return "Student";
    }
    }

    class Person {
    public String getInfo() {
        return "Person";
    }

    public void printPerson() {
        System.out.println(getInfo());
    }
    }

    (b)
    public class Test {
    public static void main(String[] args) {
        new Person().printPerson();
        new Student().printPerson();
    }
    }

    class Student extends Person {
    private String getInfo() {
        return "Student";
    }
    }

    class Person {
    private String getInfo() {
        return "Person";
    }

    public void printPerson() {
        System.out.println(getInfo());
    }
      
    a)
    Person
    Student

    For (a), new Person().printPerson() invokes the printPerson() method definedin the Person class, 
    which then invokes the getInfo() method in the Person class.new Student().printPerson() invokes 
    the printPerson() method definedin the Person class, which then invokes the getInfo() method in 
    the Student class, because the calling object is a Student.

    b)
    Person
    Person

    For (b), new Student().printPerson() invokes the printPerson() method definedin the Person class, 
    which then invokes the getInfo() method in the Person class. It does not invoke the getInfo() 
    method in the Student class, because it is private and can only be invoked from a method in the 
    Student class. Note that the getInfo() method is not overridden because it is private. You can 
    only override a non-private method such as getInfo() in (a).

    */

    /* 11.8.6
    Show the output of following program:
    1  public class Test {
    2    public static void main(String[] args) {
    3      A a = new A(3); // 1. creates a new A object, calling A's constructor with the argument 3.
    4    }
    5  }
    6
    7  class A extends B {
    // 2. Before the first line of this constructor body runs, Java silently inserts super(); at the top. 
    // You didn't write it, but it's there. So control jumps up to B's no-arg constructor first.
    8    public A(int t) {
    9      System.out.println("A's constructor is invoked"); // 4. Now the rest of A's constructor body runs, printing it's message
    10    }
    11  }
    12
    13  class B {
    14    public B() { //3. This prints its message, then returns control back down to A's constructor
    15      System.out.println("B's constructor is invoked");
    16    }
    17  }

    - B's constructor is invoked
    - A's constructor is invoked

    Is the no-arg constructor of Object invoked when new A(3) is invoked?
    - Yes. The default constructor of Object is invoked, when new A(3) is invoked.
    - The Object's constructor is invoked before any statements in B's constructor are exectured.
 
    */

    /* 11.8.7
    Show the output of following program:
    public class Test {
        public static void main(String[] args) {
            new A();
            new B();
        }
        }

        class A {
        int i = 7; // 1. Field initializer runs

        public A() { // 2. Constructor body runs. this call's A's version of setI
            setI(20);
            System.out.println("i from A is " + i);
        }
        // i becomes 40
        // 3. Print statement "i from A is 40"

        public void setI(int i) {
            this.i = 2 * i; // "this" uses the actual (runtime) type of the object
        }
        }

        class B extends A { // dynamic method dispatch (dynamic = decided while the program is running, not ahead of time by the compiler)
        public B() { // 4. Constructor body runs. This calls B's version of setI
            System.out.println("i from B is " + i);    
        }
        // i becomes 60
        // 5. prints "i from B is 60"
        public void setI(int i) {
            this.i = 3 * i; // 3 * 20 = 60. It uses  setI(20); from public A
        }
    }

    main() runs:
│
├── new A();          ← creates ONE object, runs ONE constructor
│     └── A's constructor runs
│           └── println → "i from A is 40"     (print #1)
│
└── new B();          ← creates ONE object, but runs TWO constructors
      └── B's constructor starts
            └── implicit super() ──> A's constructor runs
                  └── println → "i from A is 60"    (print #2)
            └── (back in B's constructor now)
            └── println → "i from B is 60"          (print #3)
    
    */

    /* 11.8.8 
    Show the output of following program:
public class Test {
  public static void main(String[] args) {
    Apple a = new Apple();
    // Steps 1-4 happen here
    System.out.println(a);
    // step 5: prints "Apple: 1.0"
    System.out.println("---------------");
    // step 6: prints the separator
    
    GoldenDelicious g = new GoldenDelicious(7);
    // steps 7-10 happen here
    System.out.println(g);
    // step 11: prints "GoldenDelicious: 7.0"
    System.out.println("---------------");
    // step 12: print the separator

    Apple c = new GoldenDelicious(8);
    // steps 13 -16 happen here (same pattern as 7-10, weight = 8)
    System.out.println(c);
    // step 17: print "GoldenDelicious: 8.0" (real type wins over variable type)
  }
}

class Apple {
  double weight;
  
  public Apple() { 
    this(1);
    // 1. Redirects immediately to Apple(double weight), passing 1.
    System.out.println("Apple no-arg constructor");
    // 4. Runs AFTER this(1) fully finishes
  }
  
  public Apple(double weight) {
    this.weight = weight;
    // 2. weight becomes 1
    System.out.println("Apple constructor with weight");
    // 3. Prints here, before control returns to the constructor that called it
  }
  
  @Override 
  public String toString() {
    return "Apple: " + weight;
    // 5. Called by println(a). Real type of "a" is Apple, so this version runs.
  }
}

class GoldenDelicious extends Apple {
  public GoldenDelicious() {
    this(5);
    System.out.println("GoldenDelicious non-arg constructor");
    // (This constructor is never acctually called in this program, since main() never does "new GoldenDelicious()"
    // with no args)
  }
  
  public GoldenDelicious(double weight) {
    super(weight);
    // 7. Calls Apple(double weight) first, weight = 7
    this.weight = weight;
    // 9. weight = 7 again (inherited field, reassigned here)
    System.out.println("GoldenDelicious constructor with weight");
    // 10. Prints "GoldenDelicious constructor with weight"
  }
  
  @Override 
  public String toString() {
    return "GoldenDelicious: " + weight;
    // 11. Called by println(g). Real type of "g" is GoldenDelicious, so this version runs
  }
}

main() runs:
│
├── new Apple();
│     └── Apple() starts
│           └── 1. this(1) ──> Apple(double weight=1) runs
│                 ├── 2. weight = 1
│                 └── 3. println → "Apple constructor with weight"
│           └── (back in Apple() no-arg)
│           └── 4. println → "Apple no-arg constructor"
│
├── 5. println(a) ──> a.toString() ──> "Apple: 1.0"
├── 6. println("---------------")
│
├── new GoldenDelicious(7);
│     └── GoldenDelicious(double=7) starts
│           └── 7. super(7) ──> Apple(double weight=7) runs
│                 ├── 8. weight = 7
│                 └── 9. println → "Apple constructor with weight"
│           └── (back in GoldenDelicious(double))
│           └── 10. weight = 7
│           └── 11. println → "GoldenDelicious constructor with weight"
│
├── 12. println(g) ──> g.toString() ──> "GoldenDelicious: 7.0"
├── 13. println("---------------")
│
└── new GoldenDelicious(8);
      └── GoldenDelicious(double=8) starts
            └── 14. super(8) ──> Apple(double weight=8) runs
                  ├── 15. weight = 8
                  └── 16. println → "Apple constructor with weight"
            └── (back in GoldenDelicious(double))
            └── 17. weight = 8
            └── 18. println → "GoldenDelicious constructor with weight"

      19. println(c) ──> c.toString() ──> real type is GoldenDelicious ──> "GoldenDelicious: 8.0"
      20. println("---------------")

Apple constructor with weight
Apple no-arg constructor
Apple: 1.0
---------------
Apple constructor with weight
GoldenDelicious constructor with weight
GoldenDelicious: 7.0
---------------
Apple constructor with weight
GoldenDelicious constructor with weight
GoldenDelicious: 8.0
---------------
    */

}
