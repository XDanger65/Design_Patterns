/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subsystems;

/**
 *
 * @author Eslam
 */
public class BookCatalog {
    public boolean isBookAvailable(String bookId)
    {
        System.out.println("checking the avaliability of book ID :"+bookId);
        return true;
    }
    public void lendBook(String bookId){
        System.out.println("lending book with id :"+bookId);
    }
    public void returnBook(String bookId){
        System.out.println("returing the book with id :"+bookId);
    }
}
