package Day5.Lecture.PlymorphismThroughInterface;

public class Test {

    //main method
    public static void main(String[] args) {
        InterfaceClosedCurve[] shapes = new InterfaceClosedCurve[]{
                new Rectangle(5, 6),
                new Triangle(4, 4),
                new Circle(3)
        };

        for (InterfaceClosedCurve c : shapes) {                       //We maintain open-closed principle because
            // we can extend Square class without any modification
            System.out.println(c.computeArea());
        }
    }
}
