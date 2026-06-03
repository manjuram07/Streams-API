package com.ObjectBasedProblem;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EmployeeWithHighestSalary {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(

                new Employee("Raam", 55000, 50, "JAVA"),
                new Employee("John", 65000, 80, "Python"),
                new Employee("David", 35000, 75, "C++"),
                new Employee("Jay", 40000, 50, "Python")
        );

        // Find the employee with highest salary.
        OptionalInt max = employees.stream()
                .mapToInt(Employee::getSalary).max();

        System.out.println("employee with highest salary : " + max.getAsInt());


        // Find employees whose salary is greater than Raam.
        int raamSalary = employees.stream()
                .filter(employee -> employee.getName().equals("Raam"))
                .mapToInt(Employee::getSalary).findFirst().getAsInt();

        Optional<Employee> first = employees.stream()
                .filter(employee -> employee.getSalary() > raamSalary).findFirst();

        System.out.println("employees whose salary is greater than Raam :"+ first.get());


        // Sort employees by salary.
        Stream<Employee> sorted = employees.stream()
                                            .sorted(Comparator.comparing(Employee::getSalary));

        sorted.forEach(employee -> System.out.println(employee.getName()+" : "+ employee.getSalary()));


        // Sort employees by name and then salary.
        List<Employee> list = employees.stream()
                                        .sorted(Comparator.comparing(Employee::getName)
                                                .thenComparing(Employee::getSalary)).toList();

        System.out.println("\nSort employees by name and then salary: ");
        list.forEach(System.out::println);


        // Find the youngest employee.
        Employee employee = employees.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .findFirst()
                .get();

        System.out.println("\nFind the youngest employee. "+employee.getName()+" "+employee.getAge());


        // Group employees by age.
        System.out.println("\nGroup employees by age. ");
        Map<Integer, List<Employee>> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getAge));

        collect.forEach((key, value) -> System.out.println(key+" : "+value));

        // Find the department with highest number of employees.
        System.out.println("\nFind the department with highest number of employees");
        Optional<Map.Entry<String, Long>> departmentWithMaxEmployees  = employees.stream()
                                                                                    .collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()))
                                                                                    .entrySet()
                                                                                    .stream()
                                                                                    .max(Map.Entry.comparingByValue());

        departmentWithMaxEmployees.ifPresent(employee1 -> System.out.println("Department: "+employee1.getKey()+"\nEmployees : "+employee1.getValue()));

        // Find top 3 highest-paid employees.
        System.out.println("\nFind top 3 highest-paid employees.");
        List<Employee> employeesWithHighestSalary = employees.stream()
                                                            .sorted(Comparator.comparing(Employee::getSalary)
                                                                    .reversed())
                                                            .limit(3)
                                                            .toList();

        employeesWithHighestSalary.forEach(System.out::println);
    }
}
