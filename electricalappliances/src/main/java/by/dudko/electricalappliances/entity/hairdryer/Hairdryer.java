package by.dudko.electricalappliances.entity.hairdryer;

import by.dudko.electricalappliances.entity.ElectricalAppliance;
import by.dudko.electricalappliances.exception.IncorrectValueException;
import by.dudko.electricalappliances.valid.HairdryerValidator;

import java.math.BigDecimal;

/**
 * Created by cplus on 26.05.2017.
 */
public class Hairdryer extends ElectricalAppliance{
    private int numberModes;

    public Hairdryer() {
    }

    public Hairdryer(long id, String name, int power, BigDecimal price, int createYear, boolean plugged, int numberModes) throws IncorrectValueException {
        super(id, name, power, price, createYear, plugged);
        this.numberModes = numberModes;
    }

    public int getNumberModes() {
        return numberModes;
    }

    public void setNumberModes(int numberModes) throws IncorrectValueException {
        if(HairdryerValidator.isValidNumberModes(numberModes)) {
            this.numberModes = numberModes;
        }
        else {
            throw new IncorrectValueException("Incorrect numberModes!");
        }
    }

    @Override
    public String toString() {
        return "Hairdryer{" +
                "numberModes=" + numberModes +
                '}' + super.toString();
    }
}
