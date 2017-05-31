package by.bsu.company.clon.handler;

import by.bsu.company.clon.entity.Person;
import by.bsu.company.clon.entity.Student;

/**
 * Created by HP on 29.01.2017.
 */
public class ClonDemo {

    public static void changePerson(Person obj, String newName, int newAge) throws CloneNotSupportedException {

        System.out.println("\nchangePerson: Данные Person до изменения в функции changePerson");
        System.out.println(obj);
        Person objClone = obj.clone();//клонирование

        objClone.setName(newName);
        objClone.setAge(newAge);
        System.out.println("\nchangePerson: Данные Person после изменения в функции changePerson");
        System.out.println(objClone);
    }

    public static void changeStudent(Student stud, String name, int age, double grant) throws CloneNotSupportedException {

        System.out.println("\nchangeStudent: Данные Student до изменения в функции changeStudent");
        System.out.println(stud);
        Student studClone = stud.clone();//клонирование
        studClone.setName(name);
        studClone.setAge(age);
        studClone.setGrant(grant);
        System.out.println("\nchangeStudent: Данные о студенте после изменения в функции changeStudent");
        System.out.println(studClone);
    }
}
