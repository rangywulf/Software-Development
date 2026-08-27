public class Circle9_7 {
    /** The radius of the circle */
    double radius;

    /** The number of objects created */
    static int numberOfObjects = 0;

    /** Construct a circle with radius 1 */
    Circle9_7() {
        radius = 1;
        numberOfObjects++;
    }

    /** Construct a circle with a specified radius */
    Circle9_7(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    /** Return numberOfObjects */
    static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /** Return the area of this circle */
    double getArea() {
        return radius * radius * Math.PI;
    }
}
