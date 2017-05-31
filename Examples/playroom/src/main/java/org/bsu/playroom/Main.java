package org.bsu.playroom;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bsu.playroom.action.PlayroomAction;
import org.bsu.playroom.create.PlayroomCreator;
import org.bsu.playroom.create.ToyCreator;
import org.bsu.playroom.entity.Playroom;
import org.bsu.playroom.entity.Toy;
import org.bsu.playroom.exception.IncorrectValueException;
import org.bsu.playroom.read.ToySerializeReader;
import org.bsu.playroom.valid.ToyValidator;

import java.io.*;
import java.math.BigDecimal;
import java.time.Year;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        ArrayList<Toy> toys = ToyCreator.getToysFromFile(new File("toys.txt"));
        for (Toy toy : toys) {
            logger.info(toy);
        }

        Toy toy = toys.get(0);

        ToySerializeReader.serialize(toy, "/tmp/toy.ser");
        System.out.println(ToySerializeReader.deserialize("/tmp/toy.ser"));
    }
}
