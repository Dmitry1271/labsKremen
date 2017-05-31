package by.dudko.electricalappliances.exceptiontest;

import by.dudko.electricalappliances.entity.ElectricalAppliance;
import by.dudko.electricalappliances.entity.fridge.Color;
import by.dudko.electricalappliances.entity.fridge.Fridge;
import by.dudko.electricalappliances.exception.IncorrectValueException;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by cplus on 26.05.2017.
 */
public class ElectricalAppliancesSettersTest {
    @Test(expected = IncorrectValueException.class)
    public void createYearSetterTest() throws IncorrectValueException {
        ElectricalAppliance electricalAppliance = new Fridge(0, "qewr", 3000, new BigDecimal("1000"), 1999, true, Color.BLUE);
        electricalAppliance.setCreateYear(2050);
    }

    @Test(expected = IncorrectValueException.class)
    public void createYearConstructorTest() throws IncorrectValueException {
        ElectricalAppliance electricalAppliance = new Fridge(0, "qewr", 3000, new BigDecimal("1000"), -1050, true, Color.BLUE);
    }

    @Test(expected = IncorrectValueException.class)
    public void priceSetterTest() throws IncorrectValueException {
        ElectricalAppliance electricalAppliance = new Fridge(0, "qewr", 3000, new BigDecimal("1000"), 1999, true, Color.BLUE);
        electricalAppliance.setPrice(new BigDecimal("-1"));
    }

    @Test(expected = IncorrectValueException.class)
    public void priceConstructorTest() throws IncorrectValueException {
        ElectricalAppliance electricalAppliance = new Fridge(0, "qewr", 3000, new BigDecimal("0"), 1999, true, Color.BLUE);
    }

    @Test(expected = IncorrectValueException.class)
    public void powerSetterTest() throws IncorrectValueException {
        ElectricalAppliance electricalAppliance = new Fridge(0, "qewr", 3000, new BigDecimal("1000"), 1999, true, Color.BLUE);
        electricalAppliance.setPower(-2000);
    }

    @Test(expected = IncorrectValueException.class)
    public void powerConstructorTest() throws IncorrectValueException {
        ElectricalAppliance electricalAppliance = new Fridge(0, "qewr", -600, new BigDecimal("1000"), 1050, true, Color.BLUE);
    }


}
