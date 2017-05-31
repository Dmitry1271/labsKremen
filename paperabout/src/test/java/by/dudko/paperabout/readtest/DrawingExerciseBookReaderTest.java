package by.dudko.paperabout.readtest;

import by.dudko.paperabout.entity.drowingexercisebook.DrawingExerciseBook;
import by.dudko.paperabout.read.DrawingExerciseBookReader;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by cplus on 31.05.2017.
 */
public class DrawingExerciseBookReaderTest {
    @Test
    public void readStringFromFileTest(){
        ArrayList<DrawingExerciseBook> actual = DrawingExerciseBookReader.readStringFromFile("drawingexercisesbooks.txt");
        ArrayList<DrawingExerciseBook> expected = new ArrayList<DrawingExerciseBook>();
        expected.add(new DrawingExerciseBook(32,"soft",new BigDecimal("200"),15));
        expected.add(new DrawingExerciseBook(96,"solid",new BigDecimal("500"),35));
        expected.add(new DrawingExerciseBook(48,"soft",new BigDecimal("300"),5));
        Assert.assertEquals(expected,actual);
    }
}
