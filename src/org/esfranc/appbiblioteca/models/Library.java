package org.esfranc.appbiblioteca.models;

import java.util.Date;

public class Library {
    private Book[] books = new Book[0];
    private Customer[] customers = new Customer[0];
    private Date date;

    public Library(){
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

    public boolean lendBook(Book book, Customer customer){
        if (book.getState() == State.PRESTADO){
            return false;
        } else if (customer.getBook() != null) {
            return false;

        }
        customer.setBook(book);
        book.setState(State.PRESTADO);
        return true;
    }

    public boolean returnBook(Customer customer){
        if (customer.getBook() == null){
            return false;
        }
        customer.getBook().setState(State.DEVUELTO);
        customer.setBook(null);
        return true;
    }


}
