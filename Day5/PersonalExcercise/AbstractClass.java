package Day5.PersonalExcercise;

//AbstractClass (abstract)
public abstract class AbstractClass {

    //Fields
    private static int staticVar = 5;
    private int instanceVar;

    //Constructor
    public AbstractClass(int instanceVar) {
        this.instanceVar = instanceVar;
    }

    //Methods
    public static void staticMethod() {
        System.out.println("Static Method");
    }

    public void instanceMethod() {
        System.out.println("Instance Method");
    }

    //Abstract method
      public abstract void abstractMethod ();
}

//Concrete class
class Concrete extends AbstractClass {

      //Constructor
       public Concrete (int instanceVar) {
            super(instanceVar);
       }

       //Implemented abstract method
      @Override
       public void abstractMethod () {
             System.out.println("Implemented abstract method");
       }

       //main method
       public static void main(String[] args) {
           AbstractClass.staticMethod();
           Concrete c = new Concrete(5);
           c.instanceMethod();
           c.abstractMethod();
       }
}