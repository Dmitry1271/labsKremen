package by.bsu.company.student;

import by.bsu.company.student.entity.Faculty;
import by.bsu.company.student.entity.Student;
import by.bsu.company.student.exception.BadStudentDateException;
import by.bsu.company.student.handler.StudentHandler;
import by.bsu.company.student.read.ReadStudent;
import by.bsu.company.student.valid.ValidCourse;

import java.time.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 Задания к главе 3
 Вариант А
 Создать классы, спецификации которых приведены ниже. Определить конструкторы
 и методы setТип(), getТип(), toString(). Определить дополнительно
 методы в классе, создающем массив объектов. Задать критерий выбора данных
 и вывести эти данные на консоль. В каждом классе, обладающем информацией,
 должно быть объявлено несколько конструкторов.
 1.  Student:  id,  Фамилия,  Имя,  Отчество,  Дата  рождения,  Адрес,  Телефон,
 Факультет, Курс, Группа.
 Создать массив объектов. Вывести:
 a)  список студентов заданного факультета;
 b)  списки студентов для каждого факультета и курса;
 c)  список студентов, родившихся после заданного года;
 d)  список учебной группы.//
 */

//https://www.tutorialspoint.com/java8/java8_datetime_api.htm информация о классе Time
public class Main {
public static final int size = 5;
    public static void main(String[] args) {
        try {
            Student[] students = new Student[size];
          /*  for(int i=0;i<size;i++){
                students[i] = ReadStudent.ReadFromConsole(System.in);
            }*/
            students[0] = new Student(1,"Ivanov","Ivan","Ivanovich",1999,10,14,"Pavlova 25-67","+375331234567",Faculty.BIO,3,1);
            students[1] = new Student(2,"Petrov","Pavel","Petrovich",1998,1,7,"Pavlova 25-67","+375331234567",Faculty.MMF,2,1);
            students[2] = new Student(3,"Sidorov","Igor","Vladimirovich",2000,12,12,"Pavlova 25-67","+375331234567",Faculty.BIO,1,4);
            students[3] = new Student(4,"Fadeeva","Irina","Ivanovna",1998,2,10,"Pavlova 25-67","+375331234567",Faculty.MMF,2,1);
            students[4] = new Student(5,"Grigorovich","Vasil","Pavlovich",2001,3,21,"Pavlova 25-67","+375331234567",Faculty.FPMI,1,7);

            System.out.println("Array of students:");
            for(int i=0;i<size;i++){
                System.out.println(students[i]);
            }

            Student[] studentsBio = StudentHandler.choiceFaculty(students, Faculty.BIO);
            System.out.println();
            System.out.println("Students of bio faculty:");
            for (Student student : studentsBio){
                System.out.println(student);
            }

            ArrayList<Student[]> studFacultyCourse = new ArrayList<Student[]>();
            for (Faculty faculty : Faculty.values()){
                for (int i=0;i<= ValidCourse.MAX_COURSE;i++){
                    studFacultyCourse.add(StudentHandler.choiceFacultyCourse(students, faculty, i));
                }
            }

            for (Student[] arrFacultyCourse : studFacultyCourse){
                if(arrFacultyCourse.length!=0) {
                    System.out.println();
                    System.out.println("Faculty " + arrFacultyCourse[0].getFaculty());
                    System.out.println("Course " + arrFacultyCourse[0].getCourse());
                    for (Student st : arrFacultyCourse) {
                        System.out.println(st);
                    }
                }
            }

            Student[] studAfterYear = StudentHandler.choiceAfterYear(students, 1998);
            System.out.println();
            System.out.println("List of students born after a specified year:");
            for (Student student : studAfterYear){
                System.out.println(student);
            }

            Student[] studGroupe = StudentHandler.choiceGroupe(students, Faculty.MMF,2,1);
            System.out.println();
            System.out.println("List of students 2 course 1 groupe MMF:");
            for (Student student : studGroupe){
                System.out.println(student);
            }



        } catch (DateTimeException e) {
            System.out.println(e.getMessage());
        } catch (BadStudentDateException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }


}