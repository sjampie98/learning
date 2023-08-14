package com.hillel.course2.lesson4;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        //Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        //Queue
        Queue<String> queue = new PriorityQueue<>();
        queue.add("One");
        queue.add("Two");
        queue.add("Three");
        queue.add("Four");
        System.out.println(queue);

        System.out.println(queue.peek());


        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("One");
        arrayDeque.add("Two");
        arrayDeque.add("Three");
        arrayDeque.add("Four");
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.poll());
        System.out.println(arrayDeque);


        Map<String, Integer> map = new HashMap<>();

        map.put("apples", 5);
        map.put("tomatoes", 10);


        System.out.println(map.get("apples"));
        System.out.println(map.containsKey("tomatoes"));
        map.remove("tomatoes");
        //цикл по мапі
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue() == 5) {
                map.remove(entry.getKey());
            }
        }
        System.out.println(map);
    }
}
