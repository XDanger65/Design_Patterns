/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorypattern;

/**
 *
 * @author Eslam
 */
public class FactoryPattern {

    public static void main(String[] args) throws IllegalAccessException {
       NotificationFactory factory = new NotificationFactory();
       Notification email = factory.createNotifcation("email");
       email.notifyUser("new email message");
       
       Notification sms = factory.createNotifcation("sms");
       sms.notifyUser("new sms message");
       
       Notification push = factory.createNotifcation("push");
       push.notifyUser("new push message");
    }
}
