package by.dudko.paperabout.validtest;

import by.dudko.paperabout.valid.DrawingExerciseBookValidator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by cplus on 31.05.2017.
 */
public class DrawingExerciseBookValidatorTest {
    @Test
    public void isValidNumberDrawingsTest(){
        Assert.assertEquals(true, DrawingExerciseBookValidator.isValidNumberDrawings(15,36));
        Assert.assertEquals(false, DrawingExerciseBookValidator.isValidNumberDrawings(-15,36));
        Assert.assertEquals(false, DrawingExerciseBookValidator.isValidNumberDrawings(50,36));
        Assert.assertEquals(false, DrawingExerciseBookValidator.isValidNumberDrawings(0,36));
        Assert.assertEquals(true, DrawingExerciseBookValidator.isValidNumberDrawings(36,36));
    }
}
