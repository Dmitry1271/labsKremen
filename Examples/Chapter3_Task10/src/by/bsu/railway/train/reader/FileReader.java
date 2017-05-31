package by.bsu.railway.train.reader;

import by.bsu.railway.train.converter.Converter;
import by.bsu.railway.train.entity.Train;
import by.bsu.railway.train.parser.Parser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by mrbro on 09-Apr-17.
 */
public class FileReader {

    //private static final Logger logger = LogManager.getLogger(FileReader.class.getName());

    public static Train[] read(String filename) throws FileNotFoundException{
        File file = new File(filename);
        ArrayList<Train> list = new ArrayList<>();

        Scanner input = new Scanner(file);
        while (input.hasNextLine()) {
            String buffer = input.nextLine();
            list.add(Parser.parseString(buffer));
        }

        return Converter.listToArray(list);
    }
}
