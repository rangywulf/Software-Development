public class TestSumArea {
    /** sumArea Method */
    public static double sumArea(GeometricObjectComparable[] a) { 
        // Create a total and set it to 0
        double totalSum = 0;
        // Loop through every object in the array
        for (int i = 0; i < a.length; i++) {
            // Add that object's area to total
            totalSum += a[i].getArea();
        // Return total
        }
        return totalSum;
    }

    /** Main Method */
    public static void main(String[] args) {
        // Create an array that holds 4 geometric objects
        GeometricObjectComparable[] geoObject = new GeometricObjectComparable[4];
        // Fill the array
        geoObject[0] = new CircleComparable(1);
        geoObject[1] = new CircleComparable(4);
        geoObject[2] = new RectangleComparable(2, 4);
        geoObject[3] = new RectangleComparable(4, 10);
        
        // Call sumArea with the array and save the result
        double total = sumArea(geoObject);
        // Print the total area
        for (int i = 0; i < geoObject.length; i++) {
            System.out.println("Shape " + ( i + 1) + " area: " + geoObject[i].getArea());
        }

        System.out.println("The total area of all objects is: " + total);
    }
}
