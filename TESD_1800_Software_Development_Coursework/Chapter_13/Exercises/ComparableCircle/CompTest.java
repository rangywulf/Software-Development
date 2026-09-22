public class CompTest {
    public static void main(String[] args) {
        // Create two circles with different radius
        ComparableCircle c1 = new ComparableCircle(5);
        ComparableCircle c2 = new ComparableCircle(8);

        // Store compareTo result
        ComparableCircle bigger = (c1.compareTo(c2) > 0) ? c1 : c2;
      
        if (bigger == c1) {
            System.out.println("c1 radius is bigger, radius: " + bigger.getRadius());
        } else {
            System.out.println("c2 radius is bigger, radius: " + bigger.getRadius());
        }

        // Create a circle and rectangle to be compared
        ComparableCircle c3 = new ComparableCircle(6);
        CompRectangle r1 = new CompRectangle(2, 6);

        // Get the area of both
        double circleArea = c3.getArea();
        double rectArea = r1.getArea();

        if (circleArea > rectArea) {
            System.out.println("circle is larger, area: " + circleArea);
        } else {
            System.out.println("rectangle is larger, area: " + rectArea);
        }
    }
}
