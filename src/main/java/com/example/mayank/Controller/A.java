package com.example.mayank.Controller;

import com.example.mayank.Model.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class A {

    public void n(){
        List<com.example.mayank.Model.Employee> employees = new ArrayList<>();
        employees.add(new com.example.mayank.Model.Employee("John Doe", 123, 30, 50000, "Mumbai", "IT"));
        employees.add(new com.example.mayank.Model.Employee("Jane Smith", 124, 25, 60000, "Mumbai", "IT"));
        employees.add(new com.example.mayank.Model.Employee("Bob Johnson",125, 35, 45000, "Delhi", "IT"));
        employees.add(new com.example.mayank.Model.Employee("Alice Lee", 126, 28, 55000, "Gurgaon", "IT"));

        // sort the employee
        Collections.sort(employees, Comparator.comparing(com.example.mayank.Model.Employee::getName));
        System.out.println("sort the employee " + employees);
        // find by name starts with "A"
        List<com.example.mayank.Model.Employee> employees1 = employees.stream().filter(employee -> employee.getName().startsWith("A")).collect(Collectors.toList());
        System.out.println("find by name starts with A " + employees1);
        // total salary
        double salarys = employees.stream().mapToInt(Employee::getSalary).sum();
        System.out.println("total Salary" + salarys);
        //total no of employees belongs to specific city
        long count = employees.stream().filter(employee -> employee.getCity().equals("Mumbai")).count();
        System.out.println("City" + count);
    }
}
