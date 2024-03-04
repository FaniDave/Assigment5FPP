package Day5.Lecture;

public class InheritanceOrderOfExecution {

      //main method
      public static void main(String[] args) {
          new Parent(5);
          new Child(7);
          new Child(40);
      }
}

class Parent {
     //fields
     static int value;
     int instanceValue;

     //static block
     static {
          value = 10;
          System.out.println("Parent static block value = " + value);
     }

     //instance value
     {
         instanceValue = 20;
         System.out.println("Parent instance block instanceValue = " + instanceValue);
     }

     //Constructor
     Parent(int v) {
          instanceValue = v;
          System.out.println("Parent Constructor instanceValue = " + instanceValue);
     }
}

class Child extends Parent {

       //fields
       static String str;
       String instanceStr;

       //static block
       static {
           str = "Hello World!";
           System.out.println("Child static block value = " + str);
       }

    {
        instanceStr = "Hii";
        System.out.println("Child Instance block value instanceStr = " + instanceStr);
    }

    Child(int val) {
           super(100);
           System.out.println("Child Constructor val = " + val);
    }
}