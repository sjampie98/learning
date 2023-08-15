package com.hillel.course2.lesson6;

import java.time.LocalDate;

public class Dates {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate notToday = LocalDate.parse("2020-01-01");
        System.out.println(notToday);

        System.out.println(now.minusDays(10));

        if (notToday.isAfter(now)) {
            System.out.println("maybutne");
        } else {
            System.out.println("prowle");
        }
    }
}
