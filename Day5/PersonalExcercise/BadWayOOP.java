package Day5.PersonalExcercise;

//Triangle class
final class Triangle {

    //Instance fields
    private final double base;
    private final double height;

    //Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    //Instance method
    public double computeArea() {
        return (0.5 * base * height);
    }
}

//Rectangle class
final class Rectangle {

    //Instance variables
    private final double width;
    private final double length;

    //Constructor
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    //computeArea method
    public double computeArea() {
        return (length * width);
    }
}

//Circle class
final class Circle {

    //Instance fields
    private double radius;

    //Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    //Instance method
    public double computeArea() {
        return (Math.PI * Math.pow(radius, 2));
    }
}

//BadWayOOp class
public class BadWayOOP {

    //main method
    public static void main(String[] args) {
        Object[] shapes = new Object[]{
                new Circle(5),
                new Rectangle(4, 8),
                new Triangle(7, 9)
        };

        computeArea(shapes);
    }

    //computeArea() method
    public static void computeArea(Object[] shapes) {
        for (Object o : shapes) {
            if (o instanceof Triangle t)
                System.out.println("The area of " + o.getClass().getSimpleName() + " : " + t.computeArea());
            if (o instanceof Rectangle r)
                System.out.println("The area of " + o.getClass().getSimpleName() + " : " + r.computeArea());
            if (o instanceof Circle c)
                System.out.println("The area of " + o.getClass().getSimpleName() + " : " + c.computeArea());
            System.out.println("*".repeat(50));
        }
    }
}
