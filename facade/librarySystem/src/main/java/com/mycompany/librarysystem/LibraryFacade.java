/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarysystem;

import Subsystems.BookCatalog;
import Subsystems.FineManagement;
import Subsystems.Membership;
import Subsystems.Notification;
/**
 *
 * @author Eslam
 */
public class LibraryFacade {
    
    // objects form the subsystems in the facade 
    private BookCatalog bookCatalog = new BookCatalog();
    private FineManagement fineManagement = new FineManagement();
    private Membership membership = new Membership();
    private Notification notification = new Notification();
    
    public void borrowBook(String memberId, String bookId) {
        if (!membership.isMemberActive(memberId)) {
            System.out.println("Member is not active. Cannot borrow book.");
            return;
        }

        if (!bookCatalog.isBookAvailable(bookId)) {
            System.out.println("Book is not available. Cannot borrow book.");
            return;
        }

        bookCatalog.lendBook(bookId);
        notification.sendNotification(memberId, "You have successfully borrowed the book with ID: " + bookId);
    }

    public void returnBook(String memberId, String bookId) {
        bookCatalog.returnBook(bookId);
        double fine = fineManagement.calculateFine(memberId);
        if (fine > 0) {
            System.out.println("You have an outstanding fine of $" + fine);
        } else {
            System.out.println("No outstanding fine.");
        }
        notification.sendNotification(memberId, "You have successfully returned the book with ID: " + bookId);
    }

    public void payFine(String memberId, double amount) {
        fineManagement.payFine(memberId, amount);
        notification.sendNotification(memberId, "Your fine has been paid. Thank you!");
    }
    
}
