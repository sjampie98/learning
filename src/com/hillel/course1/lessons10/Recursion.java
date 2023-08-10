package com.hillel.course1.lessons10;

public class Recursion {
    public static void main(String[] args) {
        int n = 15;

        System.out.println(recursion(n));
    }

    private static int recursion(int number) {
        if (number == 1) {
            return number;
        }
        return number * recursion(number - 1);
    }
}
