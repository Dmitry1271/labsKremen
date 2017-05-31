package by.bsu.company.clon;

import by.bsu.company.clon.entity.Person;
import by.bsu.company.clon.entity.Student;
import by.bsu.company.clon.handler.ClonDemo;

/*Метод Object.clone() определяет размер объекта, выделяет необходимое количество
 * свободной памяти для создания копии и осуществляет побитное копирование.
 * Эта процедура называется поразрядным копированием и является сутью клонирования.
 * Но перед выполнением этих операций Object.clone() выполняет проверку,
 * является ли копируемый объект клонируемым - то есть, реализует ли он интерфейс Cloneable.
 * Если нет - Object.clone() возвращает исключительную ситуацию CloneNotSupportedException,
 * сигнализирующую о том, что данный объект не может быть клонирован.
 * Таким образом вы должны поместить вызов метода super.clone( ) в блок операторов try-catch,
 * чтобы перехватывать и обрабатывать подобные ситуации, которые не должны возникнуть
 *  (поскольку вы реализуете интерфейс Clonable).
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("\nКлонирование");
        Person men1 = new Person("Иванов",25);
        System.out.println("Main: Данные о человеке до вызова функции changePerson:");
        System.out.println(men1);
        try{
            ClonDemo.changePerson(men1, "Petrov", 30);
            System.out.println("Main: Данные о человеке после вызова функции changePerson:");
            System.out.println(men1);
        }
        catch (CloneNotSupportedException e) {
            System.out.println("Объект не может быть клонирован.");
        }

        System.out.println("\nГлубокое клонирование");
        Student stud1=new Student(new Person("Vasechkin", 21), 111);
        System.out.println("Main: Данные о студенте до вызова функции changeStudent:");
        System.out.println(stud1);
        try{
            ClonDemo.changeStudent(stud1, "Sidorov", 18, 500);
            System.out.println("Main: Данные о студенте после вызова функции changeStudent:");
            System.out.println(stud1);
        }
        catch (CloneNotSupportedException e) {
            System.out.println("Объект не может быть клонирован.");
        }

    }
}
