package by.dudko.paperabout.entitytest;

import by.dudko.paperabout.entity.drowingexercisebook.DrawingExerciseBook;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by cplus on 31.05.2017.
 */
public class PaperTest {
    @Test
    public void isCleanTest() {
        DrawingExerciseBook deb1 = new DrawingExerciseBook(10, "solid", new BigDecimal("300"), 0);
        DrawingExerciseBook deb2 = new DrawingExerciseBook(10, "solid", new BigDecimal("100"), 5);
        Assert.assertEquals(true, deb1.isClean());
        Assert.assertEquals(false, deb2.isClean());
    }
}
