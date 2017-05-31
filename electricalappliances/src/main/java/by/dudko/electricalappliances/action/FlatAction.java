package by.dudko.electricalappliances.action;

import by.dudko.electricalappliances.compare.ElectricalApplianceComparator;
import by.dudko.electricalappliances.entity.ElectricalAppliance;
import by.dudko.electricalappliances.entity.Flat;
import by.dudko.electricalappliances.exception.IncorrectValueException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by cplus on 26.05.2017.
 */
public class FlatAction {
    public static void sortElectricalAppliances(Flat flat) throws IncorrectValueException {// return list
        List<ElectricalAppliance> flatElectricalAppliances = flat.getElectricalAppliances();
        Collections.sort(flatElectricalAppliances, new ElectricalApplianceComparator());
        flat.setElectricalAppliances(flatElectricalAppliances);
    }

    public static ArrayList<ElectricalAppliance> findByPrice(Flat flat, BigDecimal minPrice, BigDecimal maxPrice) {
        ArrayList<ElectricalAppliance> result = new ArrayList<>();
        for (ElectricalAppliance electricalAppliance : flat.getElectricalAppliances()) {
            if (electricalAppliance.getPrice().compareTo(minPrice) >= 0 && electricalAppliance.getPrice().compareTo(maxPrice) < 0) {
                result.add(electricalAppliance);
            }
        }
        return result;
    }
}
