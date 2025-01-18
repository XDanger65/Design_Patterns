/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.librarysystem;


/**
 *
 * @author Eslam
 */
public class LibrarySystem {

    public static void main(String[] args) {
       LibraryFacade libraryFacade = new LibraryFacade();
       String memberId = "M123";
       String bookId = "B456";
       
       libraryFacade.borrowBook(memberId, bookId);
       libraryFacade.returnBook(memberId, bookId);
       libraryFacade.payFine(memberId, 10.0);
    }
}
