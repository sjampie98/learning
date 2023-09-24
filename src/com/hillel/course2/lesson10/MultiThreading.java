package com.hillel.course2.lesson10;

import java.util.ArrayList;
import java.util.List;

public class MultiThreading {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("thread: " + Thread.currentThread().getName());
        Printer printer = new Printer();
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(printer);
            threads.add(thread);
            thread.start();
        }
        System.out.println("1.thread: " + Thread.currentThread().getName());

        for (Thread thread: threads) {
            thread.join();
        }

        System.out.println("2.thread: " + Thread.currentThread().getName());
    }

    public static class Printer implements Runnable {
        public void run() {
            System.out.println("thread: " + Thread.currentThread().getName());
            System.out.println("Print message");
        }
    }
}
