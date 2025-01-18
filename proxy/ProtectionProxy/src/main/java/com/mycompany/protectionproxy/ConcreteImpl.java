/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.protectionproxy;

/**
 *
 * @author Eslam
 */
public class ConcreteImpl implements DBInterface{

    @Override
    public void ExecuteQuery(String query) {
        System.out.println("DB excute query");
    }
    
}
