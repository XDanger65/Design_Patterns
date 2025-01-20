/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.writebooktemplate;

/**
 *
 * @author Eslam
 */
public class RomanticBook extends WriteBook{

    @Override
    void writeDescription() {
        System.out.println("writting romantic description");
    }

    @Override
    void writeContent() {
        System.out.println("writting romantic content");
    }
    @Override
    protected void addSponsor(){
        System.out.println("adding sponsor for the book");
    }
    
    
}
