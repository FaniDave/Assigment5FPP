package Day5.Assigment;

//Rectangle class
public class Rectangle extends Shape {

    //Instance fields
    protected double width;
    protected double height;

    //Constructor
    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    //Instance methods
    @Override
    public double calculateArea() {
        return (width * height);
    }

    @Override
    public double calculatePerimeter() {
        return ((2 * width) + (2 * height));
    }
}
