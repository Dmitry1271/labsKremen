package com.company.param;

import com.company.param.entity.Person;
import com.company.param.entity.Student;

public class Main {

    public static void main(String[] args) {
        int n1 = getSum(20,10);
        System.out.println(n1); // 30
        int n2 = getSum(20, 34, 9, 5);
        System.out.println(n2); // 68
        int n3 = getSum();
        System.out.println(n3); // 0
        double res = getSumNumber(new Integer(1),new Double(1.2), 4, (byte)3);
        System.out.println(res); // 9.2

        Person p1 = new Person("Ivanov", 20);
        Person p2 = new Person("Grigorovich", 21);
        Person p3 = new Person("Kutas", 19);
        Student st = new Student("Saitov", 21,105);
        double age = getAvarageAge( p1, st, p2, p3);
        System.out.println(age); // 20.25
    }
    static int getSum(int ...nums){

        int result =0;
        for(int x:nums)
            result+=x;
        return result;
    }

    static double getSumNumber(Number ...nums){

        double result =0;
        for(Number x:nums)
            result=result+x.doubleValue();
        return result;
    }

    static double getAvarageAge(Person...person){

        double result =0;
        for(int i=0; i<person.length;i++){
           result+=person[i].getAge();
        }
            result/=person.length;
        return result;
    }
}

