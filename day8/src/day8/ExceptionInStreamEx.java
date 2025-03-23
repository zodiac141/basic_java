package day8;

import day7.Employee;

import java.util.*;

public class ExceptionInStreamEx {
    public static void main(String[] args) {
        List<Employee> data = new ArrayList<Employee>();
        data.add(new Employee(1, "Ramsh", 10000, 121));
        data.add(new Employee(2, "Sush", 200000, 78));
        data.add(new Employee(3, "ah", 30000, 13));
        data.add(new Employee(4, "bsh", 40000, 114));
        data.add(new Employee(5, "mesh", 60000, 121));
        data.add(new Employee(6, "Suresh", 60000, 78));
        data.add(new Employee(7, "aash", 80000, 13));
        data.add(new Employee(8, "absh", 80000, 114));

        data.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));

        System.out.println(data);



    }
}




















//        Optional<Employee> emp1=data.stream().filter(e->e.getEmpcode()==151).map((emp)->emp).findFirst();
//        System.out.println("find by empcode" + emp1);
//        System.out.println("throw exception if not found");
//        try{
//            Employee emp12=data.stream().filter(e->e.getEmpcode()==151).map((emp)->emp).findFirst()
//                    .orElseThrow(()->new EmployeeNotFoundException("emp not found"));
//            System.out.println("find by empcode" + emp12);
//        }catch (EmployeeNotFoundException e){
//            e.printStackTrace();
//        }
//        System.out.println("task completed");
//    }

