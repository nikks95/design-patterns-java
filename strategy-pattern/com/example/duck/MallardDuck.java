package com.example.duck;

import com.example.behaviour.FlyBehaviour;
import com.example.behaviour.QuackBehaviour;

public class MallardDuck extends Duck{
    public MallardDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour){
        super(flyBehaviour,quackBehaviour);
    }
    @Override
    public void display(){
        System.out.println("Mallard duck");
    }
}
