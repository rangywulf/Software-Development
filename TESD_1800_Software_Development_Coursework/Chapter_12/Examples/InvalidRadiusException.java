public class InvalidRadiusException extends Exception {
    private double radius;

    /** Construct an exception */
    public InvalidRadiusException(double radius) {
        super("Invalid radius " + radius);
        this.radius = radius;
    }

    /** Return the radius */
    public double getRadius() {
        return radius;
    }
}

/*
This custom exception class extends java.lang.Exception (line 1). 
The Exception class extends java.lang.Throwable. All the methods 
(e.g., getMessage(), toString(), and printStackTrace()) in Exception 
are inherited from Throwable. 
*/