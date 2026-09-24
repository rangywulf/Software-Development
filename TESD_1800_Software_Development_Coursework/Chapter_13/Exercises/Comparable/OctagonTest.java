/*
Author: Jess Stubbs
Date: 09/24/2026

Description: A test program for the Octagon class. It creates an octagon
with a side of 5, displays its area and perimeter, clones it, and
compares the original to the clone using compareTo.
*/

public class OctagonTest {
    public static void main(String[] args) {
        // Create an Octagon
        Octagon oct1 = new Octagon(5);

        // Print the area of Oct1
        System.out.println("The area of Oct1: " + oct1.getArea());
        // Print the perimeter of oct1
        System.out.println("The perimeter of oct1: " + oct1.getPerimeter());

        // Clone oct1 to make a second Octagon named oct2
        Octagon oct2 = (Octagon) oct1.clone();

        // Compare oct1 to oct2 using compareTo
        int result = oct1.compareTo(oct2);
        System.out.println("how do they compare? " + result);
    }
}
