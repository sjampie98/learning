package com.hillel.course2.lesson6.homework;

import java.time.LocalDateTime;

public class Order {

    private OrderStatusEnum status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Order(OrderStatusEnum status, LocalDateTime createdAt) {
        this.status = status;
        this.createdAt = createdAt;
    }

    public OrderStatusEnum getStatus() {
        return status;
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
                "status='" + status + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
