package com.hillel.course2.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ContainsMain {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
   
        while (true) {
            String word = reader.readLine().toLowerCase();
            if (word.equals("stop")) {
                break;
            }
            list.add(word);
        }
        System.out.println(list);
        if (list.contains("war")) {
            System.out.println("have blocked word - war");
        }
    }
}
