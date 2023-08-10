package com.hillel.course1.lessons8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task1 {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int[] numbers = new int[10];

        inputArray(numbers);
        result(numbers);
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

    private static void result(int[] array) {
        System.out.println(Arrays.stream(array).max());
        System.out.println(Arrays.stream(array).min());
    }
}
