package org.esfranc.appbiblioteca.models;

public class Customer {
    private String name;
    private String nie;
    private Book book;

    public Customer(){
    }

    public Book getBook(){
        return book;
    }

    public void setBook(Book book){
        this.book = book;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setNie(String nie){
        this.nie = nie;
    }

    public String getNie(){
        return this.nie;
    }

}
