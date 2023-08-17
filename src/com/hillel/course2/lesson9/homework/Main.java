package com.hillel.course2.lesson9.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String name = inputName();
        String email = inputEmail();
        String phoneNumber = inputPhoneNumber();
        String pass = inputPassword();
        confirmPass(pass);
        User user = new User(name, email, phoneNumber, pass);
        System.out.println(user.toString());
    }

    private static String inputName() {
        System.out.println("Enter your name");
        String name = "";
        try {
            name = READER.readLine();
            while(!Validator.validateName(name)) {
                System.out.println("Name is incorrect!\n no less than 3 characters, no more than 256 characters,\n only Ukrainian / English letters");
                name = READER.readLine();
            }
            System.out.println(123123);
            return name;
        } catch (IOException e) {
            System.out.println("ERROR : " + e.getMessage());
            inputName();
        }
        return name;
    }

    private static String inputEmail() {
        System.out.println("Enter your Email");
        String email = "";
        try {
            email = READER.readLine();
            while(!Validator.validateEmail(email)) {
                System.out.println("Your Email is incorrect!!!");
                email = READER.readLine();
            }
        } catch (IOException e) {
            System.out.println("ERROR : " + e.getMessage());
            inputEmail();
        }
        return email;
    }

    private static String inputPhoneNumber() {
        System.out.println("Enter your Phone number");
        String phoneNumber = "";
        try {
            phoneNumber = READER.readLine();
            while(!Validator.validatePhoneNumber(phoneNumber)) {
                System.out.println("Your Phone number is incorrect!!!");
                phoneNumber = READER.readLine();
            }
        } catch (IOException e) {
            System.out.println("ERROR : " + e.getMessage());
            inputPhoneNumber();
        }
        return phoneNumber;
    }

    private static String inputPassword() {
        System.out.println("Enter your Password");
        String pass = "";
        try {
            pass = READER.readLine();
            while(!Validator.validatePassword(pass)) {
                System.out.println("Your Password is incorrect!!!");
                pass = READER.readLine();
            }
        } catch (IOException e) {
            System.out.println("ERROR : " + e.getMessage());
            inputPassword();
        }
        return pass;
    }

    private static void confirmPass(String pass) throws IOException {
        String passConf = "";
        System.out.println("Confirm your Password");
        while (!pass.equals(passConf)) {
            passConf = READER.readLine();
            if (!pass.equals(passConf)) {
                System.out.println("Please retry");
            }
        }
    }
}
