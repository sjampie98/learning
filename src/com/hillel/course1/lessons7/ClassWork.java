package com.hillel.course1.lessons7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClassWork {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        loopWhile();
    }

    private static void loopWhile() throws IOException {
        String input = READER.readLine();
        int sum = 0;
        while (!input.equalsIgnoreCase("sum")) {
            System.out.println("your input: " + input);
            sum += Integer.parseInt(input);
            input = READER.readLine();
        }
        System.out.println(sum);
    }
}
