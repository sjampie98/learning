package com.hillel.course2.lesson4.homework;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, LocalDate> map = new HashMap<>();
        initMap(map);
        exclude(map);

    }

    private static void initMap(Map<String, LocalDate> map) {
        map.put("Moroz", LocalDate.of(1998, Month.SEPTEMBER, 28));
        map.put("Medvedenko", LocalDate.of(1997, Month.DECEMBER, 31));
        map.put("PavlenkoT", LocalDate.of(1977,Month.JANUARY, 17));
        map.put("PavlenkoY", LocalDate.of(1975, Month.APRIL, 23));
        map.put("PavlenkoA", LocalDate.of(2008, Month.AUGUST, 8));
    }

    private static void exclude(Map<String, LocalDate> map) {
        Iterator<Map.Entry<String, LocalDate>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, LocalDate> entry = iterator.next();
            if (entry.getValue().getMonth().equals(Month.DECEMBER)
                    || entry.getValue().getMonth().equals(Month.JANUARY)
                    || entry.getValue().getMonth().equals(Month.FEBRUARY)) {
                iterator.remove();
            }
        }
        System.out.println(map);
    }
}
