package com.hillel.course1.lessons11;

public class CatMain {
    public static void main(String[] args) {
        Cat cat = new Cat("Bus9", 15, 11, "dvorova9");
        Cat cat2 = new Cat("Bus9", 16, 11, "dvorova9");
        Cat cat1 = new Cat("Bus9", 15);

        System.out.println(cat2.equals(cat));
    }
}
