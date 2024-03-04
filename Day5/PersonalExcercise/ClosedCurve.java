package Day5.PersonalExcercise;


//ClosedCurve (Interface)
public interface ClosedCurve {

    //abstract method
    double computeArea();
}

//Triangle class
class Triangleee implements ClosedCurve {

    //Instance fields
    private double base;
    private double height;

    //Constructor
    public Triangleee(double side1, double side2, double side3) {
        if ((side1 + side2 <= side3) || ((side1 + side3) <= side2) || ((side2 + side3) <= side1)) {
            System.out.println("Default Sides");
        }
        computeBaseHeight(side1, side2, side3);
    }

    //Instance method
    @Override
    public double computeArea() {
        return (0.5 * base * height);
    }

    public void computeBaseHeight(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
    }
}

//Rectangle class
class Rectangleee implements ClosedCurve {

    //Instance fields
    private double width;
    private double length;

    //Constructor
    public Rectangleee(double width, double length) {
        this.width = width;
        this.length = length;
    }

    //Instance method
    @Override
    public double computeArea() {
        return (length * width);
    }
}

//Circle class
class Circleee implements ClosedCurve {

    //Instance fields
    private double radius;

    //Constructor
    public Circleee(double radius) {
        this.radius = radius;
    }

    //Instance method
    @Override
    public double computeArea() {
        return (Math.PI * Math.pow(radius, 2));
    }
}

//Square class (Child of Rectangle class)
class Squareee extends Rectangleee {

    //Instance fields
    private double side;

    //Constructor
    public Squareee(double side) {
        super(side, side);
    }
}

//ClosedCurveTest class
class ClosedCurveTest {

    //main method
    public static void main(String[] args) {
        ClosedCurve[] shapes = new ClosedCurve[]{
                new Triangleee(3, 4, 5),
                new Rectangleee(5, 4),
                new Circleee(7),
                new Squareee(4)
        };

        AreaOfAllShapes(shapes);
    }

    //AreaOfAllShapes() method
    public static void AreaOfAllShapes(ClosedCurve[] shapes) {
        for (ClosedCurve c : shapes) {
            System.out.println("Area of " + c.getClass().getSimpleName() + " : ");
            System.out.println(c.computeArea());
            System.out.println("*".repeat(50));
        }
    }
}
