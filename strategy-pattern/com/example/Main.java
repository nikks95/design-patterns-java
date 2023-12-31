package com.example;

import com.example.behaviour.FlyWithWings;
import com.example.behaviour.NoFly;
import com.example.behaviour.Quack;
import com.example.behaviour.Squeak;
import com.example.duck.*;

public class Main {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck(new NoFly(), new Squeak());
        Duck mallardDuck = new MallardDuck(new FlyWithWings(),new Quack());

        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

    }
    
}
