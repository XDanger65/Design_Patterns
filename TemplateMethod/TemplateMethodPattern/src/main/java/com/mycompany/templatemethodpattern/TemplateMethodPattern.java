/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.templatemethodpattern;

/**
 *
 * @author Eslam
 */
public class TemplateMethodPattern {

    public static void main(String[] args) {
        
        HouseTemplate houseType = new WoodenHouse();
        houseType.buildHouse();
        System.out.println("============================");
        houseType = new GlassHouse();
        houseType.buildHouse();
        
        
    }
}
