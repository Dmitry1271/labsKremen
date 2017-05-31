package com.company.initializer;

import com.company.initializer.entity.Book;

public class Main {

    public static void main(String[] args) {
        Book b1 = new Book("Война и мир", "Л. Н. Толстой", 1869);
        System.out.println(b1);

        Book b2 = new Book();
        System.out.println(b2);

        Book b3 = new Book("Размышления о хитром домашнем пироге", "Лиса Патрикевна");
        System.out.println(b3);

    }
}
