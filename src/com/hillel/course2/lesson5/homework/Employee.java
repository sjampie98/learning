package com.hillel.course2.lesson5.homework;

public class Employee {

    private String name;
    private String surname;
    private int salary;
    private final EmployeeType employeeType;

    public Employee(String name, String surname, int salary, EmployeeType employeeType) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.employeeType = employeeType;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", employeeType='" + employeeType + '\'' +
                '}';
    }

    public int getSalary() {
        return salary;
    }
}
