package Day5.Assigment;

import java.util.Scanner;

//main method
public class Main2 {

    //main method
    public static void main(String[] args) {

        //Creating an array of DeptEmployee
        DeptEmployee[] employees = new DeptEmployee[]{
                new Professor("Faniel", 120000, 2015, 7, 2, 5),
                new Secretary("Asmina", 80000, 2019, 3, 9, 25),
                new Professor("David", 100000, 2018, 9, 19, 3),
                new Secretary("Danait", 70000, 2020, 6, 29, 20),
                new Professor("Bob", 110000, 2017, 8, 1, 4)
        };

        //Invoking sumOfAllSalaries() in main method
        sumOfAllSalaries(employees);
    }

    //sumOfAllSalaries() method
    public static void sumOfAllSalaries(DeptEmployee[] employees) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Do you wish to see the sum of salaries of all Employees (Respond Y for yes and N for no) : ");
        String yesOrNo = sc.nextLine().toUpperCase();

        if (yesOrNo.equals("Y")) {
            int sum = 0;
            for (DeptEmployee e : employees) {
                sum += e.computeSalary();
            }
            System.out.println("The sum of all salaries of the employees in the Department is : " + sum);
            System.out.println("Thanks....");
        } else if (yesOrNo.equals("N")) {
            System.out.println("Thanks for using this app......");
        } else {
            System.out.println("Please Enter Y for Yes and N for No....Thanks");
        }
        sc.close();
    }
}
