package com.bnta.bnta_backend_api_project.models;

public class Product { // need to add entity annotations column and the super mapper
    private Long id;
    protected String creator;
    protected String title;
    protected double price; // should we turn them to ints so (pennies) to avoid division rounding errors?
    protected double cost; // should we turn them to ints so (pennies) to avoid division rounding errors?
    protected int availableQuantity;

    public Product() {

    }

    public Product(String creator, String title, double price, double cost, int availableQuantity) {
        this.creator = creator;
        this.title = title;
        this.price = price;
        this.cost = cost;
        this.availableQuantity = availableQuantity;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
}
