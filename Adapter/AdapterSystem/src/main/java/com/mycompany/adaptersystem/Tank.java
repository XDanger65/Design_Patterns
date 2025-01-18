/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adaptersystem;

/**
 *
 * @author Eslam
 */
public class Tank implements Ihero{

    @Override
    public void start() {
        System.out.println("the tank is starting ");
    }

    @Override
    public void run() {
         System.out.println("the tank is running ");
    }

    @Override
    public void stop() {
         System.out.println("the tank is stopping ");
    }
    
}
