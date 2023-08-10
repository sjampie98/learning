package com.hillel.course1.lessons7.hometask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int randomInt = randomInt();
        int inputNumber = inputNumber();
        checkOnTrue(randomInt, inputNumber);
    }

    private static int randomInt() {
        int max = 10;
        return (int) (Math.random() * max);
    }

    private static int inputNumber() throws IOException {
        System.out.println("Enter your number 0 to 10 :");
        return Integer.parseInt(READER.readLine());
    }

    private static void checkOnTrue(int random, int number) throws IOException {
        while(random != number) {
            System.out.println("Re-enter number: ");
            number = Integer.parseInt(READER.readLine());
        }
        System.out.println("You win!");
    }
}
