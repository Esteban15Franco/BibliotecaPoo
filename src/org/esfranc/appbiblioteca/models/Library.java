package org.esfranc.appbiblioteca.models;

import java.util.Date;

public class Library {
    private Book[] books = new Book[0];
    private Customer[] customers = new Customer[0];
    private Date date;

    public Library(){
        this.date = new Date();
    }


    public void addBooks(Book book){
        Book[] auxBook = new Book[books.length +1];
        for (int i = 0; i < books.length; i++){
            auxBook[i] = books[i];
        }
        auxBook[auxBook.length-1] = book;
        books = auxBook;
    }

    public void addCustomer(Customer customer){
        Customer[] auxCustomer = new Customer[customers.length+1];
        for (int i = 0; i < customers.length; i++){
            auxCustomer[i] = customers[i];
        }

        auxCustomer[auxCustomer.length-1] = customer;
        customers = auxCustomer;
    }


}
