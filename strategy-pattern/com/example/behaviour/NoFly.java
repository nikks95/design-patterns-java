package com.example.behaviour;

public class NoFly implements FlyBehaviour{
    @Override
    public void fly(){
        System.out.println("It cannot fly");
    }
}
