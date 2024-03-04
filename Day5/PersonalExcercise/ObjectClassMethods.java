package Day5.PersonalExcercise;

import java.util.Objects;

//Company class
class Companyy {

    //Instance fields
    private String name;
    private int numEmp;

    //Constructor
    public Companyy(String name, int numEmp) {
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

    //toString() method
    @Override
    public String toString() {
        return "Company{" + "\'" +
                "name=" + name + "\'" +
                ", numEmp=" + numEmp + "\'" +
                "}";
    }

    //Same Class Strategy of overriding the equals() method
//     @Override
//     public boolean equals (Object obj) {
//          if(this == obj) return true;
//          if(obj == null || this.getClass() != obj.getClass()) return false;
//          Companyy comp = (Companyy) obj;
//          return (name.equals(comp.name)) && (numEmp == comp.numEmp);
//     }


    //instanceof Strategy for overriding the equals() method
    @Override
    public boolean equals (Object obj) {
         if(this == obj) return true;
         if(obj == null || !(obj instanceof Companyy)) return false;
         Companyy comp = (Companyy) obj;
         return (name.equals(comp.name)) && (numEmp == comp.numEmp);
    }

    @Override
    public int hashCode () {
         return Objects.hash(name, numEmp);
    }
}

    public class ObjectClassMethods {

        //main method
        public static void main(String[] args) {
            Companyy comp1 = new Companyy("Google", 50000);
            Companyy comp2 = new Companyy("Google", 40000);
            System.out.println(comp1.toString());
            System.out.println(comp1.equals(comp2));
            System.out.println(comp1.hashCode());
            System.out.println(comp2.hashCode());
        }
    }

