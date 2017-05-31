package by.dudko.paperabout.read;

import by.dudko.paperabout.entity.drowingexercisebook.DrawingExerciseBook;
import by.dudko.paperabout.parser.Parser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by cplus on 31.05.2017.
 */
public class DrawingExerciseBookReader {
    private static final Logger Logger = LogManager.getLogger(DrawingExerciseBookReader.class);

    public static ArrayList<DrawingExerciseBook> readStringFromFile(String path) {
        ArrayList<DrawingExerciseBook> result = new ArrayList<DrawingExerciseBook>();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                result.add(Parser.parseString(line));
            }
        } catch (FileNotFoundException e) {
            Logger.error(new FileNotFoundException("File didn't find"));
        } catch (IOException e) {
            Logger.error(new IOException("Common IO Exception"));
        }
        return result;
    }
}
