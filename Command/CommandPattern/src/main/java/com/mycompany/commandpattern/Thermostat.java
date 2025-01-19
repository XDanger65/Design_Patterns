/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.commandpattern;

/**
 *
 * @author Eslam
 */
public class Thermostat {
    private final String name;
    private double temperature;
    
    public Thermostat(String name){
        this.name = name;
        this.temperature = 20.0;
    }
    public void setTemperature(double temperature){
        this.temperature = temperature;
        System.out.println(name + " temperature set to "+ temperature +"C");
    }
    public double getTemperature(){
        return temperature;
    }
}
