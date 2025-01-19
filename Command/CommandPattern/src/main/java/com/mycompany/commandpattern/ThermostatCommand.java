/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.commandpattern;

/**
 *
 * @author Eslam
 */
public class ThermostatCommand implements Command{
    private final Thermostat thermostat;
    private final double temperature;
    private Double prevTemperature;
    
    public ThermostatCommand(Thermostat thermostat,double temperature){
        this.thermostat = thermostat;
        this.temperature = temperature;
        this.prevTemperature = null;
    }
    
    @Override
    public void execute() {
        prevTemperature = thermostat.getTemperature();
        thermostat.setTemperature(temperature);
    }

    @Override
    public void undo() {
        if (prevTemperature != null){
            thermostat.setTemperature(prevTemperature);
        }
    }
    
}
