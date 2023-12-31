package com.example.client;

import com.example.observer.Observer;
import com.example.station.WeatherStation;

public class RoomClient implements Observer{
    private WeatherStation observable;
    public RoomClient(WeatherStation observable){
        this.observable = observable;
    }
    private void display(int temp){
        System.out.println("RoomClient: "+temp+" c");

    }
    @Override
    public void update(){
            display(this.observable.getTemperature());
    }
}
