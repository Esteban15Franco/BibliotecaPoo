package org.esfranc.appbiblioteca.models;

public class Book {
    private String bookName;
    private String autor;
    private Gender gender;
    private int id;
    private static int lastId;

    public Book(String bookName, String autor, Gender gender){
        this.id = ++lastId;
        this.bookName = bookName;
        this.gender = gender;
        this.autor = autor;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
