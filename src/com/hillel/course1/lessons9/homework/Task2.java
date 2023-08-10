package com.hillel.course1.lessons9.homework;

import java.io.IOException;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) throws IOException {
        int[] randomNumbers = {1, 0, 54, 0, 5, 0, 7, 2};

        Arrays.sort(randomNumbers);

        System.out.println(Arrays.toString(randomNumbers));
    }
}
