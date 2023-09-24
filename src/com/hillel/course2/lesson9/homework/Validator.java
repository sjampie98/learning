package com.hillel.course2.lesson9.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    static String REGEX_NAME = "^[a-zA-Zа-яА-ЯіІїЇєЄ ]{3,256}$";
    static String REGEX_EMAIL = "^[a-zA-Zа-яА-ЯіІїЇєЄ ]{3,256}$";
    static String REGEX_PHONE_NUMBER = "^(?:\\+?\\d{1,3}[\\s-]?)?(?:\\(\\d{3}\\)|\\d{3})[\\s-]?\\d{3}[\\s-]?\\d{4}$";
    static String REGEX_PASSWORD = "^(?=.*[0-9])(?=.*[!@#$%^&*()])(?=.*[A-Z]).{8,}$";

    public static boolean validateName(String name) {
        Pattern pattern = Pattern.compile(REGEX_NAME);
        Matcher matcher = pattern.matcher(name);
        System.out.println(matcher.matches());
        return matcher.matches();
    }

    public static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(REGEX_EMAIL);
        Matcher matcher = pattern.matcher(email);
        System.out.println(matcher.matches());
        return matcher.matches();
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(REGEX_PHONE_NUMBER);
        Matcher matcher = pattern.matcher(phoneNumber);
        System.out.println(matcher.matches());
        return matcher.matches();
    }

    public static boolean validatePassword(String pass) {
        Pattern pattern = Pattern.compile(REGEX_PASSWORD);
        Matcher matcher = pattern.matcher(pass);
        System.out.println(matcher.matches());
        return matcher.matches();
    }
}
