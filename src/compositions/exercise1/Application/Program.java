package compositions.exercise1.Application;

import compositions.exercise1.Entities.Department;
import compositions.exercise1.Entities.HourContract;
import compositions.exercise1.Entities.Worker;
import compositions.exercise1.Enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String department = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.next();
        System.out.println("Base salary: ");
        double baseSalary = sc.nextDouble();
        Worker work = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));
        System.out.print("How many contracts to this worker? ");
        byte contracts = sc.nextByte();
        for (int i = 0; i < contracts; i++){
            System.out.println("Enter contract #" + (i + 1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (Hour): ");
            int duration = sc.nextByte();
            HourContract contract = new HourContract(contractDate, valuePerHour, duration);
        }


        System.out.println("Enter month  and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + work.getName());
        System.out.println("Department: " + work.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", work.income(year, month)));




        sc.close();

    }
}
