public class 9_9 {
    /* 9.9.1
    What is an accessor method?
    - Accessor method is for retrieving private data value
    What is a mutator method?
    - setter method that changes a private data value
    What are the naming conventions for accessor methods and mutator methods?
    - for non-boolean values getDataFieldName()
    - for boolean values isDataFieldName()
    - setDataFieldName(value)
    */

    /* 9.9.2
    What are the benefits of data field encapsulation?
    - Prevent direct modifications of data fields. 
    - Maintain the class
    */

    /* 9.9.3
    In the following code, radius is private in the Circle class, and myCircle is an object of the Circle class.
    Does the highlighted code case any problems? If so, explain why. 
public class Circle {
    private double radius = 1;
    // Find the area of this circle 
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        System.out.println("Radius is " + myCircle.radius);
    }
}
    
- Access chain is:
1. Radius is private to Circle
2. main() is a method of Circle
3. Therefore main() counts as "code inside the same class"
4. Therefore accessing myCircle.radius from inside main() is completely legal.

This compiles and runs fine, no error, no warning. private would only block this if main() 
(or whatever code was trying to read .radius) lived in a different class, like if you had 
a separate file called TestCircle.java with its own main() trying to do myCircle.radius from 
outside Circle. That would fail to compile with something like radius has private access in Circle.
*/
}
