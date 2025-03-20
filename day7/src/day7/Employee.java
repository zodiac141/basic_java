package day7;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
    private int id;
    private String name;
    private double salary;
    private int empcode;

    public Employee(int id, String name, double salary, int empcode) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.empcode = empcode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getEmpcode() {
        return empcode;
    }

    public void setEmpcode(int empcode) {
        this.empcode = empcode;
    }

    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", employee code=" + empcode + "]";
    }


    @Override
    public int compare(Employee o1, Employee o2) {
        return 0;
    }
}
