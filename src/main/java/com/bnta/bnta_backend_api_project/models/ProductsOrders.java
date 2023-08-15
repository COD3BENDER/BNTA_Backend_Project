package com.bnta.bnta_backend_api_project.models;

import jakarta.persistence.*;

@Entity
public class ProductsOrders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //example said GenerationType.AUTO, so check this if there are issues
    @Column(name = "id")
    private Long id;
    @Column(name = "quantity_sold")
    private int quantitySold;

    public ProductsOrders() {
    }

    public ProductsOrders(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
