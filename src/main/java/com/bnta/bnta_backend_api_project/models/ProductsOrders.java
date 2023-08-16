package com.bnta.bnta_backend_api_project.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
public class ProductsOrders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //example said GenerationType.AUTO, so check this if there are issues
    @Column(name = "id")
    private Long id;
    @Column(name = "quantity_sold")
    private int quantitySold;

    @ManyToOne
    @JoinColumn(name = "product_id")
    @JsonIgnoreProperties({"products_orders"})
    private Product product;

    public ProductsOrders() {
    }

    public ProductsOrders(int quantitySold, Product product) {
        this.quantitySold = quantitySold;
        this.product = product;
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
