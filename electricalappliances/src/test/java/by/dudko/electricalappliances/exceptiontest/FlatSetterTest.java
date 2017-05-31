package by.dudko.electricalappliances.exceptiontest;

import by.dudko.electricalappliances.create.FlatCreator;
import by.dudko.electricalappliances.entity.ElectricalAppliance;
import by.dudko.electricalappliances.entity.Flat;
import by.dudko.electricalappliances.entity.hairdryer.Hairdryer;
import by.dudko.electricalappliances.entity.hoover.CleanType;
import by.dudko.electricalappliances.entity.hoover.Hoover;
import by.dudko.electricalappliances.entity.iron.Iron;
import by.dudko.electricalappliances.entity.iron.SoleMaterial;
import by.dudko.electricalappliances.exception.IncorrectValueException;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by cplus on 26.05.2017.
 */
public class FlatSetterTest {
    @Test(expected = IncorrectValueException.class)
    public void flatSetterTest() throws IncorrectValueException {
        ArrayList<ElectricalAppliance> electricalAppliances = new ArrayList<>();
        electricalAppliances.add(new Iron(0,"qwerty",3000,new BigDecimal("500"),2010,true, SoleMaterial.CERMET));
        electricalAppliances.add(new Hoover(1,"zcxv",4000,new BigDecimal("100"),2009,true, CleanType.COMBINED));
        electricalAppliances.add(new Hairdryer(2,"asdf",2000,new BigDecimal("600"),2011,false, 7));

        Flat flat = FlatCreator.createFlat(electricalAppliances);
        electricalAppliances.add(new Hairdryer(3,"asdf",2000,new BigDecimal("600"),2011,false, 7));
        flat.setElectricalAppliances(electricalAppliances);
    }
}
