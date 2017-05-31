package com.company.param.entity;

/**
 * Created by HP on 29.01.2017.
 */
public class Student extends  Person{
    private double grant;

    public Student() {
        super();
    }

    public Student(String name, int age, double grant) {
        super(name, age);
        this.grant = grant;
    }

    public double getGrant() {
        return grant;
    }

    public void setGrant(double grant) {
        this.grant = grant;
    }

    @Override
    public String toString() {
        return "Student{" +
                getName() + " " +
                getAge() + " " +
                "grant=" + grant +
                '}';
    }
}

