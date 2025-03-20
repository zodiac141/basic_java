package day8;

import day7.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ExceptionInStreamEx {
    public static void main(String[] args) {
        List<Employee> data = new ArrayList<Employee>();
        data.add(new Employee(1, "Ramesh", 10000, 121));
        data.add(new Employee(2, "Suresh", 20000, 78));
        data.add(new Employee(3, "Rajesh", 30000, 13));
        data.add(new Employee(4, "Mahesh", 40000, 114));
        data.add(new Employee(5, "Ramesh", 50000, 121));
        data.add(new Employee(6, "Suresh", 60000, 78));
        data.add(new Employee(7, "Rajesh", 70000, 13));
        data.add(new Employee(8, "Mahesh", 80000, 114));

        Optional<Employee> emp1=data.stream().filter(e->e.getEmpcode()==151).map((emp)->emp).findFirst();
        System.out.println("find by empcode" + emp1);
        System.out.println("throw exception if not found");
        try{
            Employee emp12=data.stream().filter(e->e.getEmpcode()==151).map((emp)->emp).findFirst()
                    .orElseThrow(()->new EmployeeNotFoundException("emp not found"));
            System.out.println("find by empcode" + emp12);
        }catch (EmployeeNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("task completed");
    }
}
