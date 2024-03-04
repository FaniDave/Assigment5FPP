package Day5.Assigment;

//Circle Class
public class Circle extends Shape {

    //Instance fields
    protected double radius;

    //Constructor
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    //Instance methods  area = pi * r ^ 2
    @Override
    public double calculateArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double calculatePerimeter() {
        return (2 * Math.PI * radius);
    }
}
