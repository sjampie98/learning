package com.hillel.course2.lesson5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {

        HashMap<String, Integer> employees = new HashMap<>();
        employees.put("HR", 20);
        employees.put("Dev", 50);
        employees.put(null, 1);

        System.out.println(employees.get("HR"));

        Set<String> departments = new HashSet<>();
        departments.add("HR");
        departments.add("DEV");
        departments.add("MANAGEMENT");

        departments.remove("DEV");

        for (String department : departments) {
            System.out.println(department);
        }

        if (departments.contains("DEV")) {
            System.out.println("Developers are here");
        } else {
            System.out.println();
        }

    }
}
