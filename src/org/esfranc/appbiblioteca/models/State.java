package org.esfranc.appbiblioteca.models;

public enum State {
    DEVUELTO("Libro devuelto"),
    PRESTADO("Libro prestado");

    private final String actualState;

    private State(String actualState){
        this.actualState = actualState;
    }

    public String getActualState(){
        return actualState;
    }
}
