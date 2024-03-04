package Day5.Lecture.PlymorphismThroughInterface;

public class Circle implements InterfaceClosedCurve {

    //Instance fields
    private double radius;

    //Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return (Math.PI * Math.pow(radius, 2));
    }
}
