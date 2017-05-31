package by.dudko.electricalappliances.exceptiontest;

import by.dudko.electricalappliances.exception.BadDataException;
import by.dudko.electricalappliances.read.ElectricalApplianceReader;
import javafx.scene.layout.Background;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by cplus on 26.05.2017.
 */
public class ElectricalApplianceReaderTest {
    @Test(expected = BadDataException.class)
    public void readElectricalApplianceTest() throws BadDataException {
        ElectricalApplianceReader.readElectricalAppliance("qqq");
    }
}
