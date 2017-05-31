package by.dudko.computerwork.read;

import by.dudko.computerwork.entity.Computer;
import by.dudko.computerwork.parser.Parser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by cplus on 28.05.2017.
 */
public class ComputerReader {
    private static final Logger Logger = LogManager.getLogger(ComputerReader.class);

    public static ArrayList<Computer> readStringFromFile(String path) {
        ArrayList<Computer> strings = new ArrayList<Computer>();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                strings.add(Parser.parseString(line));
            }
        } catch (FileNotFoundException e) {
            Logger.error(new FileNotFoundException("File didn't find"));
        } catch (IOException e) {
            Logger.error(new IOException("Common IO Exception"));
        }
        return strings;
    }
}
