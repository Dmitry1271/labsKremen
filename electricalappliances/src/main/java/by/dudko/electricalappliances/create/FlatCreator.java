package by.dudko.electricalappliances.create;

import by.dudko.electricalappliances.entity.ElectricalAppliance;
import by.dudko.electricalappliances.entity.Flat;

import java.util.ArrayList;

/**
 * Created by cplus on 26.05.2017.
 */
public class FlatCreator {
    public static Flat createFlat(ArrayList<ElectricalAppliance> electricalAppliances) {
        Flat flat = new Flat(new ArrayList<>());
        for(ElectricalAppliance electricalAppliance:electricalAppliances){
            flat.addElectricalAppliance(electricalAppliance);
        }
        return flat;
    }
}
