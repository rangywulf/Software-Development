/*
Author: Jess Stubbs
Date: 09/24/2026

Description: An abstract base class for geometric objects that can be
compared by area. It stores a color, a filled status, and the date the
object was created, and implements Comparable so objects are compared
by their areas. It also includes a max method that returns the larger
of two objects. Subclasses must provide getArea and getPerimeter.
*/
import java.util.Date;

public abstract class GeometricObjectComparable implements Comparable<GeometricObjectComparable> {
    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricObjectComparable() {
        dateCreated = new Date();
    }

    public GeometricObjectComparable(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override 
    public String toString() {
        return "color: " + color + " and filled: " + filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override 
    public int compareTo(GeometricObjectComparable o) {
        return Double.compare(getArea(), o.getArea());   
    }

    public static GeometricObjectComparable max(GeometricObjectComparable o1, GeometricObjectComparable o2) {
        if (o1.compareTo(o2) > 0) {
            return o1;
        }
        return o2;
    }
}
