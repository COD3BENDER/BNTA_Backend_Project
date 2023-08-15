package com.bnta.bnta_backend_api_project.models;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "book")
@DiscriminatorValue("book")
public class Book extends Product{
    @Column(name = "year_of_publication")
    private int yearOfPublication;
    @Column(name = "no_of_pages")
    private int noOfPages;
    public Book() {
    }

    public Book(String creator, String title, int price, int cost, int availableQuantity, int yearOfPublication, int noOfPages) {
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
