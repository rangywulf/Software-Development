/*
Author: Jess Stubbs
Date: 09/24/2026

Description: A base class for geometric objects. It stores a color and
whether the object is filled, and provides constructors, getters and
setters for both, plus a toString method that displays them.
*/
public class GeometricObject13 {
    private String color;
    private boolean filled = false;

    public GeometricObject13() {
    }

    public GeometricObject13(String color, boolean filled) {
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

    @Override
    public String toString() {
        return "color: " + color + " and filled: " + filled;
    }
}
