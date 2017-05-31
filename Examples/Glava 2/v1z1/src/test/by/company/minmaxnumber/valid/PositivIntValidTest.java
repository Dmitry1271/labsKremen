package test.by.company.minmaxnumber.valid;

import by.company.minmaxnumber.valid.PositivIntValid;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by HP on 12.01.2017.
 */
public class PositivIntValidTest {
    @Test
    public void isValidSweetTrue() throws Exception {
        Assert.assertTrue(PositivIntValid.isValidSize(5));
    }
    @Test
    public void isValidSweetFalse() throws Exception {
        Assert.assertFalse(PositivIntValid.isValidSize(-5));
    }

}