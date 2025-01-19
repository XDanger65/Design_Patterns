/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eslam
 */
public class Directory implements FileSystemComponent{
    
    private String name;
    private List<FileSystemComponent> children;
    
    public Directory(String name){
        this.name = name;
        this.children = new ArrayList<>();
    }
    public void addComponent(FileSystemComponent component) {
        children.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        children.remove(component);
    }
    
    @Override
    public void display(String indent) {
        System.out.println(indent + "📁 " + name + " (" + getSize() + " bytes)");
        for (FileSystemComponent component : children) {
            component.display(indent + "    ");
        }
    }

    @Override
    public long getSize() {
        return children.stream()
                .mapToLong(FileSystemComponent::getSize)
                .sum();
    }

    @Override
    public String getName() {
        return name;
    }
    
}
