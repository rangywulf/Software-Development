public class CheckPoint11_10 {
    /* 11.10.1
    Does every object have a toString method and an equals method?
    - Yes, because these two methods are defined in the Object class; therefore they are available to
    all Java classes.
    Where do they come from?
    - The subclasses usually override these methods to provide specific information for these methods.
    How are they used? Is it appropriate to overide these methods?
    - The toString() method returns a string representation of the object
    - the equals() method compares the contents of two objects to determine whether they are the same.
     */

    /* 11.10.2
    When overriding the equals method, a common mistake is mistyping its signature in the subclass. 
    For example, the equals method is incorrectly written as equals(Circle circle), as shown in 
    (a) in following the code; instead, it should be equals(Object circle), as shown in (b). 
    Show the output of running class Test with the Circle class in (a) and in (b), respectively.

public class Test {
  public static void main(String[] args) {
    Object circle1 = new Circle(); 
    // 1. Creates a Circle object with radius = 0.0
    // 2. circle1 refers to that Circle, but its variable type is Object
    Object circle2 = new Circle(); // 2. Create circle2 - Circle object 2
    // 3. Creates another Circle object with radius = 0.0
    // 4. circle 2 refers to that Circle, but its variable type is object

    System.out.println(circle1.equals(circle2));
    // 5. Since circle1 is declared as Object, Object.equals(Object) is used.
    // Circle's equals(Circle) does NOT override Object.equals(Object)
    // 6. Object.equals() compares the two object references
    // They are different Circle objects, so it returns false
    // 7. println prints "false"
  }
}

(a)
class Circle {
  double radius; 

  public boolean equals(Circle circle) { 
  // this method is NOT called in this version of Test.
  // equals(Circle) is an overload, not an overide of equals(Object)
    return this.radius == circle.radius;    
  }
}

(b)
class Circle {
  double radius;

  public boolean equals(Object o) { 
  // Circle's equals(Object) overrides Object's equals(Object), so this method runs
    return this.radius == ((Circle)o).radius;
    // o refers to circle2. It is cast to Circle, then the two radii (0.0 and 0.0) are compared.
    // the comparison returns true   
  }
}
If Object is replaced by Circle in the Test class, what would be the output to run Test using
the Circle class in (a) and (b), respectively?
Suppose that circle1.equals(circle2) is replaced by circle1.equals("Binding"), what would happen 
to run Test using the Circle class in (a) and (b), respectively? Reimplement the equals method in 
(b) to avoid a runtime error when comparing circle with a non-circle object.

The output is false if the Circle class in (a) is used. The Circle class has two overloaded methods: 
equals(Circle circle) defined in the Circle class and equals(Object o) defined in the Object class, 
inherited by the Circle class. At compile time, circle1.equals(circle2) is matched to equals(Object o), 
because the declared type for circle1 and circle2 is Object. (Note that either the declared type for 
circle1 and circle2 is Object would cause circle1.equals(circle2) to match circle1.equals(Object circle) 
by the compiler.

The output is true if the Circle class in (b) is used. The Circle class overrides the equals(Object o) 
method defined in the Object class. At compile time, circle1.equals(circle2) is matched to 
equals(Object o) and at runtime the equals(Object o) method implemented in the Circle class is invoked.

In (a), method equals(Object o) is used at both compile time and run time. circle1 and circle2 have 
different addresses, leading to "false" output. Method overriding follows dynamic binding (determined 
by the actual type), but method overloading is always determined by the declared type.

What would be the output if Object is replaced by Circle in the Test class using the Circle class in 
(a) and (b), respectively? The output would be true for (a), because circle1.equals(circle2) matches 
circle1.equals(Circle object) exactly in this case. The output would be true for (b) because 
equals(Object c) is overridden in the Circle class.

With circle1.equals(circle2) replaced by circle1.equals("Binding") and using the the Circle class in 
(a), the equals method in the Object class is used,circle1.equals(circle2) returns false.

With circle1.equals(circle2) replaced by circle1.equals("Binding") and using the the Circle class in 
(b), the equals method in the Circle class is used,since it casts string "Binding" to Circle, it throws 
a casting exception.
(b) should be reimplemented as follows to to avoid a runtime error when comparing circle with a 
non-circle object.
class Circle {
  double radius;

  public boolean equals(Object o) {
    if (o instanceof Circle)
      return this.radius == ((Circle)o).radius;    
    else
      return false;
  }
}
    */
}
