/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorator2;

/**
 *
 * @author Eslam
 */
public class Cheese extends PizzaDecorator{
    public Cheese(Pizza myPizza) {
        super(myPizza);
    }

    @Override
    public String GetDescription() {
        return MyPizza.GetDescription() + " With Cheese";
    }

    @Override
    public double Cost() {
        return MyPizza.Cost() + 30;
    }
}