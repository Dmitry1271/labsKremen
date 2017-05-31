package org.bsu.playroom.read;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bsu.playroom.entity.Toy;

import java.io.*;

public class ToySerializeReader {
    private static final Logger logger = LogManager.getLogger(ToySerializeReader.class);

    public static boolean serialize(Toy toy, String path) {
        boolean result = false;
        ObjectOutputStream out = null;
        try {
            FileOutputStream fileOut =
                    new FileOutputStream(path);
            out = new ObjectOutputStream(fileOut);
            out.writeObject(toy);
            out.close();
            fileOut.close();
            logger.info("Serialized data is saved in " + path);
            result = true;
        } catch (IOException e) {
            logger.error(e.getStackTrace());
        } finally {
            if(out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    logger.error(e.getStackTrace());
                }
            }
        }
        return result;
    }

    public static Toy deserialize(String path) {
        Toy toy = null;
        ObjectInputStream in = null;
        FileInputStream fileIn = null;
        try {
            fileIn = new FileInputStream(path);
            in = new ObjectInputStream(fileIn);
            toy = (Toy) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            logger.error(e.getStackTrace());
        } finally {
            if(in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    logger.error(e.getStackTrace());
                }
            }

            if(fileIn != null) {
                try {
                    fileIn.close();
                } catch (IOException e) {
                    logger.error(e.getStackTrace());
                }
            }
        }

        return toy;
    }
}
