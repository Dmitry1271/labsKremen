package by.bsu.company.clon.entity;

/**
 * Created by HP on 29.01.2017.
 */
public class Student implements Cloneable{
    private Person men;
    private double grant;

    public Student() {
        super();
        men=new Person();
    }

    public Student(Person men, double grant) {
        super();
        this.men = men;
        this.grant = grant;
    }

    public Person getMen() {
        return men;
    }

    public void setMen(Person men) {
        this.men = men;
    }

    public double getGrant() {
        return grant;
    }

    public void setGrant(double grant) {
        this.grant = grant;
    }

    public void setName(String name) {
        this.men.setName(name);
    }

    public void setAge(int age){
        this.men.setAge(age);
    }

    public String getName() {
        return this.men.getName();
    }

    public int getAge() {
        return this.men.getAge();
    }

    @Override
    public String toString() {
        return "Student " + men + ", grant=: " + grant;
    }

    public Student clone() throws CloneNotSupportedException {
        System.out.println("Вызван Student clone()");
        Student studentClone = (Student)super.clone();
		/*Если закомментировать следующую строку,
		  то поле grant будет клонировано,
		  а поле men типа Person просто скопируетс¤ ссылка,
		  т.е. данные фамилия и возраст не будут защищены от изменения
		*/
        studentClone.men=(Person)men.clone();
        return studentClone;
    }
}

