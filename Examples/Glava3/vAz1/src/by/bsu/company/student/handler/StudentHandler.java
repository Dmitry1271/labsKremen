package by.bsu.company.student.handler;

import by.bsu.company.student.entity.Faculty;
import by.bsu.company.student.entity.Student;

import java.util.ArrayList;

/**
 * Created by HP on 19.01.2017.
 */
public class StudentHandler {
    public static Student[] choiceFaculty(Student[] array, Faculty faculty){
        ArrayList<Student> arrayList= new ArrayList<Student>();
        for (Student student : array) {
            if (student.getFaculty() == faculty){
                arrayList.add(student);
            }
        }
        Student res[] = new Student[arrayList.size()];
        res = arrayList.toArray(res);
        return res;
    }

    public static Student[] choiceCourse(Student[] array, int course){
        ArrayList<Student> arrayList= new ArrayList<Student>();
        for (Student student : array) {
            if (student.getCourse() == course){
                arrayList.add(student);
            }
        }
        Student res[] = new Student[arrayList.size()];
        res = arrayList.toArray(res);
        return res;
    }

    public static Student[] choiceFacultyCourse(Student[] array, Faculty faculty, int course){
        Student[] studentFaculty = choiceFaculty(array, faculty);
        Student[] studentFacultyCourse = choiceCourse(studentFaculty, course);
        return studentFacultyCourse;
    }

    public static Student[] choiceAfterYear(Student[] array, int year){
        ArrayList<Student> arrayList= new ArrayList<Student>();
        for (Student student : array) {
            if (student.getBirthDateYear() > year){
                arrayList.add(student);
            }
        }
        Student res[] = new Student[arrayList.size()];
        res = arrayList.toArray(res);
        return res;
    }

    public static Student[] choiceGroupe(Student[] array, Faculty faculty, int course, int group){
        ArrayList<Student> arrayList= new ArrayList<Student>();
        for (Student student : array) {
            if ((student.getFaculty() == faculty)&&(student.getCourse() == course)&&(student.getGroup() == group)){
                arrayList.add(student);
            }
        }
        Student res[] = new Student[arrayList.size()];
        res = arrayList.toArray(res);
        return res;
    }
}
