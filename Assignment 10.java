/*Write a Java program to demonstrate the concept of encapsulation by modeling a Book object. The program should include methods for setting and getting the title and author of the book, and a method to display the details of the book.
Task:
Create a class Book with the following private attributes:
title (String)
author (String)
Include the following methods in the Book class:
setTitle(String title) to set the title of the book.
setAuthor(String author) to set the author of the book.
getTitle() to return the title of the book.
getAuthor() to return the author of the book.
displayDetails() to print the details of the book in the format
Title: <title>  
Author: <author>  
In the main() method, create an object of the Book class, set the title and author, and then call the displayDetails() method to print the book details.*/


import java.util.Scanner;

public class W02_P5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.next();
        String author = sc.next();
        
        // Create a Book object
        Book book = new Book();
        
        // Set title and author
        book.setTitle(title);
        book.setAuthor(author);
        
        // Display book details
        book.displayDetails();
    }
}
class Book {
    // Private attributes
    private String title;
    private String author;
    
    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }
    
    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }
    
    // Getter for title
    public String getTitle() {
        return this.title;
    }
    
    // Getter for author
    public String getAuthor() {
        return this.author;
    }
// Method to display details
    public void displayDetails() {
        System.out.println("Title: " + this.title);
        System.out.print("Author: " + this.author);
    }
}
