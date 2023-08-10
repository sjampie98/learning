package com.hillel.course1.lessons8.homework;

import java.io.IOException;

public class Task1 {

    public static void main(String[] args) throws IOException {
        int[] firstCommand = new int[11];
        int[] secondCommand = new int[11];

        inputArray(firstCommand);
        inputArray(secondCommand);

        output(firstCommand);
        output(secondCommand);

        int averageFirstCommand = average(firstCommand);
        int averageSecondCommand = average(secondCommand);

        printMessage(averageFirstCommand, averageSecondCommand);
    }

    private static int[] inputArray(int[] numbers) {
        int max = 45;
        int min = 18;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * (max - min) + min);
        }
        return numbers;
    }

    private static void output(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    private static int average(int[] array) {
        int sum = 0;
        for (int ar : array) {
            sum += ar;
            sum = sum / array.length;
        }
        return sum;
    }

    private static void printMessage(int firstCommand, int secondCommand) {
        if (firstCommand > secondCommand) {
            System.out.println("First command average age is biggest");
        } else if (secondCommand > firstCommand) {
            System.out.println("Second command average age is biggest");
        } else {
            System.out.println("Average ages is equals");

        }
    }
}
