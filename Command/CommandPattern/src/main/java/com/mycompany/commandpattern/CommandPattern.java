/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.commandpattern;

/**
 *
 * @author Eslam
 */
public class CommandPattern {

    public static void main(String[] args) {
        Light livingRoomLight = new Light("Living Room Light");
        Light bedroomLight = new Light("Bedroom Light");
        Thermostat livingRoomThermostat = new Thermostat("Living Room Thermostat");

        Command toggleLivingRoom = new LightCommand(livingRoomLight);
        Command toggleBedroom = new LightCommand(bedroomLight);
        Command setTemperature = new ThermostatCommand(livingRoomThermostat, 22.0);

       
       SmartHomeController controller = new SmartHomeController();

        
        System.out.println("=== Executing commands ===");
        controller.executeCommand(toggleLivingRoom);
        controller.executeCommand(toggleBedroom); 
        controller.executeCommand(setTemperature);    

      
        System.out.println("\n=== Undoing commands ===");
        controller.undoLastCommand();  
        controller.undoLastCommand();  
        controller.undoLastCommand(); 
    
    }
}
