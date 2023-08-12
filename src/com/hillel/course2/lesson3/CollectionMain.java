package com.hillel.course2.lesson3;

import java.util.ArrayList;
import java.util.List;

public class CollectionMain {

    public static void main(String[] args) {
        int[] numbersArr = new int[5];
        List<Integer> numbersCall = new ArrayList<>();

        System.out.println(numbersArr.length);
        System.out.println(numbersCall.size());

        numbersArr[0] = 1;
        numbersArr[3] = 20;

        numbersCall.add(1);
        numbersCall.add(23);

        numbersCall.set(0, 100);
        numbersCall.add(0, 56);

        System.out.println(numbersArr[3]);
        System.out.println(numbersCall.get(1));

        numbersArr[3] = 0;
        numbersCall.remove(0);
        System.out.println(numbersCall);
    }
}
