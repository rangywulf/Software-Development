public class TestRectangle {
    /** Main Method */
    public static void main(String[] args) {
        // Create rectangle 1
        Rectangle rectangle1 = new Rectangle(4, 40);

        // Create rectangle 2
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        // Print rectangle 1 
        System.out.println("Rectangle 1");
        System.out.println("Width: " + rectangle1.width);
        System.out.println("Height: " + rectangle1.height);
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        // Print rectangle 2
        System.out.println("---------------------");
        System.out.println("Rectangle 2");
        System.out.println("Width: " + rectangle2.width);
        System.out.println("Height: " + rectangle2.height);
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
    }
}
