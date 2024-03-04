package Day5.PersonalExcercise;

//Abstract class (Shape)
abstract class Shape {

        //abstract method
        public abstract double computeArea();
}

//Triangle class
 final class Trianglee extends Shape {

       //Instance fields
       private final double height;
       private final double base;

       //Constructor
       public Trianglee (double height, double base) {
           this.base = base;
           this.height = height;
       }

       //Instance method (Implemented abstract method)
       @Override
       public double computeArea() {
            return (height * base * 0.5);
       }
}

//Rectangle class
final class Rectanglee extends Shape {

        //Instance fields
        private final double length;
        private final double width;

        //Constructor
        public Rectanglee (double length, double width) {
             this.length = length;
             this.width = width;
        }

        //Instance method (Implemented abstract method)
        @Override
        public double computeArea() {
             return (length * width);
        }
}

//Circle class
final class Circlee extends Shape {

       //Instance fields
        private final double radius;

        //Constructor
        public Circlee (double radius) {
             this.radius = radius;
        }

        //Instance method (Implemented abstract method)
        public double computeArea () {
             return (Math.PI * Math.pow(radius, 2));
        }
}
//BestWayOOP class
public class BestWayOOP {

       //main method
       public static void main(String[] args) {
            Shape[] shapes = new Shape[] {
                     new Circlee(5),
                      new Rectanglee(5, 6),
                     new Trianglee(4, 9)
            };

            computeArea(shapes);
       }

       //computeArea() method
       public static void computeArea(Shape[] shapes) {
            for(Shape s : shapes) {
                 System.out.println("Area of " + s.getClass().getSimpleName() + " : " + s.computeArea());
                 System.out.println("*".repeat(50));
            }
       }
}
