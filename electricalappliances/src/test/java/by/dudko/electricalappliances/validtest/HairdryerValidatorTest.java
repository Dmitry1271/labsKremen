package by.dudko.electricalappliances.validtest;

import by.dudko.electricalappliances.valid.HairdryerValidator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by cplus on 26.05.2017.
 */
public class HairdryerValidatorTest {
    @Test
    public void isValidDiagonalSizeTest(){
        Assert.assertEquals(true, HairdryerValidator.isValidNumberModes(6));
        Assert.assertEquals(true, HairdryerValidator.isValidNumberModes(0));
        Assert.assertEquals(false, HairdryerValidator.isValidNumberModes(20));
        Assert.assertEquals(false, HairdryerValidator.isValidNumberModes(-1));

    }
}
