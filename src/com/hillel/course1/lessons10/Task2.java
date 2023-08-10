package com.hillel.course1.lessons10;

public class Task2 {
    public static void main(String[] args) {
        int[][] numbers = {
                {6, 4, 24},
                {1, -9, 8}
        };
        rebaseArray(numbers);

    }

    private static int[][] rebaseArray(int[][] numbers) {
        int numRows = numbers.length;
        int numCols = numbers[0].length;
        int[][] output = new int[numCols][numRows];
        for (int i = 0; i < numCols; i++) {
            for (int j = 0; j < numRows; j++) {
                output[i][j] = numbers[j][i];
            }
        }

        for (int i = 0; i < numCols; i++) {
            for (int j = 0; j < numRows; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }

        return numbers;
    }


}
