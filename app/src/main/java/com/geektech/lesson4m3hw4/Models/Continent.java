package com.geektech.lesson4m3hw4.Models;

public class Continent {
    private String nameOfContinent;
    private int flagOfContinent;

    public Continent(String nameOfContinent, int flagOfContinent) {
        this.nameOfContinent = nameOfContinent;
        this.flagOfContinent = flagOfContinent;
    }

    public String getNameOfContinent() {
        return nameOfContinent;
    }

    public void setNameOfContinent(String nameOfContinent) {
        this.nameOfContinent = nameOfContinent;
    }

    public int getFlagOfContinent() {
        return flagOfContinent;
    }

    public void setFlagOfContinent(int flagOfContinent) {
        this.flagOfContinent = flagOfContinent;
    }
}
