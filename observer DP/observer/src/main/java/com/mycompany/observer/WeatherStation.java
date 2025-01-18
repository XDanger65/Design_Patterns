/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.observer;

/**
 *
 * @author Eslam
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        
        weatherData.setMeasurements(40, 44, 20.2f);
        
        weatherData.notifyObservers();
    }
}
