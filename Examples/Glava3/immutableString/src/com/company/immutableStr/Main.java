package com.company.immutableStr;

import com.company.immutableStr.entity.Book;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Война и мир");
        read(book);
        System.out.println(book.getName());  // Неизвестная книга

        int n = 10;
        read(n);
        System.out.println(n); // 10

        String title = "Отцы и дети";
        read(title);
        System.out.println(title); // Отцы и дети
    }

    private static void read(Book b){//Приходит копия адреса объекта -> изменится сам объект, адрес не меняется

        b.setName("Неизвестная книга");
    }

    private static void read(int x){//Приходит копия примитивного типа -> сама переменная не изменится
        x=20;
    }

    private static void read(String bookTitle){
        /*String -  объект, но immutable,
          если присвоить объекту String новое значение,
          то для этого система создаст новый объект.
          адрес в копии изменился, а значит сам объект остался неизменным.*/

        bookTitle="Неизвестная книга";
    }
}


