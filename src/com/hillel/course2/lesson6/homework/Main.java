package com.hillel.course2.lesson6.homework;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    static final String FILE_PATH = "/home/amnesia/Documents/text.txt";
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Map<Integer, Order> map = new HashMap<>();
        map = deserialization(map);
        System.out.println(map);
        System.out.println("Hi. press enter to continue. if you want to stop write stop");
        while (!READER.readLine().equals("stop")) {
            int orderNumber = inputOrderNumber();
            createOrUpdateOrder(map, orderNumber);
            System.out.println("If you want to continue press enter. if you want to stop write stop");
        }
        serialization(map);
    }

    private static int inputOrderNumber() {
        int number = 0;
        try {
            System.out.println("Enter order number: ");
            number = Integer.parseInt(READER.readLine());
        } catch (NumberFormatException | IOException e) {
            System.out.println("Error : " + e.getMessage());
            inputOrderNumber();
        }

        return number;
    }

    private static void createOrUpdateOrder(Map<Integer, Order> map, int orderNumber) {
        if (map.containsKey(orderNumber)) {
            updateStatus(map, orderNumber);
        } else {
            createNewOrder(map, orderNumber);
        }
    }

    private static void updateStatus(Map<Integer, Order> map, int orderNumber) {
        Order order = map.get(orderNumber);
        try {
            System.out.println(order.toString());
            OrderStatusEnum newStatus = OrderStatusEnum.valueOf(inputStatus());
            if (checkNewStatus(newStatus, map.get(orderNumber).getStatus())) {
                order.setStatus(newStatus);
                order.setUpdatedAt();
            } else {
                throw new InvalidStatusException("it is impossible to change the status to an earlier one");
            }
            System.out.println(order);
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            updateStatus(map, orderNumber);
        }
    }

    private static String inputStatus() {
        System.out.println("Enter new status for order");
        System.out.println(Arrays.toString(OrderStatusEnum.values()));
        try {
            return READER.readLine().toUpperCase();
        } catch (IOException e) {
            System.out.println("Error : ");
            inputStatus();
        }
        return "";
    }

    private static void createNewOrder(Map<Integer, Order> map, int orderNumber) {
        map.put(orderNumber, new Order(orderNumber, OrderStatusEnum.NEW, LocalDateTime.now(), LocalDateTime.now()));
    }

    private static boolean checkNewStatus(OrderStatusEnum newStatus, OrderStatusEnum oldStatus) {
        switch (oldStatus) {
            case NEW:
                return true;
            case IN_PROGRESS:
                if (newStatus.equals(OrderStatusEnum.NEW)) {
                    return false;
                }
                return true;
            case FINISHED:
                if (newStatus.equals(OrderStatusEnum.NEW) || newStatus.equals(OrderStatusEnum.IN_PROGRESS)) {
                    return false;
                }
                return true;
            case FAILED:
                if (newStatus.equals(OrderStatusEnum.IN_PROGRESS)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    private static void serialization(Map<Integer, Order> map) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH)) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(map);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (Exception e) {
            System.out.println("ERROR : " + e.getMessage());
        }
    }

    private static Map<Integer, Order> deserialization(Map<Integer, Order> map) {
        try (FileInputStream fileInputStream = new FileInputStream(FILE_PATH)) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            return (Map<Integer, Order>) objectInputStream.readObject();
        } catch (Exception e) {
            System.out.println("ERROR : " + e.getMessage());
            return map;
        }
    }
}
