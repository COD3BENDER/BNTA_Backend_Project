package com.bnta.bnta_backend_api_project.models;

import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //example said GenerationType.AUTO, so check this if there are issues
    @Column(name = "id")
    private Long id;

    @Column
    String name;

    @Column
    String email;

    @Column(name = "card_number")
    private String cardNumber;

    public Customer() {
    }

    public Customer(String name, String email, String cardNumber) {
        this.name = name;
        this.email = email;
        this.cardNumber = cardNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
