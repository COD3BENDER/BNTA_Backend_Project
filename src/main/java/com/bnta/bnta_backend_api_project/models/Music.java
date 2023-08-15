package com.bnta.bnta_backend_api_project.models;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "music")
@DiscriminatorValue("music")
public class Music extends Product{
    @Column
    private String decade;
    @Column(name = "song_length")
    private int songLength;

    public Music() {
    }

    public Music(String creator, String title, int price, int cost, int availableQuantity, String decade, int songLength) {
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
