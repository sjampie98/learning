package com.hillel.course2.lesson6.homework;

import java.time.LocalDateTime;

public class Order {

    private OrderStatusEnum status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Order(OrderStatusEnum status, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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
                "status='" + status + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
