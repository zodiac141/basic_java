package day6;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeOperations {
    ArrayList<Employee> employees = new ArrayList<Employee>();

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

    public static void main(String[] args) {
        EmployeeOperations employeeOperations = new EmployeeOperations();
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Create Employee");
        System.out.println("2. Search Employee");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        while (true) {
            switch (choice) {
                case 1:
                    System.out.print("Enter employee id: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter employee name: ");
                    String name = scanner.next();
                    System.out.print("Enter employee salary: ");
                    double salary = scanner.nextDouble();
                    System.out.print("Enter employee code: ");
                    int empcode = scanner.nextInt();
                    Employee employee = new Employee(id, name, salary, empcode);
                    employeeOperations.createEmployee(employee);
                    break;

                case 2:
                    System.out.println("Enter employee code to search: ");
                    int search = scanner.nextInt();
                    Employee findEmployee = employeeOperations.searchEmployee(search);
                    if (findEmployee != null) {
                        System.out.println("Employee found: " + findEmployee.getName() + " with id " + findEmployee.getId() + "emp code " + findEmployee.getEmpcode() + " salary " + findEmployee.getSalary());
                    } else {
                        System.out.println("Employee not found");
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");

            }

        }
    }
}


