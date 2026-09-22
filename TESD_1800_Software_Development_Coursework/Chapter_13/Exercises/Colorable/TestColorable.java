public class TestColorable {
    public static void main(String[] args) {
    // Create an array of 5 Squares
    GeoObject[] shapes = new GeoObject[5];
    shapes[0] = new Square(2);
    shapes[1] = new Square(4);
    shapes[2] = new Square(6);
    shapes[3] = new Square(8);
    shapes[4] = new Square(10);

    for (int i = 0; i < shapes.length; i++) {
        System.out.println("Shape " + i + " area is " + shapes[i].getArea());
        if (shapes[i] instanceof Colorable) {
            ((Colorable) shapes[i]).howToColor();
        }
    }

    }
}
