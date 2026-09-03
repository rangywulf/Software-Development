public class Checkpoint11_11 {
    /* 11.11.1
    How do you do the following?
    a. Create an ArrayList for storing double values?
    - ArrayList<Double> list = new ArrayList<Double>();
    b. Append an object to the list?
    - list.add(object);
    c. Insert an object at the beginning of a list?
    - list.add(0, object);
    d. Find the number of objects in a list?
    - list.size();
    e. Remove a given object from a list?
    - list.remove(object);
    f. Remove the last object from a list?
    - list.remove(list.size() - 1);
    g. Check whether a given object is in a list?
    - list.contains(object)
    h. Retrive an object at a specified index from a list?
    - list.get(index);
    */

    /* 11.11.2
    Identify the errors in the following code
    ArrayList<String> list = new ArrayList<>();
    list.add("Denver");
    list.add("Austin");
    list.add(new java.util.Date()); // cannot add Date objects to this list
    String city = list.get(0);
    list.set(3, "Dallas"); // no element at index 3 in the list
    System.out.println(list.get(3)); // no element at index 3 in the list
     */

    /* 11.11.3
    Supppose the ArrayList list contains {"Dallas", "Dallas", "Houston", "Dallas"}.
    What is the list after invoking list.remove("Dallas") one time? 
    {"Dallas, "Houston", "Dallas"}
    Does the following code correctly remove all elements with value "Dallas" from the list?
    No. 
    If not, correct the code:
    for (int i = 0, i < list.size(); i++) {
        if (list.remove("Dallas")
            i-- ;
    }

    */

    /* 11.11.4
    Explain why the following code displays [1, 3] rather than [2, 3].
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.remove(1);
    System.out.println(list);
    
    - it removes the int at index 1, which is 2. 
    How do you remove integer value from the list?
    index removal

    */

    /* 11.11.5 
    Explain why the following code is wrong:
    ArrayList<Double> list = new ArrayList<>();
    list.add(1); 

    - list contains double objects. list.add(1) auto convers 1 into an Integer object.
    it will work if you change it to the list.add(1.0)
    */
}
