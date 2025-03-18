package day6;

import java.util.ArrayList;

public class EmployeeList {
    public static void main(String[] args) {
        ArrayList<Employee> emplist = new ArrayList<Employee>();
        emplist.add(new Employee(1, "Faraan", 50000,123));
        emplist.add(new Employee(2, "Hashmi", 60000,23));
        emplist.add(new Employee(3, "Suisui", 70000,14));
        emplist.add(new Employee(4, "Ahmed", 80000,112));

        for (Employee e : emplist) {
            System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());
        }
    }
}
