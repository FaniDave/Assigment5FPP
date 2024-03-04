package Day5.Lecture.PolymorphismThroughInheritance;

public abstract class ClosedCurve {

    //abstract method
    public abstract double computeArea();
}

class Rectangle extends ClosedCurve {

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

class Triangle extends ClosedCurve {

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

class Circle extends ClosedCurve {

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

//Test class
class Test {

    //main method
    public static void main(String[] args) {
        ClosedCurve[] shapes = new ClosedCurve[]{
                new Rectangle(5, 6),
                new Triangle(4, 4),
                new Circle(3)
        };

        for (ClosedCurve c : shapes) {                       //We maintain open-closed principle because
            // we can extend Square class with out any modification
            System.out.println(c.computeArea());
        }
    }
}