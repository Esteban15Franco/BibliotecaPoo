package org.esfranc.appbiblioteca.models;

public enum Gender {
    SUSPENSO("Suspenso"),
    HISTORICA("Novela historia"),
    ROMANCE("Romance"),
    FICCION("Ciencia ficción"),
    DISTOPIA("Distopía"),
    AVENTURA("Aventura"),
    FANTASIA("Fantasía"),
    CONTEMPORANEO("Contemporáneo");

    private final String genderName;

    private Gender(String genderName){
        this.genderName = genderName;
    }

    public String getGenderName(){
        return genderName;
    }
}
