package Day5.Lecture.PlymorphismThroughInterface;

public class Rectangle implements InterfaceClosedCurve {
    //Instance fields
    private double length;
    private double width;

    //Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double computeArea() {
        return (length * width);
    }
}
