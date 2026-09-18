import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
    // Create Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter side1
    System.out.print("What is the length of side 1 of the triangle? ");
    double side1 = input.nextDouble();

    // Prompt the user to enter side 2
    System.out.print("What is the length of side 2 of the triangle? ");
    double side2 = input.nextDouble();

    // Prompt the user to enter side 3
    System.out.print("What is the length of side 3 of the triangle? ");
    double side3 = input.nextDouble();

    // Prompt the user to enter the color of the triangle
    System.out.print("What is the color of the triangle? ");
    String color = input.next();

    // Prompt the user to enter whether the triangle is filled (true or false)
    System.out.print("Is the triangle filled (true/false)? ");
    boolean filled = input.nextBoolean();        

    // Call the triangle class
    TriangleClass triangle = new TriangleClass(side1, side2, side3);
    
    // Set color
    triangle.setColor(color);

    // Set filled
    triangle.setFilled(filled);

    // Display area, perimeter, color, boolean for filled
    System.out.println("Area: " + triangle.getArea());
    System.out.println("Perimeter: " + triangle.getPerimeter());
    System.out.println("Color: " + triangle.getColor());
    System.out.println("Is it filled? " + triangle.isFilled());

    input.close();
    }
}
