public class Rectangle {
   /** width and height */
   double width = 1;
   double height = 1;
   
   /** Construct a rectangle object */
   Rectangle() {    
   }

   /** Construct a rectangle object */
   Rectangle(double newWidth, double newHeight) {
    width = newWidth;
    height = newHeight;
   }

   /** Return the area of this rectangle */
   double getArea() {
    return height * width;
   }

   /** Return the perimeter of this rectangle */
   double getPerimeter() {
    return 2 * (height + width);
   }

   
}
