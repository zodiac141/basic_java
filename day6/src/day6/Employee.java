package day6;

public class Employee {
    private int id;
    private String name;
    private double salary;
   private int empcode;
    public Employee(int id, String name, double salary,int empcode) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.empcode=empcode;
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
    public int getEmpcode(){
        return empcode;
    }
    public void setempcode(int empcode){
        this.empcode=empcode;
    }
}
