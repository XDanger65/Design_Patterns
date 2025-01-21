/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorypattern;

/**
 *
 * @author Eslam
 */
public class NotificationFactory {
    
    public Notification createNotifcation(String channel) throws IllegalAccessException{
        if (channel == null || channel.isEmpty())
        {
            return null;
        }
        switch (channel.toLowerCase()) {
            case "sms":
                return new SMSNotification();
            case "email":
                    return new EmailNotification();
            case "push": 
                return new PushNotification();
            default:
                throw new IllegalAccessException("Unknown channel"+channel);
        }
    }
    
}
