package com.hillel.course1.lessons9;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {5, 0, 6, 2, 10, 4, 7};

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i - 1] > numbers[i]) {
                int biggest = numbers[i - 1];
                numbers[i - 1] = numbers[i];
                numbers[i] = biggest;
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}
