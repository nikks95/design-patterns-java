package com.example.station;

import java.util.ArrayList;
import com.example.observer.Observable;
import com.example.observer.Observer;

public class WeatherStation implements Observable {
    ArrayList<Observer> observers;
    int temperature;
    public WeatherStation(){
        this.observers = new ArrayList<>();
        this.temperature = 0;
    }
    @Override
    public void add(Observer observer){
            observers.add(observer);
    }
    @Override
    public void remove(Observer observer){
        observers.remove(observer);
    }
    @Override
    public void notifyO(){
        for(Observer observer: observers){
            observer.update();
        }
    }
    public int getTemperature(){
        return temperature;
    }
    public void setTemperature(int temperature){
        this.temperature = temperature;
    }
}
