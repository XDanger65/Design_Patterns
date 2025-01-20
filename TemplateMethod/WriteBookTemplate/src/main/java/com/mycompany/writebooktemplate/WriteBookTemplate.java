/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.writebooktemplate;

/**
 *
 * @author Eslam
 */
public class WriteBookTemplate {

    public static void main(String[] args) {
        WriteBook booktype = new RomanticBook();
        booktype.writting();
        System.out.println("==========================");
        booktype = new economicBook();
        booktype.writting();
    }
}
