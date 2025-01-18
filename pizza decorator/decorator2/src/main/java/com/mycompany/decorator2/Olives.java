/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorator2;

/**
 *
 * @author Eslam
 */
public class Olives extends PizzaDecorator{
    
    public Olives(Pizza myPizza) {
        super(myPizza);
    }
    @Override
    public String GetDescription() {
        return MyPizza.GetDescription() + " with Olives";
    }

    @Override
    public double Cost() {
        return MyPizza.Cost() + 20;
    }
    
}
