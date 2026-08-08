package com.AdvancedStreamInterviewQuestions;

import com.ObjectBasedProblem.Employee;

import java.util.Arrays;
import java.util.List;

public class ConvertListOfObjectsIntoDTO {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(

                new Employee("Raam", 55000, 50, "JAVA"),
                new Employee("John", 65000, 80, "Python"),
                new Employee("David", 35000, 75, "C++"),
                new Employee("Jay", 40000, 50, "Python")
        );

        List<EmployeeDTO> list = employees.stream()
                                            .map(employee -> new EmployeeDTO(employee.getName(),
                                                    employee.getSalary(),
                                                    employee.getAge(),
                                                    employee.getDept()))
                                            .toList();

        list.forEach(System.out::println);


    }
}
