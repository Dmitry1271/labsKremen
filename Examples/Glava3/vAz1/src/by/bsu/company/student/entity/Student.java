package by.bsu.company.student.entity;

import by.bsu.company.student.exception.BadStudentDateException;
import by.bsu.company.student.valid.ValidCourse;
import by.bsu.company.student.valid.ValidPhone;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Month;

/**
 * Created by HP on 18.01.2017.
 * /
 /* Интерфейс Serializable не имеет методов, которые необходимо реализо-
    вать, поэтому его использование ограничивается упоминанием при объявле-
    нии класса.
 */
public class Student implements  Comparable<Student>, Serializable, Cloneable {
    long studentId;
    String familyName;
    String name;
    String patronymic;
    LocalDate birthDate;    //не обязательное поле //https://www.tutorialspoint.com/java8/java8_datetime_api.htm
    String address;         //не обязательное поле
    String phone;           //не обязательное поле
    Faculty faculty;
    int course;             //1-6
    int group;              //буквы и цифры

    public Student (long studentId, String familyName, String name, String patronymic, int year, int month, int dayOfMonth, String address, String phone, Faculty faculty, int course, int group) throws BadStudentDateException {
        this.studentId = studentId;
        this.familyName = familyName;
        this.name = name;
        this.patronymic = patronymic;
        this.birthDate = LocalDate.of(year, month, dayOfMonth);//провалидируется само, ловить DateTimeException
        this.address = address;
        setPhone(phone);
        this.faculty = faculty;
        setCourse(course);
        this.group = group;
    }

    public Student (long studentId, String familyName, String name, String patronymic, Faculty faculty, int course, int group) throws BadStudentDateException {
        this.studentId = studentId;
        this.familyName = familyName;
        this.name = name;
        this.patronymic = patronymic;
        this.faculty = faculty;
        this.course = 1;
        this.group = group;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public final void setPhone(String phone) throws BadStudentDateException {
        if(ValidPhone.isValidPhone(phone)){
            this.phone = phone;
        }
        else {
            throw new BadStudentDateException("The phone number is not valid!");
        }
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public  final void setCourse(int course) throws BadStudentDateException {
        if(ValidCourse.isValidCoorse(course)){
        this.course = course;
        }else {
            throw new BadStudentDateException("The course number is not valid!");
        }
    }

    public long getStudentId() {
        return studentId;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getBirthDateYear() {
        return birthDate.getYear();
    }
    public Month getBirthDateMonth() {
        return birthDate.getMonth();
    }
    public int getBirthDateDay() {
        return birthDate.getDayOfMonth();
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public int compareTo(Student ob) {
        return (int)(this.studentId - ob.getStudentId());
    }

    @Override
    public Object clone() throws CloneNotSupportedException { // переопределение
        Student copy = null;
        copy = (Student)super.clone();//Вызов базового метода
        //LocalDate не реализует Cloneable, поэтому копируем сами
        copy.birthDate = LocalDate.of(this.birthDate.getYear(),this.birthDate.getMonth(),this.birthDate.getDayOfMonth());
        return copy;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (getStudentId() != student.getStudentId()) return false;
        if (!getFamilyName().equals(student.getFamilyName())) return false;
        if (!getName().equals(student.getName())) return false;
        return getPatronymic().equals(student.getPatronymic());

    }

    @Override
    public int hashCode() {
        int result = (int) (getStudentId() ^ (getStudentId() >>> 32));
        result = 31 * result + getFamilyName().hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getPatronymic().hashCode();
        return result;
    }

    @Override
    public String toString() {
        String res ="Student{" +
                "studentId = " + studentId +
                ", name = " + familyName + " " +  name + " " + patronymic +
                ", faculty = " + faculty +
                ", course = " + course +
                ", group = " + group;
        if(birthDate!=null){
            res = res +  ", birthDate = " +
                    birthDate.getDayOfMonth() + "." +
                    birthDate.getMonth().getValue() + "." +
                    birthDate.getYear();
        }
        if(address!=null){
            res = res + ", address = " + address;
        }
        if(phone!=null){
            res = res + ", phone = " + phone;
        }
        res = res + '}';
        return res;
    }
}
