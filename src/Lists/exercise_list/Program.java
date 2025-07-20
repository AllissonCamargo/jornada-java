package Lists.exercise_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int numberOfRegisters = sc.nextInt();

        for (int i = 0; i < numberOfRegisters; i++){
            System.out.println("Emplyee #" + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            System.out.println();
            employees.add(new Employee(id, name, salary));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int employeeId = sc.nextInt();
        for (Employee emp : employees){
            if (emp.getId() == employeeId){
                System.out.print("Enter the percentage: ");
                int percentage = sc.nextInt();
                emp.increaseSalary(percentage);
            }
        }
        System.out.println();
        System.out.println("List of employees");
        for (Employee emp : employees){
            System.out.println(emp);
        }




        sc.close();
    }
}
