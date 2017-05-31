package com.company.param.entity;

/**
 * Created by HP on 29.01.2017.
 */
public class Person  {
    private String name;
    private int age;
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public Person() {
        super();
    }
    @Override
    public String toString() {
        return "Person: " + name + " , age: " + age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


}

