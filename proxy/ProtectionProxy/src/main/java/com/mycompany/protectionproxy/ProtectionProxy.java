/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.protectionproxy;

/**
 *
 * @author Eslam
 */
public class ProtectionProxy {

    public static void main(String[] args) {
        // Case 1: Admin user
        System.out.println("Admin User:");
        DBInterface adminProxy = new DBProxy("Admin");
       // adminProxy.ExecuteQuery("SELECT * FROM Users");
      //  adminProxy.ExecuteQuery("DELETE FROM Users");

        // Case 2: Non-admin user
        System.out.println("\nNon-Admin User:");
        DBInterface userProxy = new DBProxy("RegularUser");
     //   userProxy.ExecuteQuery("SELECT * FROM Products");
        userProxy.ExecuteQuery("DELETE FROM Products");
    }
}
