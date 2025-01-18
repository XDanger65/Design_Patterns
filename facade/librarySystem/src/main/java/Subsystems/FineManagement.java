/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsystems;

/**
 *
 * @author Eslam
 */
public class FineManagement {
    public double calculateFine(String memberId) {
        System.out.println("Calculating fine for member ID: " + memberId);
        return 0.0; // Assume no fine for simplicity
    }

    public void payFine(String memberId, double amount) {
        System.out.println("Paying fine of $" + amount + " for member ID: " + memberId);
    }
}
