package by.dudko.computerwork;

import by.dudko.computerwork.entity.Computer;
import by.dudko.computerwork.entity.ComputerType;

/**
 * Created by cplus on 28.05.2017.
 */
public class Main {
    public static void main(String[] args) {

            Computer computer = new Computer(5,"DESKTOP", "qwer i5 core", "Windows 7", 6);

            System.out.println(computer);

    }
}
