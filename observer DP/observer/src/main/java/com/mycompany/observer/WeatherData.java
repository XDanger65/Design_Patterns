/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eslam
 */
public class WeatherData implements Subject{
    
    private final List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    
    public WeatherData(){
        observers = new ArrayList<Observer>();
    }
    
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update(temperature, humidity, pressure);
        }
    }
    public void measurementsChanged(){
        notifyObservers();
    }
    public void setMeasurements(float temprature, float humidity , float pressure){
        this.temperature = temperature ;
        this.humidity = humidity;
        this.pressure = pressure;
    }
    
}
