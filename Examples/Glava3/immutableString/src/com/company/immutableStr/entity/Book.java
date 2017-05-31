package com.company.immutableStr.entity;

/**
 * Created by HP on 29.01.2017.
 */
public class Book {
    private String name;

    public Book(String name){

        this.name = name;
    }

    public void setName(String name){

        this.name=name;
    }

    public String getName(){

        return name;
    }
}
