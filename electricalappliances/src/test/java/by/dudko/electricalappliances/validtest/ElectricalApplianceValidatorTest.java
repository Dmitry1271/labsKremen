package by.dudko.electricalappliances.validtest;

import by.dudko.electricalappliances.valid.ElectricalApplianceValidator;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by cplus on 26.05.2017.
 */
public class ElectricalApplianceValidatorTest {
    @Test
    public void isValidYearTest(){
        Assert.assertEquals(true, ElectricalApplianceValidator.isValidYear(2014));
        Assert.assertEquals(true,ElectricalApplianceValidator.isValidYear(1050));
        Assert.assertEquals(false,ElectricalApplianceValidator.isValidYear(-100));
        Assert.assertEquals(false,ElectricalApplianceValidator.isValidYear(2033));
    }

    @Test
    public void isValidPowerTest(){
        Assert.assertEquals(true,ElectricalApplianceValidator.isValidPower(1800));
        Assert.assertEquals(false, ElectricalApplianceValidator.isValidPower(-1500));
        Assert.assertEquals(false, ElectricalApplianceValidator.isValidPower(0));
    }

    @Test
    public void isValidPriceTest(){
        Assert.assertEquals(true,ElectricalApplianceValidator.isVlidPrice(new BigDecimal("50")));
        Assert.assertEquals(false,ElectricalApplianceValidator.isVlidPrice(new BigDecimal("0")));
        Assert.assertEquals(false,ElectricalApplianceValidator.isVlidPrice(new BigDecimal("-1")));
    }
}
