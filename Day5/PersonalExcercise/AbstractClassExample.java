package Day5.PersonalExcercise;

public abstract class AbstractClassExample {

    //Fields
    private static long id;
    private String name;

    //Constructor
    public AbstractClassExample(long id, String name) {
        this.id = id;
        this.name = name;
    }

    //methods
    public static void staticMethod() {
        System.out.println("This is static method");
    }

    public void instanceMethod() {
        System.out.println("This is instance method");
    }

    public abstract void abstractMethod();
}

//MyConcrete class
class MyConcrete extends AbstractClassExample {

    //Constructor
    public MyConcrete(long id, String name) {
        super(id, name);
    }

    //Instance method (Concrete method) which is implementation of abstractMethod()
    @Override
    public void abstractMethod() {
        System.out.println("This is abstract method");
    }
}

//Test class
class Test {

    //main method
    public static void main(String[] args) {
           MyConcrete mc = new MyConcrete(12234, "Faniel");
           mc.instanceMethod();
           mc.abstractMethod();
           AbstractClassExample.staticMethod();
    }
}
