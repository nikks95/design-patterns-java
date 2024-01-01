package com.example.bevarage;

public abstract class Bevarage {
    String description = "Bevarage";
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
