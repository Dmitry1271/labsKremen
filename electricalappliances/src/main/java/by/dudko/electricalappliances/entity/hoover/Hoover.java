package by.dudko.electricalappliances.entity.hoover;

import by.dudko.electricalappliances.entity.ElectricalAppliance;
import by.dudko.electricalappliances.exception.IncorrectValueException;

import java.math.BigDecimal;

/**
 * Created by cplus on 26.05.2017.
 */
public class Hoover extends ElectricalAppliance {
    private CleanType cleanType;

    public Hoover() {
    }

    public Hoover(long id, String name, int power, BigDecimal price, int createYear, boolean plugged, CleanType cleanType) throws IncorrectValueException {
        super(id, name, power, price, createYear, plugged);
        this.cleanType = cleanType;
    }

    public CleanType getCleanType() {
        return cleanType;
    }

    public void setCleanType(CleanType cleanType) {
        this.cleanType = cleanType;
    }

    @Override
    public String toString() {
        return "Hoover{" +
                "cleanType=" + cleanType +
                '}' + super.toString();
    }
}
