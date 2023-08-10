package com.hillel.course1.lessons9.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) throws IOException {
        int[] randomNumbers = new int[10];
        int[] inputNumbers = new int[10];

        randomNumbers(randomNumbers);
        inputNumbers(inputNumbers);
        sorting(randomNumbers);
        sorting(inputNumbers);

        System.out.println(Arrays.toString(randomNumbers));
        System.out.println(Arrays.toString(inputNumbers));

        equals(randomNumbers, inputNumbers);
    }

    private static int[] randomNumbers(int[] numbers) {
        int max = 10;
        int min = 1;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * (max - min) + min);
        }
        System.out.println(Arrays.toString(numbers));

        return numbers;
    }

    private static int[] inputNumbers(int[] numbers) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number 0 to 10: ");
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        return numbers;
    }

    private static void sorting(int[] arrays) {
        Arrays.sort(arrays);
    }

    private static void equals(int[] randomNumbers, int[] inputNumbers) {
        int sum = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] == inputNumbers[i]) {
                sum++;
            }
        }
        System.out.println("Count equals: " + sum);
    }
}
