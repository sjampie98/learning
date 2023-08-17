package com.hillel.course2.lesson8;

import com.hillel.course2.lesson6.homework.Order;
import com.hillel.course2.lesson6.homework.OrderStatusEnum;

import java.io.*;
import java.time.LocalDateTime;

public class Serialization {
    public static void main(String[] args) {
        Order order = new Order(1, OrderStatusEnum.NEW, LocalDateTime.now(), LocalDateTime.now());

        serialization(order);
        deserialization(order);
    }

    private static void serialization(Order order) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/home/amnesia/Documents/textTestSerialization.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(order);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void deserialization(Order order) {
        try {
            FileInputStream fileInputStream = new FileInputStream("/home/amnesia/Documents/textTestSerialization.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            order = (Order) objectInputStream.readObject();
            System.out.println(order.toString());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
