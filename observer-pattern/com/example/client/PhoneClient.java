package com.example.client;

import com.example.observer.Observer;
import com.example.station.WeatherStation;

public class PhoneClient implements Observer{
    private WeatherStation observable;
    public PhoneClient(WeatherStation observable){
        this.observable = observable;
    }
    private void display(int temp){
        System.out.println("PhoneClient: "+temp+" c");

    }
    @Override
    public void update(){
            display(this.observable.getTemperature());
    }
}
