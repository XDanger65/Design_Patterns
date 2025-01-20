/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.templatemethodpattern;

/**
 *
 * @author Eslam
 */
public class GlassHouse extends HouseTemplate{

    @Override
    void buildWalls() {
        System.out.println("Building glass walls");
    }

    @Override
    void buildPillars() {
        System.out.println("Building glass pillars");
    }
    
}
