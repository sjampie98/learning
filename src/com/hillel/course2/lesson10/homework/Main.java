package com.hillel.course2.lesson10.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Main.Counter counter = new Main.Counter();
            List<Thread> threads = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                Thread thread = new Thread(counter);
                threads.add(thread);
                thread.start();

            }
        for (Thread thread: threads) {
            thread.join();
        }
        System.out.println(Counter.COUNTER);
    }

    public static class Counter implements Runnable {
        static int COUNTER = 0;

        private static void nextCounter() {
            for (int i = 0; i < 1000; i++) {
                COUNTER++;
            }
        }

        @Override
        public void run() {
            nextCounter();
        }
    }
}
