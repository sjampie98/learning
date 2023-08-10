package com.hillel.course1.lessons8.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] strings = new String[20];
        inputArrays(strings);

        String[] firstArray = new String[10];
        String[] secondArray = new String[10];
        reBase(strings, firstArray, secondArray);
    }

    private static String[] inputArrays(String[] string) throws IOException {
        for (int i = 0; i < string.length; i++) {
            System.out.println("Please enter word");
            string[i] = READER.readLine();
        }
        return string;
    }

    private static void reBase(String[] array, String[] firstArray, String[] secondArray) {
        for (int i = 0; i < array.length; i++) {
            if (i < 10) {
                firstArray[i] = array[i];
            } else {
                secondArray[i - 10] = array[i];
            }
        }
    }
}
