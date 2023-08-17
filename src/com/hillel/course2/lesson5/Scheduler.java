package com.hillel.course2.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Scheduler {
    public static void main(String[] args) throws IOException {

        /*System.out.println(DayOfWeek.WEDNESDAY);

        DayOfWeek day = DayOfWeek.valueOf("FRIDAY");
        System.out.println(day);

        for (DayOfWeek dayOfWeek: DayOfWeek.values()) {
            System.out.println(dayOfWeek);
        }*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input day of week");
        System.out.println(Arrays.toString(DayOfWeek.values()));
        String day = reader.readLine().toUpperCase(Locale.ROOT);
        DayOfWeek dayOfWeek = DayOfWeek.valueOf(day);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Liana", DayOfWeek.TUESDAY));
        students.add(new Student("Nazar", DayOfWeek.MONDAY));
        students.add(new Student("Sofia", DayOfWeek.WEDNESDAY));
        students.add(new Student("Nikita", DayOfWeek.THURSDAY));
        students.add(new Student("Andriy", DayOfWeek.FRIDAY));
        students.add(new Student("Vova", DayOfWeek.SATURDAY));
        students.add(new Student("Mariana", DayOfWeek.SUNDAY));

        Map<DayOfWeek, Student> map = new HashMap<>();
        for (Student student: students) {
            map.put(student.getOnDuty(), student);
        }
        Student onDutyStudent = map.get(dayOfWeek);
        System.out.println(onDutyStudent.getName() + " is on duty on " + dayOfWeek);

        for (Student student : students) {
            //System.out.println(student);
            if (dayOfWeek.equals(student.getOnDuty())) {
                System.out.println(student.getName() + " is on duty on " + dayOfWeek);
            }
        }
    }
}
