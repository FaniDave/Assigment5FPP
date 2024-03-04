package Day5.Lecture;

//Employeee class
public class Employeee {

    //Constructor
     Employeee(String name, double salary, int y, int m, int d){
            //...
     }

     //Explicit Default Constructor (Since another constructor is present)
     Employeee () {
         //...
     }

}

class Managerrr extends Employeee {
      //No explicit constructor call here, so superclass default constructor is used implicitly
}

//SuperClass
class SuperClass {
    //.....
}

class subClass extends SuperClass {
      //....
}