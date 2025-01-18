/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorator2;

/**
 *
 * @author Eslam
 */
public abstract class PizzaDecorator extends Pizza {
    
    Pizza MyPizza ;
    
    public PizzaDecorator(Pizza myPizza){
        this.MyPizza = myPizza;
    }
    
    @Override
    public String GetDescription() {
     
        return MyPizza.GetDescription();
    }

    @Override
    public double Cost() {
        return MyPizza.Cost();
    }
    
}
