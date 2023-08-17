package com.hillel.course2.lesson5;

import java.util.TreeSet;

public class Persons {

    public static void main(String[] args) {
        TreeSet<Person> people = new TreeSet<>();
        people.add(new Person("Andriy"));
        people.add(new Person("Julia"));
        people.add(new Person("Alex"));

        System.out.println(people);

    }
}
