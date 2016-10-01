package com.example.quentinvdk.cardviewtp.JavaClasses;

/**
 * Created by quentinvdk on 30/09/16.
 */

public class Albums {
    private String name;
    private String artist;
    private int year;
    private String type;
    private int coverID;

    public Albums(String name, String artist, int year, String type, int coverID) {
        this.name = name;
        this.artist = artist;
        this.year = year;
        this.type = type;
        this.coverID = coverID;
    }





    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public int getYear() {
        return year;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCoverID() {
        return coverID;
    }

    public void setCoverID(int coverID) {
        this.coverID = coverID;
    }
}
