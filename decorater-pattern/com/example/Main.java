package com.example;
import com.example.bevarage.*;
public class Main {
    public static void main(String[] args) {
        Bevarage bevarage = new Expresso();
        System.out.println(bevarage.getDescription()+"  $"+bevarage.cost());
        
        Bevarage mochaBlend = new Mocha(bevarage);
        mochaBlend = new Mocha(mochaBlend);

        System.out.println(mochaBlend.getDescription()+"  $"+mochaBlend.cost());
       
    }
}
