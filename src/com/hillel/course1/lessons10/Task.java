package com.hillel.course1.lessons10;

public class Task {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int n = 0; n < 10; n++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println();
        for (int j = 0; j < 10; j++) {
            for (int k = 0; k <= j; k++) {
                System.out.print("#  ");
            }
            System.out.println();
        }
    }
}
