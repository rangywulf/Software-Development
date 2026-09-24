/*
Author: Jess Stubbs
Date: 09/24/2026

Description: A test program for the Tri class. It creates an array of
five triangles, then loops through them to display each one's area and,
if the object is Colorable, calls its howToColor method.
*/
public class TriTest {
    public static void main(String[] args) {
        // Create an array that holds 5 GeoObjects
        GeoObject[] shapes = new GeoObject[5]; 
        // Fill the array
        shapes[0] = new Tri(3, 4, 5);
        shapes[1] = new Tri(5, 12, 13);
        shapes[2] = new Tri(6, 8, 10);
        shapes[3] = new Tri(8, 15, 17);
        shapes[4] = new Tri(7, 24, 25);

        // loop through every object in the array
        for (int i = 0; i < shapes.length; i++) {
            // print that object's area
            System.out.println("Shape " + i + " area is " + shapes[i].getArea());
            // if the object is colorable
            if (shapes[i] instanceof Colorable) {
                // call its howToColor method
                ((Colorable) shapes[i]).howToColor();
            }
        }  
    }
}
