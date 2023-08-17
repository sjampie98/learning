package com.hillel.course2.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class DayOfWeekFabric {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input day of week");
        System.out.println(Arrays.toString(DayOfWeek.values()));
        String day = reader.readLine().toUpperCase(Locale.ROOT);
        DayOfWeek dayOfWeek = DayOfWeek.valueOf(day);

        //createTask(dayOfWeek);
        createTask1(dayOfWeek);
    }

    private static String createTask(DayOfWeek dayOfWeek) {
        String task = "";
        switch (dayOfWeek) {
            case MONDAY:
                task = "mon";
                break;
            case TUESDAY:
                task = "tue";
                break;
            case WEDNESDAY:
                task = "wed";
                break;
            case THURSDAY:
                task = "thu";
                break;
            case FRIDAY:
                task = "fri";
                break;
            case SATURDAY:
                task = "sat";
                break;
            case SUNDAY:
                task = "Sun";
                break;
        }

        return task;
    }

    private static void createTask1(DayOfWeek dayOfWeek) {
        Map<DayOfWeek, String> map = new HashMap<>();
        map.put(DayOfWeek.MONDAY, "mon");
        map.put(DayOfWeek.TUESDAY, "tue");
        map.put(DayOfWeek.WEDNESDAY, "wed");
        map.put(DayOfWeek.THURSDAY, "thu");
        map.put(DayOfWeek.FRIDAY, "fri");
        map.put(DayOfWeek.SATURDAY, "sat");
        map.put(DayOfWeek.SUNDAY, "sun");

        System.out.println(map.get(dayOfWeek));
    }
}
