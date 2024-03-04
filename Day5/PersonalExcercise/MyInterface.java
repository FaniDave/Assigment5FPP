package Day5.PersonalExcercise;


//MyInterface interface
interface MyInterface {

    //Constant (public static final)
    int CONSTANT = 10;


    //Abstract method ( unimplemented method ) (public abstract) (implicitly public)
    void abstractMethod();

    //Default method ( default ) (implicitly public)
    default void defaultMethod() {
        System.out.println("This is default method");
    }

    //Static method ( static ) (implicitly public)
    static void staticMethod() {
        System.out.println("This is static method");
    }

}

//MyClass class
class MyClass implements MyInterface {

    //Instance method
    @Override
    public void abstractMethod() {
        defaultMethod();
        MyInterface.staticMethod();
        System.out.println("This is Implemented interface");
    }

    //main method
    public static void main(String[] args) {
          MyClass mc = new MyClass();
          mc.abstractMethod();
    }

}