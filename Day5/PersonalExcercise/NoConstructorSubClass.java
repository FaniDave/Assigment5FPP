package Day5.PersonalExcercise;

//Super class
class SuperClass {

    //Instance fields
    private String name;

    //Constructor
      public SuperClass (String name) {
           this.name = name;
      }

      public SuperClass () {}


    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class NoConstructorSubClass extends SuperClass {


}
