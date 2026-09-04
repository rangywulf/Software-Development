public class GeometricTest {
    /** Main Method */
    public static void main(String[] args) {
        // Create a triangle object
        Triangle t = new Triangle(10, 6, 5);
        
        // Set Color
        t.setColor("Red");
        
        // Set filled
        t.setFilled(true);
        
        // Print the triangle's description
        System.out.println(t);
        
        // Print the area
        System.out.println(t.getArea());
        
        // Print the perimeter
        System.out.println(t.getPerimeter());

        // Print the color
        System.out.println(t.getColor());

        // Print if filled
        System.out.println(t.isFilled());
    }
   
}
