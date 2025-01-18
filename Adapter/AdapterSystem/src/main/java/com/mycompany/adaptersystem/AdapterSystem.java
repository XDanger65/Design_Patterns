/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adaptersystem;

/**
 *
 * @author Eslam
 */
public class AdapterSystem {

    static void play(Ihero ref)
    {
        ref.start();
        ref.run();
        ref.stop();
    }
    
    public static void main(String[] args) {
        Ihero mego = new Tank();
        play(mego);
        
        Ihero mm = new RocketLauncherToTankAdapter(new RocketLauncher());
        play(mm);
    }
}
