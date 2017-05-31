package by.dudko.computerabout;

import by.dudko.computerabout.entity.Computer;
import by.dudko.computerabout.entity.Type;
import by.dudko.computerabout.exception.IncorrectValueException;

/**
 * Created by cplus on 27.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        try {

            Computer computer = new Computer(Type.DESKTOP, "qwer i5 core", "Windows 7", 6);
            System.out.println(computer);
        } catch (IncorrectValueException e) {
            System.err.println(e.getMessage());
        }

    }
}
