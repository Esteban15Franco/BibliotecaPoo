package org.esfranc.appbiblioteca.models;

import java.util.Date;

public class Library {
    private Book[] books = new Book[0];
    private Customer[] customers = new Customer[0];

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

    public Customer existCustomerByNie(String nie){
        for (Customer c : customers){
            if (nie.equals(c.getNie())){
                return c;
            }
        }
        return null;
    }

    public Book existBookById(int id){
        for (Book b : books){
            if (id == b.getId()){
                return b;
            }
        }
        return null;
    }

    public boolean lendBook(int id, String nie){
        Customer c = existCustomerByNie(nie);
        Book b = existBookById(id);
        if (c == null || b == null){
            return false;
        }
        if (c.getBook() != null || b.getState() != State.DEVUELTO){
            return false;
        }
        c.setBook(b);
        b.setState(State.PRESTADO);
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

    public String showCustomerDetails(String nie){
        Customer c = existCustomerByNie(nie);

        if (c == null){
            return "Usuario no encontrado";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(c.getName()).append("\n");

        if (c.getBook() != null){
            sb.append("Ya posee un libro");
        } else {
            sb.append("No tiene ningún libro");
        }

        return sb.toString();
    }

    public String showBooks(){
        StringBuilder sb = new StringBuilder();
        sb.append("ID")
                .append("\t\t\t\t")
                .append("Nombre")
                .append("\t\t\t\t")
                .append("Autor\n");
        for (Book b : books){
            sb.append(b)
                    .append("\n");
        }
        return sb.toString();
    }

    public String showCustomers(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre")
                .append("\t\t\t\t")
                .append("Nie\n");
        for (Customer c : customers){
            sb.append(c)
                    .append("\n");
        }
        return sb.toString();
    }

}
