package com.bnta.bnta_backend_api_project.models;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "movie")
@DiscriminatorValue("movie")
public class Movie extends Product{
    @Column
    private double rating;
    @Column(name = "run_time")
    private int runTime;

    public Movie() {

    }

    public Movie(String creator, String title, int price, int cost, int availableQuantity, double rating, int runTime) {
        super(creator, title, price, cost, availableQuantity);
        this.rating = rating;
        this.runTime = runTime;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }
}
