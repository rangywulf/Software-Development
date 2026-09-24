/*
Author: Jess Stubbs
Date: 09/24/2026

Description: An abstract base class for geometric objects. It stores a
color, a filled status, and the date the object was created, with
constructors, getters, setters, and a toString method. Subclasses must
provide their own getArea and getPerimeter methods.
*/

import java.util.Date;

public abstract class GeoObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeoObject() {
        dateCreated = new Date();
    }

    public GeoObject(String color, boolean filled) {
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

}
