/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decoratordp3;

/**
 *
 * @author ayman
 */
public class DecoratorDP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Weaponn myWeapon;
        Klashinkof Ak47=new Klashinkof();
        
        int x=Ak47.ShowWeaponPwer();
        System.out.println("Klashinkof Power without Addon"+x);
        Telescope tel=new Telescope(Ak47);
        int z=tel.ShowWeaponPwer();
        System.out.println("Kl + Adon Tel ="+ z);
        Ammo am=new Ammo(tel);
        System.out.println("KL + TEL + AMMO ="+ am.ShowWeaponPwer());
        MySkin sk=new MySkin(am);
        System.out.println("KL + TEL + AMMO +  Askin="+ sk.ShowWeaponPwer());
        
                
    }
    
}
