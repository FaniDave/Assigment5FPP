package Day5.Lecture;

import java.time.LocalDate;

public class Employee {

    //Instance fields
    private String name;
    private double salary;
    LocalDate hireDay;

    //Employee Constructor
    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    //Instance method
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}


//Employee class
class Manager extends Employee {

    //Instance fields
    private double bonus;

    //Constructor
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    //getters and setters
    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

//ManagerTest class
class MangerTest {

    //main method
    public static void main(String[] args) {
        Manager boss = new Manager("Faniel", 120000, 2015, 2, 10);
        Employee[] staff = new Employee[]{
                boss,
                new Employee("Sirak", 50000, 2000, 12, 9),
                new Employee("Asmina", 70000, 8000, 2, 23)
        };


        boss.setBonus(20000);

        for (Employee e : staff) {
            e.raiseSalary(50);
            System.out.println("Name : " + e.getName() + ", Salary : " + e.getSalary());
        }
    }
}