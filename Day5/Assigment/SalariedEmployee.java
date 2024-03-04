package Day5.Assigment;

//SalariedEmployee (Child class of Employee)
public class SalariedEmployee extends Employee {

    //Instance fields
    private double weeklySalary;

    //Constructor
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNum, double weeklySalary) {
        super(firstName, lastName, socialSecurityNum);
        this.weeklySalary = weeklySalary;
    }

    //Instance method
    @Override
    public double getPayment() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", weeklySalary=" + weeklySalary + "\'" +
                "}";
    }

    ////Getters and setters
    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
}
