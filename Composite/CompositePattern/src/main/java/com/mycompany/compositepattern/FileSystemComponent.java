/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.compositepattern;

/**
 *
 * @author Eslam
 */
public interface FileSystemComponent {
    public void display(String indent);
    public long getSize();
    public String getName();
}
