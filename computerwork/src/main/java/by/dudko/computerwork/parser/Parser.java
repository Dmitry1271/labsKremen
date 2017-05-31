package by.dudko.computerwork.parser;

import by.dudko.computerwork.entity.Computer;
import by.dudko.computerwork.entity.ComputerType;

/**
 * Created by cplus on 29.05.2017.
 */
public class Parser {
    public static Computer parseString(String data) {
        int id;
        String computerType;
        String processor;
        String operatingSystem;
        int randomAccessMemory;

        String[] entities = data.split(", ");
        id = Integer.parseInt(entities[0]);
        computerType = entities[1];
        processor = entities[2];
        operatingSystem = entities[3];
        randomAccessMemory = Integer.parseInt(entities[4]);
        return new Computer(id, computerType, processor, operatingSystem, randomAccessMemory);
    }
}
