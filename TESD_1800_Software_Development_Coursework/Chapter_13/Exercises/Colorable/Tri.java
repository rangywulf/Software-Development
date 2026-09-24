/*
Author: Jess Stubbs
Date: 09/24/2026

Description: A triangle class that extends GeoObject and implements
Colorable. It stores three side lengths with getters and setters,
calculates the perimeter and the area (using Heron's formula), and
overrides toString and howToColor to display the sides and the coloring
instructions.
*/
public class Tri extends GeoObject implements Colorable {
    private double side1;
    private double side2;
    private double side3;

    // Default constructor
    public Tri() {
    }

    public Tri(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

     // return side1
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    // return side2
    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    // return side3
    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // return area
    @Override 
    public double getArea() {
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // return perimeter
    @Override 
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }

    @Override 
    public void howToColor() {
        System.out.println("Color all three sides");
    }
}
