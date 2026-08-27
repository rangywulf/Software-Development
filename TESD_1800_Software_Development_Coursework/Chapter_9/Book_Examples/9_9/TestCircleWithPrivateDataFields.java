public class TestCircleWithPrivateDataFields {
    /** Main Method */
    public static void main(String[] args) {
        // Create a circle with radius 5.0
        Circle9_9 myCircle = new Circle9_9(5.0);
        System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());

        // Increase myCircle's radius by 10%
        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());

        System.out.println("The number of objects created is " + Circle9_9.getNumberOfObjects());
    }
}
