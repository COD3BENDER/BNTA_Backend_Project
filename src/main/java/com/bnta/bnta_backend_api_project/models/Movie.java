package com.bnta.bnta_backend_api_project.models;

public class Movie extends Product{

    private Long id;

    private double rating;

    private int runTime;

    public Movie() {

    }

    public Movie(String creator, String title, double price, double cost, int availableQuantity, double rating, int runTime) {
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
