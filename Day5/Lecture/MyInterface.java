package Day5.Lecture;

//MyInterface interface
public interface MyInterface {   //MidTerm Exam

    //public static final int MY_CONSTANT = 10;
    int MY_CONSTANT = 10;

    //public abstract void myAbstractMethod()
    void myAbstractMethod();

    //public default void myMethodWithBody() {
    //          System.out.println("Implemented method in an interface");
    //  }
    default void myMethodWithBody() {
        System.out.println("Implemented method in an interface");
    }

    //public static void staticMethodInsideInterface() {
    //         System.out.println("Static method inside an interface.");
    //    }
    static void staticMethodInsideInterface() {
        System.out.println("Static method inside an interface.");
    }
}

class MyClass implements MyInterface {

    //Implemented abstract method
    @Override
    public void myAbstractMethod() {
        MyInterface.staticMethodInsideInterface();
        myMethodWithBody();   //default method can be called without any reference in implemented interface
        System.out.println("My implementation");
    }

    //main method
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.myAbstractMethod();
    }
}