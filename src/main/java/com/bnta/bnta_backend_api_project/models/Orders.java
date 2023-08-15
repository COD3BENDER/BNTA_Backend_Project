package com.bnta.bnta_backend_api_project.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //example said GenerationType.AUTO, so check this if there are issues
    @Column(name = "id")
    private Long id;
    @Column(name = "order_date_time")
    LocalDateTime orderDateTime ;

    public Orders() {
    }

    public Orders(LocalDateTime orderDateTime) {
        this.orderDateTime = orderDateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }

    public void setOrderDateTime(LocalDateTime orderDateTime) {
        this.orderDateTime = orderDateTime;
    }
}
