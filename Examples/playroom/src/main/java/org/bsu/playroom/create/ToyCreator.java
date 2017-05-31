package org.bsu.playroom.create;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bsu.playroom.Main;
import org.bsu.playroom.entity.Toy;
import org.bsu.playroom.exception.BadDataException;
import org.bsu.playroom.read.ToyReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

public class ToyCreator {
    private static final Logger logger = LogManager.getLogger(ToyCreator.class);

    public static ArrayList<Toy> getToysFromFile(File file) {
        ArrayList<Toy> toys = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);

            BufferedReader br = new BufferedReader(fileReader);

            String line;
            while ((line = br.readLine()) != null) {
                Toy toy = ToyReader.readToy(line);
                if (toy != null) {
                    toys.add(toy);
                }
            }
        } catch (IOException | BadDataException e) {
            logger.error(e.getMessage());
        }

        return toys;
    }
}
