import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        // Create a list to store cities
        ArrayList<String> cityList = new ArrayList<>(); // no-arg constructor assigned to reference cityList

        // Add some cities in the list
        cityList.add("London"); // add method adds strings to the end of the list.
        // cityList now contains [London]
        cityList.add("Denver");
        // cityList now contains [London, Denver]
        cityList.add("Paris");
        // cityList now contains [London, Denver, Paris]
        cityList.add("Miami");
        // cityList now contains [London, Denver, Paris, Miami]
        cityList.add("Seoul");
        // contains [London, Denver, Paris, Miami, Seoul]
        cityList.add("Tokyo");
        // Contains [London, Denver, Paris, Miami, Seoul, Tokyo]

        System.out.println("List size? " + cityList.size()); // invokes size
        System.out.println("Is Miami in the list? " + cityList.contains("Miami")); // contains checks whether the object is in the list.
        System.out.println("The location of Denver in the list? " + cityList.indexOf("Denver")); 
        System.out.println("Is the list empty? " + cityList.isEmpty()); // Print false

        // Insert a new city at index 2
        cityList.add(2, "Xian"); // add(2, "Xian") inserts an object into the list at the specified index
        // Contains [London, Denver, Xian, Paris, Miami, Seoul, Tokyo]

        // Remove a city at index 1
        cityList.remove(1); // removes the object from the list at the specified index
        // Contains [London, Xian, Paris, Miami, Seoul, Tokyo]

        // Display the contents in the list
        System.out.println(cityList.toString());
        // toString() method returns a string representation of the list in the form of [e0.toString(), e1.toString(),
        // ..., ek.toString()], where e0, e1, ..., and ek are the elements in the list

        // Display the contents in the list in reverse order
        for (int i = cityList.size() - 1; i >= 0; i--)
            System.out.print(cityList.get(i) + " "); // get(index) method returns the object at the specified index.
        System.out.println();

        // Create a list to store two circles
        ArrayList<Circle> list = new ArrayList<>();

        // Add two circles
        list.add(new Circle(2));
        list.add(new Circle(3));

        // Display the area of the first circle in the list
        System.out.println("The area of the circle? " + list.get(0).getArea());
    }

}
