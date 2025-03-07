import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


abstract class Employee {
    String name;
    int id;

    abstract void CalculateSalary();
    abstract void showDetails();
}


class FulltimeEmployee extends Employee {
    private final int salary = 50000;

    FulltimeEmployee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    void CalculateSalary() {
        System.out.println("Fixed salary of ₹" + salary);
    }

    @Override
    void showDetails() {
        System.out.println("\nFull-time Employee");
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}

// Part-time Employee class
class ParttimeEmployee extends Employee {
    private int hoursWorked;
    private int salary;

    // Constructor
    ParttimeEmployee(String name, int id, int hoursWorked) {
        this.name = name;
        this.id = id;
        this.hoursWorked = hoursWorked;
        this.salary = hoursWorked * 500;
    }

    @Override
    void CalculateSalary() {
        System.out.println("Salary based on hours worked: ₹" + salary);
    }

    @Override
    void showDetails() {
        System.out.println("\nPart-time Employee");
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Salary: ₹" + salary);
    }
}

// Main EMS class
public class EMS {
    private static final List<Employee> employees = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nWelcome to Employee Management System:");
            System.out.println("1. Show Employee Details");
            System.out.println("2. Add New Employee");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> showEmployeeDetails();
                case 2 -> addNewEmployee();
                case 3 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }


    private static void showEmployeeDetails() {
        if (employees.isEmpty()) {
            System.out.println("\nNo employees found!");
            return;
        }

        System.out.println("\n--- Employee Details ---");
        for (Employee e : employees) {
            e.showDetails();
            System.out.println("------------------------");
        }
    }


    private static void addNewEmployee() {
        System.out.print("\nEnter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.println("Select Employee Type:");
        System.out.println("1. Full-time Employee (Fixed Salary: ₹50000)");
        System.out.println("2. Part-time Employee (Hourly Pay: ₹500)");
        System.out.print("Enter your choice: ");
        int empType = sc.nextInt();

        if (empType == 1) {
            employees.add(new FulltimeEmployee(name, id));
            System.out.println("Full-time employee added successfully.");
        } else if (empType == 2) {
            System.out.print("Enter hours worked: ");
            int hoursWorked = sc.nextInt();
            employees.add(new ParttimeEmployee(name, id, hoursWorked));
            System.out.println("Part-time employee added successfully.");
        } else {
            System.out.println("Invalid option! Returning to main menu.");
        }
    }
}
