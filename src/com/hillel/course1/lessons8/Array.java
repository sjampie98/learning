package com.hillel.course1.lessons8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int[] numbers = new int[10];

        inputArray(numbers);
        printArrayReverse(numbers);
    }

    private static int[] inputArray(int[] numbers) {
        System.out.println("Enter 10 numbers:");
        try {
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(READER.readLine());
            }
        } catch (Exception e) {
            System.out.println("Durak vvedu 4uslo");
            inputArray(numbers);
        }

        return numbers;
    }

    private static void printArrayReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
