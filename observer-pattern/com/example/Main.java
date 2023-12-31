package com.example;

import com.example.client.RoomClient;
import com.example.client.PhoneClient;
import com.example.station.WeatherStation;

public class Main {
    public static void main(String[] args) {
        WeatherStation delhiStation = new WeatherStation();

        PhoneClient phone = new PhoneClient(delhiStation);
        RoomClient room = new RoomClient(delhiStation);

        delhiStation.add(phone);
        delhiStation.add(room);

        delhiStation.setTemperature(20);
        delhiStation.notifyO();

        delhiStation.setTemperature(delhiStation.getTemperature()+25);
        delhiStation.notifyO();
    }
}
