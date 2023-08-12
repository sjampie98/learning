package com.hillel.course2.lesson3.homework;

public class Main {
    public static void main(String[] args) {
        MyArrayList arr = new MyArrayList();
        arr.set(1, "test1");
        arr.set(2, "test2");
        arr.set(3, "test3");
        arr.set(4, "test4");
        arr.get(3);
        arr.add(4, "string4");
        arr.remove(5);
        arr.add(9, "string9");
        arr.add(10, "string10");
        arr.add(5, "string15");

        System.out.println(arr);
    }
}
