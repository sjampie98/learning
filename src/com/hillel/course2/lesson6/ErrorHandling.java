package com.hillel.course2.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ErrorHandling {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String line = readLine();
        int number = readNumber(10,15);
        System.out.println(line);
    }

    public static String readLine() {
        System.out.println("input string: ");
        try {
            return READER.readLine();
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
            return readLine();
        }
    }

    public static int readNumber(int min, int max) {
        System.out.println("input number: ");
        try {
            int number = Integer.parseInt(READER.readLine());
            if (number < min || number > max) {
                throw new NumberFormatException("Number is incorrect");
            }
            return number;
        } catch (RuntimeException e) {
            System.out.println("ERROR: " + e.getMessage());
            return readNumber(min, max);
        }
        catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
            return 0;
        } finally {
            System.out.println("Finally");
        }
    }
}
