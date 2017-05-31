package by.dudko.electricalappliances.entity.iron;

import by.dudko.electricalappliances.entity.ElectricalAppliance;
import by.dudko.electricalappliances.exception.IncorrectValueException;

import java.math.BigDecimal;

/**
 * Created by cplus on 26.05.2017.
 */
public class Iron extends ElectricalAppliance {
    private SoleMaterial soleMaterial;

    public Iron() {
    }

    public Iron(long id, String name, int power, BigDecimal price, int createYear, boolean plugged, SoleMaterial soleMaterial) throws IncorrectValueException {
        super(id, name, power, price, createYear, plugged);
        this.soleMaterial = soleMaterial;
    }

    public SoleMaterial getSoleMaterial() {
        return soleMaterial;
    }

    public void setSoleMaterial(SoleMaterial soleMaterial) {
        this.soleMaterial = soleMaterial;
    }

    @Override
    public String toString() {
        return "Iron{" +
                "soleMaterial=" + soleMaterial +
                '}' + super.toString();
    }
}
