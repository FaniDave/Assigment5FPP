package Day5.Assigment;

import java.time.LocalDate;

//DeptEmployee class ( Parent class )
public class DeptEmployee {

    //Instance fields
    private String name;
    private double salary;
    private LocalDate hireDate;

    //Constructor
    public DeptEmployee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDate = LocalDate.of(year, month, day);
    }

    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    //Instance method
    public double computeSalary() {
        return salary;
    }
}
