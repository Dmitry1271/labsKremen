package org.bsu.playroom.validTest;

import org.bsu.playroom.valid.ToyValidator;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class ToyValidatorTest {
    @Test
    public void validateYearTest() {
        Assert.assertEquals(false, ToyValidator.validateYear(2018));
        Assert.assertEquals(true, ToyValidator.validateYear(1065));
        Assert.assertEquals(false, ToyValidator.validateYear(-600));
        Assert.assertEquals(true, ToyValidator.validateYear(2017));
    }

    @Test
    public void validatePriceTest() {
        Assert.assertEquals(false, ToyValidator.validatePrice(new BigDecimal("0")));
        Assert.assertEquals(false, ToyValidator.validatePrice(new BigDecimal("-1")));
        Assert.assertEquals(true, ToyValidator.validatePrice(new BigDecimal("1")));
    }
}
