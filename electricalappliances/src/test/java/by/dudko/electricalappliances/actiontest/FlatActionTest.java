package by.dudko.electricalappliances.actiontest;

import by.dudko.electricalappliances.action.FlatAction;
import by.dudko.electricalappliances.create.FlatCreator;
import by.dudko.electricalappliances.entity.ElectricalAppliance;
import by.dudko.electricalappliances.entity.Flat;
import by.dudko.electricalappliances.entity.fridge.Color;
import by.dudko.electricalappliances.entity.fridge.Fridge;
import by.dudko.electricalappliances.entity.hoover.CleanType;
import by.dudko.electricalappliances.entity.hoover.Hoover;
import by.dudko.electricalappliances.entity.iron.Iron;
import by.dudko.electricalappliances.entity.iron.SoleMaterial;
import by.dudko.electricalappliances.entity.hairdryer.Hairdryer;
import by.dudko.electricalappliances.exception.IncorrectValueException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cplus on 26.05.2017.
 */
public class FlatActionTest {
    ArrayList<ElectricalAppliance> electricalAppliances;
    Flat flat;

    @Before
    public void init() throws IncorrectValueException {
        electricalAppliances = new ArrayList<>();
        electricalAppliances.add(new Fridge(0, "Indezit", 4000, new BigDecimal("500"), 2000, true, Color.RED));
        electricalAppliances.add(new Iron(1, "asdc", 1000, new BigDecimal("100"), 2012, false, SoleMaterial.ALUMINIUM));
        electricalAppliances.add(new Hairdryer(2, "thbtr", 2400, new BigDecimal("200"), 2001, true, 6));
        electricalAppliances.add(new Hoover(3, "juyojn", 3000, new BigDecimal("400"), 2004, false, CleanType.COMBINED));
        flat = FlatCreator.createFlat(electricalAppliances);
    }

    @Test
    public void sortElectricalAppliancesTest() throws IncorrectValueException {
        FlatAction.sortElectricalAppliances(flat);
        List<ElectricalAppliance> actual = flat.getElectricalAppliances();

        List<ElectricalAppliance> expected = new ArrayList<>();
        expected.add(new Iron(1, "asdc", 1000, new BigDecimal("100"), 2012, false, SoleMaterial.ALUMINIUM));
        expected.add(new Hairdryer(2, "thbtr", 2400, new BigDecimal("200"), 2001, true, 6));
        expected.add(new Hoover(3, "juyojn", 3000, new BigDecimal("400"), 2004, false, CleanType.COMBINED));
        expected.add(new Fridge(0, "Indezit", 4000, new BigDecimal("500"), 2000, true, Color.RED));

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findByPriceTest() throws IncorrectValueException {
        List<ElectricalAppliance> actual = FlatAction.findByPrice(flat,new BigDecimal("150"),new BigDecimal("450"));

        List<ElectricalAppliance> expected = new ArrayList<>();
        expected.add(new Hairdryer(2, "thbtr", 2400, new BigDecimal("200"), 2001, true, 6));
        expected.add(new Hoover(3, "juyojn", 3000, new BigDecimal("400"), 2004, false, CleanType.COMBINED));

        Assert.assertEquals(expected,actual);
    }
}
