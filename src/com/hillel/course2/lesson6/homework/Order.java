package com.hillel.course2.lesson6.homework;

import java.io.*;
import java.time.LocalDateTime;

public class Order implements Serializable {

    private int orderNumber;
    private OrderStatusEnum status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Order(int orderNumber, OrderStatusEnum status, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.orderNumber = orderNumber;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    public Order() {
    }

    public OrderStatusEnum getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setStatus(OrderStatusEnum status) {
        this.status = status;
    }

    public void setUpdatedAt() {
        this.updatedAt = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", status='" + status + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
