/*
Author: Jess Stubbs
Date: 09/24/2026

Description: An octagon class that extends GeometricObjectComparable and
implements Cloneable. It stores the length of one side (all eight are
equal) with a getter and setter, calculates the area and perimeter, and
overrides clone to make a copy of the octagon. It inherits compareTo
from its parent class, so octagons can be compared by area.
*/
public class Octagon extends GeometricObjectComparable implements Cloneable {
    private double side;

    public Octagon() {
    }

    public Octagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override 
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    @Override 
    public double getPerimeter() {
        return 8 * side;
    }

    @Override 
    public Object clone() {
        try {
            Octagon copy = (Octagon) super.clone();
            return copy;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }


}
