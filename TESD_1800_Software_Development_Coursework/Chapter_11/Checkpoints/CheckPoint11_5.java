public class CheckPoint11_5 {
    /* 11.5.1 
    Identify the problems in the following code:


 1  public class Circle {
 2    private double radius;
 3
 4    public Circle(double radius) {
 5      radius = radius; // Must use this.radius = radius
 6    }
 7
 8    public double getRadius() {
 9      return radius;
10    }
11
12    public double getArea() {
13      return radius * radius * Math.PI;
14    }
15  }
16
17  class B extends Circle {
18    private double length;
19
20    B(double radius, double length) {
21      Circle(radius); // Must use super(radius)
22      length = length; // Must use this.length = length
23    }
24
25    @Override
26    public double getArea() {
27      return getArea() * length; // needs to be super.getArea()
28    }
29  }  */

/* 11.5.2
Explain the difference between method overloading and method overriding.
- Overloading means to define multiple methods with the same name but different signatures. 
- Overriding means to provide a new implementation for a method in the subclass.
*/

/* 11.5.3 
if a method in a subclass has the same signature as a method in its superclass with the same return type,
is the method overridden or overloaded?
- Overridden
*/

/* 11.5.4
If a method in a subclass has the same signature as a method in its superclass with a different
return type, will this be a problem?
- Yes. The return type needs to be the same or a compatible return type. */

/* 11.5.5
If a method in a subclass has the same name as a method in its superclass with different parameter types,
is the method overridden or overloaded? 
- Overloaded
*/

/* 11.5.6
What is the benefit of using the @Override annotation?
- It helps to prevent mistakes. It denotes that the annotated method is required to override a method 
in its superclass.
- It forces the compiler to check the signature of the overridden method to ensure that the method
is defined correctly. */
}
