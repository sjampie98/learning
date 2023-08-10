package com.hillel.course2.lesson1;

import java.util.ArrayList;
import java.util.List;

public class IterateMail {
    public static void main(String[] args) {
        List<Integer> numbersCall = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbersCall.add(i + 1);
        }
        System.out.println(numbersCall);

        for (Integer number: numbersCall) {
            System.out.print(number + " ");
        }
    }
}
