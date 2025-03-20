package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeOperations {
    ArrayList<Employee> employees = new ArrayList<>();

    public void createEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee searchEmployee(int empcode) {
        for (Employee employee : employees) {
            if (employee.getEmpcode() == empcode) {
                return employee;
            }
        }
        return null;
    }


    public void DisplayEmployee() {
        if (employees.isEmpty()) {
            System.out.println("Employee list is empty");
            return;
        }

        Collections.sort(employees, (e1, e2) -> e1.getEmpcode() - e2.getEmpcode());
        System.out.println("Employees sorted by empcode:");
        employees.forEach(System.out::println);

        Collections.sort(employees, (e1, e2) -> e1.getName().compareTo(e2.getName()));
        System.out.println("\nEmployees sorted by name:");
        employees.forEach(System.out::println);


        Collections.sort(employees, (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println("\nEmployees sorted by salary:");
        employees.forEach(System.out::println);
    }

    public static void main(String[] args) {
        EmployeeOperations employeeOperations = new EmployeeOperations();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Create Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Display Employees");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter employee id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter employee salary: ");
                    double salary = scanner.nextDouble();

                    System.out.print("Enter employee code: ");
                    int empcode = scanner.nextInt();

                    Employee employee = new Employee(id, name, salary, empcode);
                    employeeOperations.createEmployee(employee);
                    System.out.println("Employee created successfully!");
                    break;

                case 2:
                    System.out.print("Enter employee code to search: ");
                    int search = scanner.nextInt();
                    Employee findEmployee = employeeOperations.searchEmployee(search);

                    if (findEmployee != null) {
                        System.out.println("Employee found: " + findEmployee.getName() +
                                " (ID: " + findEmployee.getId() +
                                ", Emp Code: " + findEmployee.getEmpcode() +
                                ", Salary: " + findEmployee.getSalary() + ")");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 3:
                    employeeOperations.DisplayEmployee();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
