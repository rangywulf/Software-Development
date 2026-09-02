public class CastingDemo {
    /** Main method */
    public static void main(String[] args) {
        // Create and initialize two objects
        Object object1 = new Circle(1); // Implicit casting to assign Circle
        Object object2 = new Rectangle(1, 1); // Implicit casting to assign Rectangle

        // Display circle and rectangle: Invoked from lines 5 and 6
        displayObject(object1);
        displayObject(object2);
    }

    /** A method for displaying an object */
    // instanceof is used below to ensure that the source object is an instance of the target class before
    // performing a casting (line 17)
    public static void displayObject(Object object) {
        if (object instanceof Circle) { // explicit casting
            System.out.println("the circle area is " + ((Circle)object).getArea());
            System.out.println("The circle diameter is " + ((Circle)object).getDiameter());
        }
        else if (object instanceof Rectangle) { // explicit casting
            System.out.println("the rectangle area is " + ((Rectangle)object).getArea());
        }
    }

    // explicit casting to Circle and Rectangle is necessary because the getArea and getDiameter methods
    // are not availabe in the Object class.
}
