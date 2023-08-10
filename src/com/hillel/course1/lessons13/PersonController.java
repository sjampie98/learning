package com.hillel.course1.lessons13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PersonController {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countPerson = Integer.parseInt(reader.readLine());
        createPerson(countPerson);
    }

    private static void createPerson(int countPerson) {
        Person[] peoples = new Person[countPerson];
        for (int i = 0; i < peoples.length; i++) {
            Person person = new Person();
            person.setName(getNames()[random(getNames().length)]);
            person.setSurname(getSurNames()[random(getSurNames().length)]);
            person.setAge(getAges());
            person.setWeight(getWeight());
            person.setHeight(getHeight());
            peoples[i] = person;
        }
        System.out.println(Arrays.toString(peoples));
    }

    public static int random(int max) {
        int min = 0;

        return (int) (Math.random() * (max - min) + min);
    }

    private static String[] getNames() {
        return new String[]{"Alex", "Oleh", "Ivan", "Maksim"};
    }

    private static String[] getSurNames() {
        return new String[]{"Petrov", "Moroz", "Pavlenko", "Genesh"};
    }

    private static int getAges() {
        int max = 60;
        int min = 18;
        return (int) (Math.random() * (max - min) + min);
    }

    private static int getHeight() {
        int max = 200;
        int min = 150;
        return (int) (Math.random() * (max - min) + min);
    }

    private static int getWeight() {
        int max = 120;
        int min = 60;
        return (int) (Math.random() * (max - min) + min);
    }
}
