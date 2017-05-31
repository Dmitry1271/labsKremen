package test.by.bsu.railway.train.reader;
import by.bsu.railway.train.entity.Train;
import by.bsu.railway.train.reader.FileReader;
import org.junit.Test;
import org.junit.Assert;

import java.io.FileNotFoundException;

/**
 * Created by mrbro on 09-Apr-17.
 */
public class FileReaderTest {
    @Test
    public void readTest() throws FileNotFoundException {
        Train[] expected = new Train[]{
                new Train(54, "Saint-Petersburg", 2017, 5, 19, 15, 0, "coupe", 25),
                new Train(28, "Moscow", 2017, 7, 4, 19, 30, "berth", 38),
                new Train(50, "Brest", 2017, 9, 2, 15, 30, "general", 0),
                new Train(37, "Paris", 2017, 2, 16, 18, 0, "lux", 5),
                new Train(45, "Paris", 2017, 10, 12, 11, 20, "coupe", 30),
                new Train(50, "Brest", 2017, 5, 27, 9, 30, "general", 50),
                new Train(50, "Moscow", 2017, 1, 10, 15, 0, "general", 12),
        };

        Train[] actual = FileReader.read("input.txt");
        Assert.assertArrayEquals(expected, actual);
    }

    @Test (expected = FileNotFoundException.class)
    public void fileExceptionTest() throws FileNotFoundException {
        Train[] actual = FileReader.read("bar.txt");
    }

    @Test (expected = NumberFormatException.class)
    public void parseExceptionTest() throws FileNotFoundException {
        Train[] actual = FileReader.read("input_exception.txt");
    }
}