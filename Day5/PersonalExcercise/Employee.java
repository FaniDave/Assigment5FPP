package Day5.PersonalExcercise;

import java.time.LocalDate;

//Employee class
class Employee {

    //Instance fields
    private String name;
    private double salary;
    private LocalDate hireDate;

    //Constructor
    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDate = LocalDate.of(year, month, day);
    }

    //getters and setters
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

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    //Instance method
    public void raiseSalary(double byPercent) {
        salary += ((salary * byPercent) / 100);
    }
}

//Manager class
class Manager extends Employee {

    //Instance fields
    private double bonus;

    //Constructor
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    //getters and setters

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

//ManagerTest class
class ManagerTest {

    //main method
    public static void main(String[] args) {
        Manager boss = new Manager("Faniel", 120000, 2015, 2, 7);
        Employee[] employees = new Employee[]{
                boss,
                new Employee("Sirak", 80000, 2022, 5, 4),
                new Employee("Asmina", 100000, 2023, 1, 9)
        };

        printInfo(employees);
    }

    //printInfo method
    public static void printInfo(Employee[] employees) {
        for (Employee e : employees) {
            if (e instanceof Manager em) {
                em.raiseSalary(20);
            }
            if (e instanceof Manager em) em.setBonus(4000);
            System.out.println("Name : " + e.getName() + ", Salary : " + e.getSalary());
        }
    }
}