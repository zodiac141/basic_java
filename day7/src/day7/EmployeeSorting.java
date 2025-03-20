package day7;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSorting {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Ramesh", 10000, 121));
        list.add(new Employee(2, "Suresh", 20000, 78));
        list.add(new Employee(3, "Rajesh", 30000, 13));
        list.add(new Employee(4, "Mahesh", 40000, 114));

        Collections.sort(list,(e1,e2)->{
            return e1.getEmpcode() - e2.getEmpcode();
        });
        for(Employee employee:list){
            System.out.print(employee);
        }

    }
}
