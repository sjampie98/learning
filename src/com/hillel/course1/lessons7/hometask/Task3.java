package com.hillel.course1.lessons7.hometask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException, InterruptedException {
        //methodFor();
        methodWhile();
    }

    private static void methodFor() throws IOException, InterruptedException {
        System.out.println("enter count car: ");
        int count = Integer.parseInt(READER.readLine());
        for (int i = 1; i <= count; i++) {
            System.out.println(i + " : ");
            namuluty();
            wash();
            hang();
        }
    }

    private static void methodWhile() throws IOException, InterruptedException {
        System.out.println("enter count car: ");
        int count = Integer.parseInt(READER.readLine());
        int i = 1;
        while(i <= count) {
            System.out.println(i + " : ");
            namuluty();
            wash();
            hang();
            i++;
        }
    }

    private static void namuluty() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("   namuluty");
    }

    private static void wash() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("   wash");
    }

    private static void hang() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("   hang");
    }
}
