package Day5.Lecture.PlymorphismThroughInterface;

public class Triangle implements InterfaceClosedCurve {
    //Instance fields
    private double base;
    private double height;

    //Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double computeArea() {
        return (base * height * 0.5);
    }
}
