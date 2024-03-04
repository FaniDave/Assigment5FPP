package Day5.Assigment;

//Main3 class
public class Main3 {

    //main method
    public static void main(String[] args) {
        Figure[] figures = new Figure[]{
                new UpwardHat(),
                new UpwardHat(),
                new DownwardHat(),
                new FaceMaker(),
                new Vertical()
        };

        //Printing Figures without their class Name
        printFigures(figures);

        System.out.println("*".repeat(50));

        //Printing Figures with their class Name
        printFiguresWithClassName(figures);

    }

    //printFigures method
    public static void printFigures(Figure[] figures) {
        for (Figure f : figures) {
            f.getFigure();
        }
        System.out.println();
    }

    //printFiguresWithClassName() method
    public static void printFiguresWithClassName(Figure[] figures) {
        for (Figure f : figures) {
            System.out.print(f.getClass().getSimpleName() + ": ");
            f.getFigure();
            System.out.println();
        }
    }
}
