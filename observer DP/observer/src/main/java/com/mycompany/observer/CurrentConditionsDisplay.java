/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observer;

/**
 *
 * @author Eslam
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    
    private float temperature;
    private float humidity;
    private final WeatherData weatherData;
    
    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
    @Override
    public void update(float temp, float humidity, float pressure) {
        
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("current conditions:"+ temperature +"f degrees and "+humidity + "% humidity");
    }
    
    
}
