/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.writebooktemplate;

/**
 *
 * @author Eslam
 */
public abstract class WriteBook {
    final void writting()
    {
        getIdea();
        writeDescription();
        writeContent();
        addCover();
        addSponsor();
    }
    final void getIdea(){
        System.out.println("the idea is set");
    }
    abstract void writeDescription();
    abstract void writeContent();
    final void addCover(){
        System.out.println("adding cover for the book");
    }
    protected void addSponsor(){}
}
