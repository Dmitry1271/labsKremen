package by.bsu.company.student.read;

import by.bsu.company.student.entity.Faculty;
import by.bsu.company.student.entity.Student;
import by.bsu.company.student.exception.BadStudentDateException;

import java.io.InputStream;
import java.time.DateTimeException;
import java.util.Scanner;

/**
 * Created by HP on 18.01.2017.
 */
public class ReadStudent {
    public static Student ReadFromConsole(InputStream is) throws IllegalArgumentException, BadStudentDateException, DateTimeException {
        Student student = null;
        Student s = new Student(1, "Ianov", "Ivan", "Ivanovich", Faculty.BIO, 1, 5);
        System.out.println(s);

        Scanner scanner = new Scanner(is);

        long studentId;
        String familyName;
        String name;
        String patronymic;
        int year;
        int month;
        int dayOfMonth;
        String address;
        String phone;
        Faculty faculty;
        int course;
        int group;

        System.out.println("Enter an studentId (long): ");
        if (scanner.hasNextLong()) {
            studentId = scanner.nextLong();
        } else {
            throw new BadStudentDateException("Entering a studentId Exception!");
        }
        System.out.print("Enter a familyName: ");
        familyName = scanner.next();

        System.out.print("Enter a name: ");
        name = scanner.next();

        System.out.print("Enter a patronymic: ");
        patronymic = scanner.next();

        System.out.print("Enter a year: ");
        if (scanner.hasNextInt()) {
            year = scanner.nextInt();
        } else {
            throw new BadStudentDateException("Entering a year Exception!");
        }

        System.out.print("Enter a month (int): ");
        if (scanner.hasNextInt()) {
            month = scanner.nextInt();
        } else {
            throw new BadStudentDateException("Entering a month Exception!");
        }


        System.out.print("Enter a dayOfMonth (int): ");
        if (scanner.hasNextInt()) {
            dayOfMonth = scanner.nextInt();
        } else {
            throw new BadStudentDateException("Entering a dayOfMonth Exception!");
        }

        System.out.print("Enter a address: ");
        address = scanner.next();

        System.out.print("Enter a phone: ");
        phone = scanner.next();

        String temp;
        System.out.print("Enter a faculty: ");
        temp = scanner.next();
        faculty = Faculty.valueOf(temp.toUpperCase());

        System.out.print("Enter a course: ");
        if (scanner.hasNextInt()) {
            course = scanner.nextInt();
        } else {
            throw new BadStudentDateException("Entering a course Exception!");
        }

        System.out.print("Enter a group (int): ");
        if (scanner.hasNextInt()) {
            group = scanner.nextInt();
        } else {
            throw new BadStudentDateException("Entering a dayOfMonth Exception!");
        }

        student = new Student(studentId, familyName, name, patronymic, year, month, dayOfMonth, address, phone, faculty, course, group);
        return student;
    }

}
