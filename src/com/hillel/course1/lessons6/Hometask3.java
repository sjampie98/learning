package com.hillel.course1.lessons6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hometask3 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter count apples");
        int countApples = Integer.parseInt(reader.readLine());

        result(countApples);
    }

    private static void result(int apples) {
        int largeBottle = 5;
        int bottle = 3;
        int smallBottle = 1;
        int countLargeBottle;
        int countMediumBottle;
        int countSmallBottle;
        int remainder = 0;

        if (apples >= largeBottle) {
            countLargeBottle = apples / largeBottle;
            remainder = apples % largeBottle;
            System.out.println("Large bottle: " + countLargeBottle);
        }
        if (remainder >= bottle) {
            countMediumBottle = remainder / bottle;
            remainder = remainder % bottle;
            System.out.println("Medium bottle: " + countMediumBottle);
        }
        if (remainder >= smallBottle) {
            countSmallBottle = remainder / smallBottle;
            System.out.println("Small bottle: " + countSmallBottle);
        }
    }
}
