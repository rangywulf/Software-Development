public class GeometricObject13 {
    private String color;
    private boolean filled = false;

    public GeometricObject13() {
    }

    public GeometricObject13(String color, boolean filled) {
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

    @Override
    public String toString() {
        return "color: " + color + " and filled: " + filled;
    }
}
