public class CheckPoint11_9 {
    /* 11.9.1
    Indicate true or false for the following statements:
    a. You can always successfully cast an instance of a sbuclass to a superclass
    - True. Ex. casting apple to fruit
    b. You can always successfully cast an instance of a superclass to a subclass 
    - False. You cannot always successfully cast na instance of a superclass to a subclass.
    ExampleL casting fruit to apple is not always successful unless a fruit is an apple.
    */

    /* 11.9.2
    For the GeometricObject and Circle classes in Listings 11.1 and 11.2, answer the following questions:
    a. Assume that circle and object are created as follows:
    
    Circle circle = new Circle(1);
    GeometricObject object = new GeometricObject();

    Are the following Boolean expressions true or false?
    (circle instanceof GeometricObject) - true
    (object instanceof GeometricObject) - true
    (circle instanceof Circle) - true
    (object intsanceof Circle) - false

    b. Can the following statements be compiled?
    Circle circle = new Circle(5);
    GeometricObject object = circle; 
    - Yes, because you can always cast from subclass to superclass

    c. Can the following statements be compiled?
    GeometricObject object = new GeometricObject();
    Circle circle = (Circle)object;
    - ClassCastException error

    */

    /* 11.9.3
    Suppose that Fruit, Apple, Orange, GoldenDelicious, and McIntosh are defined in the 
    following inheritance hierarchy:
               Fruit
                 |
            ------------
            |          |
          Apple      Orange
            |
       ---------------
       |             |
GoldenDelicious  McIntosh 

    Assume the following code is given:

    Fruit fruit = new GoldenDelicious();
    Orange orange = new Orange();

    Answering the following questions:
    a. Is fruit instanceof Fruit?
    - Yes
    b. Is fruit instanceof Orange?
    - no, orange is on a completely separate branch
    c. Is fruit instanceof Apple?
    - Yes, GoldenDelicious extends Apple so they are directly related
    d. Is fruit instanceof GoldenDelicious?
    - Yes, this is literally the actual type of the object
    e. Is fruit instanceof McIntosh?
    - no McIntosh is a sibling of GoldenDelicious and not the same type
    f. Is orange instanceof Orange?
    - yes, matches its own type
    g. Is orange instanceof Fruit?
    - Orange extends Fruit
    h. Is orange instanceof Apple?
    - no, they are unrelated siblings.
    i. Suppose the method makeAppleCider is defined in the Apple class. 
    Can fruit invoke this method? Can orange invoke this method?
    - Yes, fruit can with fruit instanceof Apple. Orange cannot as it's not related to Apple
    j. Suppose the method makeOrangeJuice is defined in the Orange class. 
    Can orange invoke this method? Can fruit invoke this method?
    - yes, orange can invoke as Orange is it's declared type
    - fruit cannot as Orange is a subtype of fruit
    k. Is the statement Orange p = new Apple() legal?
    - no, they are unrelated siblings
    l. Is the statement McIntosh p = new Apple() legal?
    - no. Apple is a superclass, so an explicit downcast would be required
    m. Is the statement Apple p = new McIntosh() legal?
    - yes as McIntosh extends to apple so this upcasting
    */

    /* 11.9.4
    What is wrong in the following code?
 1  public class Test {
 2    public static void main(String[] args) {
 3      Object fruit = new Fruit();
 4      Object apple = (Apple)fruit;
 5    }
 6  }
 7
 8  class Apple extends Fruit {
 9  }
10
11  class Fruit {
12  }

Object apple = (Apple)fruit; Causes a runtime ClassCastingException
    */
}
