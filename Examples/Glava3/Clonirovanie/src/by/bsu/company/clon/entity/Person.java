package by.bsu.company.clon.entity;

/**
 * Created by HP on 29.01.2017.
 */
public class Person implements Cloneable {
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

	/*метод clone() должен быть общедоступным, т.е. должен быть переопределен как public.
	 *  В первых строках  метода clone() должен находитьс¤ вызов базового метода clone().
	 *   Вызываемый таким образом метод clone() принадлежит классу Object,
	 *   и вы имеете возможность его вызова, поскольку он определен как protected
	 *   и потому доступен для дочерних классов.
	 */

    public Person clone() throws CloneNotSupportedException {
        System.out.println("Вызван Person clone()");
        return (Person)super.clone();
    }
}

