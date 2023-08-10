package com.hillel.course1.lessons6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hometask2 {
    static final BufferedReader READER =  new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Please enter first number");
        int firstInt = inputInt();

        System.out.println("Please enter math.operator");
        String operator = READER.readLine();

        System.out.println("Please enter second number");
        int secondInt = inputInt();

        System.out.println(mathOperation(firstInt, operator, secondInt));
    }

    private static int inputInt() throws IOException {
        String input = READER.readLine();

        return Integer.parseInt(input);
    }

    private static int mathOperation(int firstNumber, String mathOperator, int secondNumber) {
        if (mathOperator.equals("+")) {
            return firstNumber + secondNumber;
        } else if (mathOperator.equals("-")) {
            return firstNumber - secondNumber;
        } else if (mathOperator.equals("*")) {
            return firstNumber * secondNumber;
        } else if (mathOperator.equals("/")) {
            return firstNumber * secondNumber;
        }

        /*switch (mathOperator) {
            case "+" :
                return firstNumber + secondNumber;
            case "-" :
                return firstNumber - secondNumber;
            case "*" :
                return firstNumber * secondNumber;
            case "/" :
                return firstNumber / secondNumber;
        }*/

        return 0;
    }
}
