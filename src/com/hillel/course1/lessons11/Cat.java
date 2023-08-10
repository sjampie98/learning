package com.hillel.course1.lessons11;

import java.util.Objects;

public class Cat {

    String name;
    int age;
    int weight;
    String breed;

    public Cat() {
        System.out.println("Cat has been run");
    }
    public Cat(String name, int age, int weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    public Cat(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Cat) {
            Cat cat = (Cat) o;

            return this.weight == cat.weight && this.age == cat.age;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, weight);
    }
}
