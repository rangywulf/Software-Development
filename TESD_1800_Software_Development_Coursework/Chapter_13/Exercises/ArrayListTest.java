public static void main(String[] args) {
    ArrayList<Number> list = new ArrayList<>();

    // Autoboxing wraps these into Integer and Double objects
    list.add(8);
    list.add(2.5);
    list.add(-4);
    list.add(10.75);
    list.add(3);

    System.out.println("Before: " + list);
    sort(list);
    System.out.println("After:  " + list);
}