package org.esfranc.appbiblioteca;
import org.esfranc.appbiblioteca.models.*;

import java.util.Scanner;

public class EjemploBiblioteca {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Customer juan = new Customer("Juan Esteban", "Z2786127G");
        Book newBook = new Book("Cien años de soledad", "Gabriel Garcia Marquez", Gender.HISTORICA);


    }
}
