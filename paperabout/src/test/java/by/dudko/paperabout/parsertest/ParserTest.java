package by.dudko.paperabout.parsertest;

import by.dudko.paperabout.entity.drowingexercisebook.DrawingExerciseBook;
import by.dudko.paperabout.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by cplus on 31.05.2017.
 */
public class ParserTest {
    @Test
    public void parseStringTest(){
        DrawingExerciseBook actual = Parser.parseString("32, soft, 200, 15");
        DrawingExerciseBook expected = new DrawingExerciseBook(32,"soft",new BigDecimal("200"),15);
        Assert.assertEquals(expected,actual);
    }
}
