package Day5.Assigment;

public class Main1 {

    //main method
    public static void main(String[] args) {

        //a. Create an array of Shape[] to hold at-least five objects for its subtypes.
        Shape[] shapes = new Shape[]{
                new Rectangle("Blue", 6, 8),
                new Circle("Red", 8),
                new Square("Green", 6),
                new Rectangle("Purple", 5, 9),
                new Circle("Orange", 10)
        };

        //printTotal() method is invoked to print the area and perimeter of different shapes using polymorphism
        printTotal(shapes);
    }

    //printTotal method
    public static void printTotal(Shape[] shapes) {

        for (Shape s : shapes) {
            System.out.println(s.calculateArea());
            System.out.println(s.calculatePerimeter());
            System.out.println("*".repeat(50));
        }
    }
}
