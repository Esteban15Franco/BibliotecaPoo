package org.esfranc.appbiblioteca;
import org.esfranc.appbiblioteca.models.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploBiblioteca {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MM, yyyy");
        Library library;
        Book book = new Book();
        Customer customer;
        int opc;

        do {
            System.out.println("------------- Biblioteca -------------");
            System.out.println("[1] Registrar libro");
            System.out.println("[2] Registrar usuario");
            System.out.println("[3] prestar libro");
            System.out.println("[4] Devolver libro");
            System.out.println("[5] Mostrar libros");
            System.out.print("Elija una opcion: ");
            opc = s.nextInt();

            switch (opc){
                case 1 ->{
                    System.out.print("Ingrese el nombre del libro: ");
                    book.setBookName(s.nextLine());
                    s.nextLine();
                    System.out.print("Ingrese el nombre del autor: ");
                    book.setAutor(s.nextLine());
                    library = new Library();
                    library.addBooks(book);
                    System.out.println("libro añadido correctamente");

                }
                case 2 ->{
                    System.out.print("Ingrese el nombre del nuevo usuario: ");
                    customer = new Customer();
                    customer.setName(s.nextLine());
                    s.nextLine();
                    System.out.print("Ingrese la identificacion: ");
                    customer.setNie(s.nextLine());
                    library = new Library();
                    library.addCustomer(customer);
                    System.out.println("Usuario añadido correctamente");
                }
                case 3 ->{

                }

            }

        }while (opc != 0);
    }
}
