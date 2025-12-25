package org.esfranc.appbiblioteca;
import org.esfranc.appbiblioteca.models.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploBiblioteca {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Library library = new Library();
        Book book;
        Customer customer;
        int opc;

        do {
            System.out.println("------------- Biblioteca -------------");
            System.out.println("[1] Registrar libro");
            System.out.println("[2] Registrar usuario");
            System.out.println("[3] Buscar usuario: ");
            System.out.println("[4] Mostrar libros");
            System.out.println("[5] Mostrar usuarios");
            System.out.println("[6] Prestar libro");
            System.out.println("[0] Salir");
            System.out.println("--------------------------------------");
            System.out.print("Elija una opcion: ");
            opc = s.nextInt();
            s.nextLine();

            switch (opc){
                case 1 ->{
                    System.out.print("Ingrese el nombre del libro: ");
                    book = new Book();
                    book.setBookName(s.nextLine());
                    System.out.print("Ingrese el nombre del autor: ");
                    book.setAutor(s.nextLine());
                    library.addBooks(book);
                    System.out.println("libro añadido correctamente");

                }
                case 2 ->{
                    System.out.print("Ingrese el nombre del nuevo usuario: ");
                    customer = new Customer();
                    customer.setName(s.nextLine());
                    System.out.print("Ingrese la identificacion: ");
                    customer.setNie(s.nextLine());
                    library.addCustomer(customer);
                    System.out.println("Usuario añadido correctamente");
                }
                case 3 ->{
                    System.out.print("Ingrese el NIE del usuario: ");
                    System.out.println(library.ExistCustomerByNie(s.next()));

                }
                case 4 ->{
                    System.out.println("Lista de libros: ");

                }

            }

        }while (opc != 0);
    }
}
