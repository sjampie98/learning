package com.hillel.course2.lesson8;

import com.hillel.course2.lesson6.homework.Order;
import com.hillel.course2.lesson6.homework.OrderStatusEnum;

import java.io.*;
import java.time.LocalDateTime;

public class Externalization {

    public static void main(String[] args) {
        Order order = new Order(1, OrderStatusEnum.NEW, LocalDateTime.now(), LocalDateTime.now());
        Order order1 = new Order(5, OrderStatusEnum.FINISHED, LocalDateTime.now(), LocalDateTime.now());
      /*  externalization(order);
        externalization(order1);
        deexternalization();*/

    }

    /*private static void externalization(Order order) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/home/amnesia/Documents/textTestSerialization.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            order.writeExternal(objectOutputStream);
            objectOutputStream.flush();
            objectOutputStream.close();
        }  catch (Exception e) {
            throw new RuntimeException(e);
        }
    }*/
   /* private static void deexternalization() {
        try {
            FileInputStream fileInputStream = new FileInputStream("/home/amnesia/Documents/textTestSerialization.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Order order = new Order();
            order.readExternal(objectInputStream);
            System.out.println(order.toString());

        }  catch (Exception e) {
            throw new RuntimeException(e);
        }
    }*/
}
