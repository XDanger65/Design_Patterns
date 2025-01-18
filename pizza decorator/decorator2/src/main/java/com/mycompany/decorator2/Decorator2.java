/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.decorator2;

/**
 *
 * @author Eslam
 */
public class Decorator2 {

    public static void main(String[] args) {
         Pizza First_Order = new ItalianPizza();
        First_Order = new Cheese(First_Order);
        First_Order = new Cheese(First_Order);
        First_Order = new Olives(First_Order);
        Pizza Second_Order = new MexicanPizza();
        Second_Order = new Olives(Second_Order);
        Second_Order = new Olives(Second_Order);
        Second_Order = new Olives(Second_Order);
        System.out.println(Second_Order.GetDescription());
        System.out.println(Second_Order.Cost());
        System.out.println(First_Order.Cost());
        System.out.println(First_Order.GetDescription());
    }
}
