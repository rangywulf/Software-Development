
public class TestComparable {
    public static void main(String[] args) {
        // make two circles with different radi
        CircleComparable c1 = new CircleComparable(5);
        CircleComparable c2 = new CircleComparable(8);

        // ask which one is bigger
        GeometricObjectComparable bigger = GeometricObjectComparable.max(c1, c2);

        // Print the winner's area
        if (bigger == c1) {
            System.out.println("c1 is larger, area: " + bigger.getArea());
        } else {
            System.out.println("c2 is larger, area: " + bigger.getArea());
        }

        // make two rectangles with different sizes
        RectangleComparable r1 = new RectangleComparable(4, 6);
        RectangleComparable r2 = new RectangleComparable(3, 9);

        // ask which one is bigger
        GeometricObjectComparable biggerRect = GeometricObjectComparable.max(r1, r2);

        // Print the winner's area
        if (biggerRect == r1) {
            System.out.println("r1 is larger, area: " + biggerRect.getArea());
        } else {
            System.out.println("r2 is larger, area: " + biggerRect.getArea());
        }
    }
}
