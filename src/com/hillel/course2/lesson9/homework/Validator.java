package com.hillel.course2.lesson9.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    public static boolean validateName(String name) {
        String regex = "^[a-zA-Zа-яА-ЯіІїЇєЄ ]{3,256}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        System.out.println(matcher.matches());
        return matcher.matches();
    }

    public static boolean validateEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        System.out.println(matcher.matches());
        return matcher.matches();
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        String regex = "^(?:\\+?\\d{1,3}[\\s-]?)?(?:\\(\\d{3}\\)|\\d{3})[\\s-]?\\d{3}[\\s-]?\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        System.out.println(matcher.matches());
        return matcher.matches();
    }

    public static boolean validatePassword(String pass) {
        String regex = "^(?=.*[0-9])(?=.*[!@#$%^&*()])(?=.*[A-Z]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pass);
        System.out.println(matcher.matches());
        return matcher.matches();
    }
}
