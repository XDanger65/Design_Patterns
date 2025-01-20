/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.templatemethodpattern;

/**
 *
 * @author Eslam
 */
public abstract class HouseTemplate {
    
    final void buildHouse(){
        buildFoundation();
        buildWalls();
        buildPillars();
        buildWindows();
    }
    final void buildFoundation(){
        System.out.println("Building foundation is done");
    }
    abstract void buildWalls();
    abstract void buildPillars();
    
    final void buildWindows(){
        System.out.println("Building windows is done");
    }
    
}
