package com.ObjectBasedProblem;

public class Employee {

    private String name;
    private int salary;
    private int age;
    private String dept;

    public Employee(String name, int salary, int age, String dept) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "{" +
                "name= " + name +
                ", salary= " + salary +
                ", age= " + age +
                ", dept= "+ dept +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
