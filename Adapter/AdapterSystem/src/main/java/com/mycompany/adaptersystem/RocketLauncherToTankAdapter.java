/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adaptersystem;

/**
 *
 * @author Eslam
 */
public class RocketLauncherToTankAdapter implements Ihero{

    RocketLauncher ref;
    public RocketLauncherToTankAdapter(RocketLauncher ref)
    {
        this.ref = ref;
    }
    @Override
    public void start() {
        ref.begining();
    }

    @Override
    public void run() {
        ref.doing();
    }

    @Override
    public void stop() {
        ref.breaking();
    }
    
}
