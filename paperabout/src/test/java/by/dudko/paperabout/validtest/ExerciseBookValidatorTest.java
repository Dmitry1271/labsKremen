package by.dudko.paperabout.validtest;

import by.dudko.paperabout.valid.ExerciseBookValidator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by cplus on 31.05.2017.
 */
public class ExerciseBookValidatorTest {
    @Test
    public void isValidPageNumbersTest(){
        Assert.assertEquals(true, ExerciseBookValidator.isValidNumberPages(12));
        Assert.assertEquals(true, ExerciseBookValidator.isValidNumberPages(64));
        Assert.assertEquals(false, ExerciseBookValidator.isValidNumberPages(0));
        Assert.assertEquals(false, ExerciseBookValidator.isValidNumberPages(-64));
    }
}
