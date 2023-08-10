package com.hillel.course1.lessons6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hometask1 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("First number");
        String a = reader.readLine();

        System.out.println("Second number");
        String b = reader.readLine();

        System.out.println("Third number");
        String c = reader.readLine();

        int aInt = parseStringToInt(a);
        int bInt = parseStringToInt(b);
        int cInt = parseStringToInt(c);

        System.out.println(minInt(aInt, bInt, cInt));
    }

    private static int parseStringToInt(String str) {
        return Integer.parseInt(str);
    }

    private static String minInt(int a, int b, int c) {
        if (a < b && a < c) {
            return "First number is minimal " + a;
        } else if (a > b && b < c) {
            return "Second number is minimal " + b;
        } else {
            return "Third number is minimal " + c;
        }
    }
}
