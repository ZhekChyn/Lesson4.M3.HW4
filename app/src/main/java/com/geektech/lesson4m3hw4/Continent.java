package com.geektech.lesson4m3hw4;

public class Continent {
    private String nameOfContinent;
    private String flagOfContinent;

    public Continent(String nameOfContinent, String flagOfContinent) {
        this.nameOfContinent = nameOfContinent;
        this.flagOfContinent = flagOfContinent;
    }

    public String getNameOfContinent() {
        return nameOfContinent;
    }

    public void setNameOfContinent(String nameOfContinent) {
        this.nameOfContinent = nameOfContinent;
    }

    public String getFlagOfContinent() {
        return flagOfContinent;
    }

    public void setFlagOfContinent(String flagOfContinent) {
        this.flagOfContinent = flagOfContinent;
    }
}
