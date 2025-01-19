/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.commandpattern;

/**
 *
 * @author Eslam
 */
public class Light {
    private final String name;
    private boolean isOn;
    
    public Light(String name){
        this.name = name;
        this.isOn = false;
    }
    public void toggle(){
        isOn = !isOn;
        System.out.println(name + " is now "+ (isOn?"on" :"off" ));
                
    }
    public boolean isOn(){
        return isOn;
    }
}
