/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorator2;

/**
 *
 * @author Eslam
 */
public class MexicanPizza extends Pizza{

    @Override
    public String GetDescription() {
        return "Mexican Pizza ";
    }

    @Override
    public double Cost() {
        return 50;
    }
    
}
