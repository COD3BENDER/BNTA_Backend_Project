package com.bnta.bnta_backend_api_project.models;

public class Music extends Product{
    private Long id;
    private String decade;
    private int songLength;

    public Music() {
    }

    public Music(String creator, String title, double price, double cost, int availableQuantity, String decade, int songLength) {
        super(creator, title, price, cost, availableQuantity);
        this.decade = decade;
        this.songLength = songLength;
    }

    public String getDecade() {
        return decade;
    }

    public void setDecade(String decade) {
        this.decade = decade;
    }

    public int getSongLength() {
        return songLength;
    }

    public void setSongLength(int songLength) {
        this.songLength = songLength;
    }
}
