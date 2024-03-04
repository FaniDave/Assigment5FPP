package Day5.Lecture;

public class MyConcrete extends MyAbstract{

        //Constructor
         MyConcrete (int value) {
              super(value);
         }

         public void abstractMethod () {
              System.out.println("Implementation of the abstract method.");
         }

    public static void main(String[] args) {
        MyConcrete.staticMethod();
        MyAbstract.staticMethod();

        MyConcrete c = new MyConcrete(12);
        c.instanceMethod();
    }
}
