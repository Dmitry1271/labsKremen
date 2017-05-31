package com.company.initializer.entity;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Created by HP on 29.01.2017.
 */
public class Book {
    private String name;
    private String author;
    private int year;
    /*Логические  блоки  чаще  всего  используются  в  качестве  инициализаторов
    полей, но могут содержать вызовы методов и обращения к полям текущего
    класса. При создании объекта класса они вызываются последовательно, в порядке размещения,
    вместе с инициализацией полей как простая последовательность операторов,
    и только после выполнения последнего блока будет вызван
    конструктор  класса.  Операции  с  полями  класса  внутри  логического  блока
    до явного объявления этого поля возможны только при использовании ссылки
    this, представляющей собой ссылку на текущий объект.
*/
    //начало логического блока инициализатора
    {
        name = "неизвестно";
        author = "неизвестно";
        year = 0;
    }//конец логического блока инициализатора

    public Book(){
    }

    public Book(String name, String author){

        this.name = name;
        this.author = author;
        this.year = LocalDate.now().getYear();
    }

    public Book(String name, String author, int year){

        this(name, author);//Один конструктор вызывается из другого
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Книга " +
                "название='" + name + '\'' +
                " (автор " + author +
                "), была издана в " + year;
    }
}
