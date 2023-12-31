package com.example.duck;
import com.example.behaviour.FlyBehaviour;
import com.example.behaviour.QuackBehaviour;
public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck(FlyBehaviour flyBehaviour,QuackBehaviour quackBehaviour){
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }
    public abstract void display();

    public void performFly(){
        this.flyBehaviour.fly();
    }
    public void performQuack(){
        this.quackBehaviour.quack();
    }
}
