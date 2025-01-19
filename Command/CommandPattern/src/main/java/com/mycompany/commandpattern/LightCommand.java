/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.commandpattern;

/**
 *
 * @author Eslam
 */
public class LightCommand implements Command{
    private final Light light;
    private boolean prevState;
    
    public LightCommand(Light light){
        this.light = light;
        this.prevState = false;
    }
    @Override
    public void execute() {
        prevState= light.isOn();
        light.toggle();
    }

    @Override
    public void undo() {
        if(prevState != light.isOn()){
            light.toggle();
        }
    }
    
}
