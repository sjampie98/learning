package com.hillel.course1.lessons11;

import java.util.Random;

public class GeneratorPass {
    public static void main(String[] args) {
        String password = generatePassword();
        System.out.println("Generated password: " + password);
    }

    public static String generatePassword() {
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialCharacters = "_";
        String allCharacters = upperCaseLetters + lowerCaseLetters + digits + specialCharacters;

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        password.append(getRandomChar(upperCaseLetters, random));
        password.append(getRandomChar(lowerCaseLetters, random));
        password.append(getRandomChar(digits, random));
        password.append(getRandomChar(specialCharacters, random));

        for (int i = 4; i < 8; i++) {
            password.append(getRandomChar(allCharacters, random));
        }

        return password.toString();
    }

    private static char getRandomChar(String characters, Random random) {
        int index = random.nextInt(characters.length());
        return characters.charAt(index);
    }
}
