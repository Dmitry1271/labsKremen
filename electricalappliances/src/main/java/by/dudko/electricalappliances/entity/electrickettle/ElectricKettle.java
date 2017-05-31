package by.dudko.electricalappliances.entity.electrickettle;

import by.dudko.electricalappliances.entity.ElectricalAppliance;
import by.dudko.electricalappliances.exception.IncorrectValueException;

import java.math.BigDecimal;

/**
 * Created by cplus on 26.05.2017.
 */
public class ElectricKettle extends ElectricalAppliance{
    private Material material;

    public ElectricKettle() {
    }

    public ElectricKettle(long id, String name, int power, BigDecimal price, int createYear, boolean plugged, Material material) throws IncorrectValueException {
        super(id, name, power, price, createYear, plugged);
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "ElectricKettle{" +
                "material=" + material +
                '}' + super.toString();
    }
}
