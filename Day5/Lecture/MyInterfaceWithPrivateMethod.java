package Day5.Lecture;

public interface MyInterfaceWithPrivateMethod {

            public static final int num = 1000;
            public abstract void greet();
            private static void myStaticMethod() {
                System.out.println("Hello");
            }
            public default void myMethod() {
                  printSomething();
                  myStaticMethod();
            }
            private void printSomething() {
                 System.out.println("Private method in an interface.");
            }
}

class MyClass2 implements MyInterfaceWithPrivateMethod {

       @Override
       public void greet() {
            System.out.println("Hi");
       }
       public static void main (String[] args) {
            new MyClass2().myMethod();
       }
}
