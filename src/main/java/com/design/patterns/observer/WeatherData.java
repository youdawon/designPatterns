package com.design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData {

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer ob){
        observers.add(ob);
    }

    public void removeObserver(Observer ob){
        observers.remove(ob);
    }

    public void notifyObservers(){
        observers.forEach(observer -> {observer.update(temperature, humidity, pressure);});
    }

    public void measurementChanged(){
        notifyObservers();
    }

    public void setMeasurement(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
