/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratordp3;

/**
 *
 * @author ayman
 */
public class Ammo extends UpgradedWeapon{

    public Ammo(Weaponn x)
    {
        ref=x;
    }
    @Override
    public int ShowWeaponPwer() {
        return 50+ ref.ShowWeaponPwer();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
