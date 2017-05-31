package by.dudko.electricalappliances.compare;

import by.dudko.electricalappliances.entity.ElectricalAppliance;

import java.util.Comparator;

/**
 * Created by cplus on 26.05.2017.
 */
public class ElectricalApplianceComparator implements Comparator<ElectricalAppliance> {
    @Override
    public int compare(ElectricalAppliance o1, ElectricalAppliance o2) {
        return o1.getPower() - o2.getPower();
    }
}
