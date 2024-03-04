package Day5.Assigment;

//HourlyEmployee class (Child class of Employee)
public class HourlyEmployee extends Employee {

    //Instance fields
    private double wage;
    private double hours;

    //Constructor
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNum, double wage, double hours) {
        super(firstName, lastName, socialSecurityNum);
        this.wage = wage;
        this.hours = hours;
    }

    //Instance method (Implemented abstract method)
    @Override
    public double getPayment() {
        return (wage * hours);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", wage=" + wage + "\'" +
                ", hours=" + hours + "\'" +
                "}";
    }

    //Getters and Setters
    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
}
