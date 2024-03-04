package Day5.Assigment;

//BasePlusCommissionEmployee class (Child class of Employee)
public class BasePlusCommissionEmployee extends CommissionEmployee {

    //Instance fields
    private double baseSalary;

    //Constructor
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNum, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNum, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    //Instance method
    @Override
    public double getPayment() {
        return super.getPayment() + baseSalary;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", baseSalary=" + baseSalary + "\'" +
                "}";
    }

    ////Getters and setters
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
