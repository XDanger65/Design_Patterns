/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.compositepattern;

/**
 *
 * @author Eslam
 */
public class CompositePattern {

    public static void main(String[] args) {
       // Create the root directory
        Directory root = new Directory("Root");

        // Create and populate the Documents directory
        Directory documents = new Directory("Documents");
        documents.addComponent(new File("resume.pdf", 1024));
        documents.addComponent(new File("notes.txt", 256));

        // Create and populate the Pictures directory
        Directory pictures = new Directory("Pictures");
        pictures.addComponent(new File("vacation.jpg", 2048));
        pictures.addComponent(new File("family.jpg", 4096));

        // Create and populate a nested directory
        Directory work = new Directory("Work");
        work.addComponent(new File("project.doc", 1536));
        documents.addComponent(work);

        // Add directories to root
        root.addComponent(documents);
        root.addComponent(pictures);

        // Display the entire file system
        System.out.println("File System Structure:");
        root.display("");

        // Example of accessing specific components
        System.out.println("\nTotal size of file system: " + root.getSize() + " bytes");
        System.out.println("Size of Pictures directory: " + pictures.getSize() + " bytes");
    }
}