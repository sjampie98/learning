package com.hillel.course1.lessons7.hometask;

public class Task2 {
    public static void main(String[] args) {
        printNumber();
    }

    private static void printNumber() {
        int firstWrongNumber = 4;
        int secondWrongNumber = 9;
        for (int i = 0; i < 100; i++) {
            String numberAsString = String.valueOf(i);
            if (numberAsString.contains(String.valueOf(firstWrongNumber)) || numberAsString.contains(String.valueOf(secondWrongNumber))) {
                continue;
            }
            System.out.println(i);
        }
    }
}
