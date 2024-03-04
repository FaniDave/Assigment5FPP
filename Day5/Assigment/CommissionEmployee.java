package Day5.Assigment;

//CommissionEmployee class (child class of Employee)
public class CommissionEmployee extends Employee {

    //Instance fields
    private double grossSales;
    private double commissionRate;

    //Constructor
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNum, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNum);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    //Instance method (Implemented abstract method)
    @Override
    public double getPayment() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", grossSales=" + grossSales + "\'" +
                ", commissionRate=" + commissionRate +
                "}";
    }

    //Getters and setters
    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
}
