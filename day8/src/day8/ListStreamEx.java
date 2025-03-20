package day8;

import day7.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListStreamEx {
    public static void main(String[] args)
    {
        List<Employee> data=new ArrayList<Employee>();
        data.add(new Employee(1, "Ramesh", 10000, 121));
        data.add(new Employee(2, "Suresh", 20000, 78));
        data.add(new Employee(3, "Rajesh", 30000, 13));
        data.add(new Employee(4, "Mahesh", 40000, 114));
        data.add(new Employee(5, "Ramesh", 50000, 121));
        data.add(new Employee(6, "Suresh", 60000, 78));
        data.add(new Employee(7, "Rajesh", 70000, 13));
        data.add(new Employee(8, "Mahesh", 80000, 114));

        data.forEach(employee -> System.out.println(employee));
        System.out.println("salary >7000");
        List<Employee> salwise =data.stream().filter(emp->emp.getSalary()>7000).collect(Collectors.toList());

        salwise.forEach(employee -> System.out.println(employee));
        System.out.println("extracted salary columns");
        List<Double> sal=data.stream().map(emp->emp.getSalary()).collect(Collectors.toList());
        System.out.println(sal);


        System.out.println("extract based on name");
        List<String> names=data.stream().map(emp->emp.getName()).collect(Collectors.toList());
        System.out.println(names);


        System.out.println("extract based on empcode");
        List<Integer> codes=data.stream().map(emp->emp.getEmpcode()).collect(Collectors.toList());
        System.out.println(codes);

    }
}