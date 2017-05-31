package by.dudko.electricalappliances.entity.fridge;

import by.dudko.electricalappliances.entity.ElectricalAppliance;
import by.dudko.electricalappliances.exception.IncorrectValueException;

import java.math.BigDecimal;

/**
 * Created by cplus on 26.05.2017.
 */
public class Fridge extends ElectricalAppliance{
    private Color color;

    public Fridge() {
    }

    public Fridge(long id, String name, int power, BigDecimal price, int createYear, boolean plugged, Color color) throws IncorrectValueException {
        super(id, name, power, price, createYear, plugged);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "color=" + color +
                '}' + super.toString();
    }
}
