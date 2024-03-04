package Day5.PersonalExcercise;


import java.lang.reflect.*;

//Company class
class Company {

    //Instance fields
    private String name;
    private int numEmp;

    //Constructor
    public Company(String name, int numEmp) {
        this.name = name;
        this.numEmp = numEmp;
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumEmp() {
        return numEmp;
    }

    public void setNumEmp(int numEmp) {
        this.numEmp = numEmp;
    }

    //Instance method
    public void internalMethod() {
        System.out.println("This is internal rules");
    }

}

//CompanyReflection class
public class CompanyReflection {

      //main method
      public static void main(String[] args) throws Exception {
          Company comp = new Company("Google", 40000);

          System.out.println("Class Name with package : " + comp.getClass().getName());

          System.out.println("*".repeat(50));

          System.out.println("Class Name : " + comp.getClass().getSimpleName());

          System.out.println("*".repeat(50));

          Field[] fields = comp.getClass().getDeclaredFields();
          System.out.println("Name of the company : " + comp.getName());
          System.out.println("Number of Employee in the Company : " + comp.getNumEmp());
          System.out.println("*".repeat(50));
          System.out.println("All the fields name : ");
          for(Field field : fields) {
               System.out.println(field.getName());
               if(field.getName().equals("name")) {
                   field.setAccessible(true);
                   field.set(comp, "Faniel's Company");
               } else if(field.getName().equals("numEmp")) {
                   field.setAccessible(true);
                   field.set(comp, 50000);
               }
          }
          System.out.println("*".repeat(50));
          System.out.println("Name of the company : " + comp.getName());
          System.out.println("Number of Employee in the Company : " + comp.getNumEmp());
          System.out.println("*".repeat(50));


          Method[] methods = comp.getClass().getDeclaredMethods();
          System.out.println("Name of the Methods : ");
          for(Method method : methods) {
              System.out.println(method.getName());
              if(method.getName().equals("setName")) {
                  method.setAccessible(true);
                  method.invoke(comp, "Leo Company");
              } else if(method.getName().equals("setNumEmp")) {
                  method.setAccessible(true);
                  method.invoke(comp, 150000);
              }
          }
          System.out.println("*".repeat(50));
          System.out.println("Name of the company : " + comp.getName());
          System.out.println("Number of Employee in the Company : " + comp.getNumEmp());
          System.out.println("*".repeat(50));
      }
}
