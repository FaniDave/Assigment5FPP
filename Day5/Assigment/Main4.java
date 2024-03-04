package Day5.Assigment;

//Main4 class
public class Main4 {

    //main method
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new CommissionEmployee("Faniel", "Abraha", "12345", 5000, 4),
                new HourlyEmployee("Sirak", "Dawit", "90875", 18, 12),
                new SalariedEmployee("Diana", "Zhgta", "45677", 1500),
                new BasePlusCommissionEmployee("Petros", "Andom", "56435", 8000, 5, 1000),
                new SalariedEmployee("Asmina", "Hintsa", "36789", 1400)
        };

        //Invoking totalSalaries() method
        totalSalaries(employees);
    }

    //totalSalaries() method
    public static void totalSalaries(Employee[] employees) {
        int sum = 0;
        for (Employee emp : employees) {
            sum += emp.getPayment();
            System.out.println(emp.toString());
        }
        System.out.println("Sum of All Salaries : " + sum);
    }
}
