package by.dudko.electricalappliances.entity;

import by.dudko.electricalappliances.exception.IncorrectValueException;

import java.util.List;

/**
 * Created by cplus on 26.05.2017.
 */
public class Flat {
    private List<ElectricalAppliance> electricalAppliances;

    public Flat() {
    }

    public Flat(List<ElectricalAppliance> electricalAppliances) {
        this.electricalAppliances = electricalAppliances;
    }

    public List<ElectricalAppliance> getElectricalAppliances() {
        return electricalAppliances;
    }

    private int getTotalPower() {
        int totalPower = 0;
        for (ElectricalAppliance electricalAppliance : electricalAppliances) {
            if (electricalAppliance.isPlugged()) {
                totalPower += electricalAppliance.getPower();
            }
        }
        return totalPower;
    }

    public void setElectricalAppliances(List<ElectricalAppliance> electricalAppliances) throws IncorrectValueException {
        if (this.electricalAppliances.containsAll(electricalAppliances) && electricalAppliances.containsAll(this.electricalAppliances)) {
            this.electricalAppliances = electricalAppliances;
        } else {
            throw new IncorrectValueException("You can't change electrical appliances in the flat");
        }
    }

    public void addElectricalAppliance(ElectricalAppliance electricalAppliance) {
        electricalAppliances.add(electricalAppliance);
    }

    @Override
    public String toString() {
        return "Flat{" +
                "electricalAppliances=" + electricalAppliances +
                '}';
    }
}
