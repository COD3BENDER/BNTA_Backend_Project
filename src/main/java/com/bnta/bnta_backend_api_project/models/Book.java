package com.bnta.bnta_backend_api_project.models;

public class Book extends Product{

    private Long id;

    private int yearOfPublication;

    private int noOfPages;

    public Book() {
    }

    public Book(String creator, String title, double price, double cost, int availableQuantity, int yearOfPublication, int noOfPages) {
        super(creator, title, price, cost, availableQuantity);
        this.yearOfPublication = yearOfPublication;
        this.noOfPages = noOfPages;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }
}
