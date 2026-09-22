

public class ComparableCircle extends CircleComp implements Comparable<ComparableCircle>{
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius); // Hand the radius up to CircleComp's constructor
    }

    @Override 
    public int compareTo(ComparableCircle o) {
        return Double.compare(getArea(), o.getArea());
    }
}
