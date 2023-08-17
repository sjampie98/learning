package com.hillel.course2.lesson5.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.TreeSet;

public class Employees {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Comparator<Employee> comparator = new EmployeeComparator();
        TreeSet<Employee> employees = new TreeSet<>(comparator.reversed());
        fillEmployees(employees);

        System.out.println(employees);
    }

    private static void fillEmployees(TreeSet<Employee> employees) throws IOException {
        String input = "new";
        while (input.equalsIgnoreCase("new")) {
            inputData(employees);
            System.out.println("If you want add new person write - new");
            input = READER.readLine();
        }
    }

    private static void inputData(TreeSet<Employee> employees) throws IOException {
        System.out.println("input name");
        String name = READER.readLine();
        System.out.println("input surname");
        String surname = READER.readLine();
        System.out.println("input salary");
        int salary = Integer.parseInt(READER.readLine());
        System.out.println("input employee type");
        System.out.println(Arrays.toString(EmployeeType.values()));
        String employeeType = READER.readLine().toUpperCase(Locale.ROOT);
        EmployeeType employeeTypeEqual = EmployeeType.valueOf(employeeType);

        employees.add(new Employee(name, surname, salary, employeeTypeEqual));
    }
}
