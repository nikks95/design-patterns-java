package com.example.duck;

import com.example.behaviour.FlyBehaviour;
import com.example.behaviour.QuackBehaviour;

public class RubberDuck extends Duck {
        public RubberDuck(FlyBehaviour flyBehaviour,QuackBehaviour quackBehaviour){
            super(flyBehaviour,quackBehaviour);
        }
        @Override
        public void display(){
            System.out.println("Rubber Duck");
        }
}
