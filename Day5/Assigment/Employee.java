package Day5.Assigment;

//Employee (Abstract class)
public abstract class Employee {

    //Instance methods
    private String firstName;
    private String lastName;
    private String socialSecurityNum;

    //Constructor
    public Employee(String firstName, String lastName, String socialSecurityNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNum = socialSecurityNum;
    }

    //Abstract method
    public abstract double getPayment();

    //Instance method
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" + "\'" +
                "firsName=" + firstName + "\'" +
                ", lastName=" + lastName + "\'" +
                ", socialSecurityNum" + socialSecurityNum + "\'";
    }

    //Getters and setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNum() {
        return socialSecurityNum;
    }

    public void setSocialSecurityNum(String socialSecurityNum) {
        this.socialSecurityNum = socialSecurityNum;
    }
}
