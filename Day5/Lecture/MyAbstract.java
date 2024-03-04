package Day5.Lecture;

//MyAbstract class
public abstract class MyAbstract {

    //Fields
    private static int staticVariable;
    private int instanceVariable;

    //Constructor
    public MyAbstract(int value) {
        this.instanceVariable = value;
    }

    public static void staticMethod() {
        System.out.println("My Static method");
    }

    public void instanceMethod() {
        System.out.println("My Instance method");
    }

    public abstract void abstractMethod();
}
