package Day5.Assigment;

//Secretary class
public class Secretary extends DeptEmployee {

    //Instance fields
    private double overtimeHours;

    //Constructor
    public Secretary(String name, double salary, int year, int month, int day, double overtimeHours) {
        super(name, salary, year, month, day);
        this.overtimeHours = overtimeHours;
    }

    //Getters and Setters

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    //Instance method
    @Override
    public double computeSalary() {
        return super.computeSalary() + (12 * overtimeHours);
    }
}
