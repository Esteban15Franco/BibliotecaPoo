package org.esfranc.appbiblioteca.models;

public class Book {
    private String bookName;
    private String autor;
    private final int id;
    private static int lastId;
    private State state = State.DEVUELTO;

    public Book(){
        this.id = ++lastId;

    }

    public int getId() {
        return id;
    }

    public State getState(){
        return state;
    }

    public void setState(State state){
        this.state = state;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString(){
        return id +
                "\t\t"+
                bookName+
                "\t\t" +
                autor;
    }

}
