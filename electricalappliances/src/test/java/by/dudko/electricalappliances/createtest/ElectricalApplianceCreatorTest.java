package by.dudko.electricalappliances.createtest;

import by.dudko.electricalappliances.create.ElectricalApplianceCreator;
import by.dudko.electricalappliances.entity.ElectricalAppliance;
import by.dudko.electricalappliances.entity.electrickettle.ElectricKettle;
import by.dudko.electricalappliances.entity.electrickettle.Material;
import by.dudko.electricalappliances.entity.fridge.Color;
import by.dudko.electricalappliances.entity.fridge.Fridge;
import by.dudko.electricalappliances.entity.hairdryer.Hairdryer;
import by.dudko.electricalappliances.exception.IncorrectValueException;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by cplus on 27.05.2017.
 */
public class ElectricalApplianceCreatorTest {

    @Test
    public void createElectricalApplianceTest() throws IncorrectValueException {
        ArrayList<ElectricalAppliance> expected = new ArrayList<>();
        expected.add(new Fridge(0, "sdafv", 3000, new BigDecimal("4"), 2010, true, Color.GREY));
        expected.add(new ElectricKettle(1, "gtnhj", 1500, new BigDecimal("3"), 1500, false, Material.STEEL));
        expected.add(new Hairdryer(2, "qnyg", 600, new BigDecimal("2"), 2009, false, 8));
        ArrayList<ElectricalAppliance> actual = ElectricalApplianceCreator.getElectricalApplianceFromFile(new File("electricalAppliances.txt"));

        Assert.assertEquals(expected,actual);
    }
}
