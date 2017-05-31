package by.dudko.electricalappliances.valid;


import java.math.BigDecimal;
import java.time.Year;

/**
 * Created by cplus on 20.05.2017.
 */
public class ElectricalApplianceValidator {

    public static boolean isValidYear(int year) {
        return year > 0 && year <= Year.now().getValue();
    }

    public static boolean isValidPower(int power) {
        return power > 0;
    }

    public static boolean isVlidPrice(BigDecimal price) {
        return price.compareTo(new BigDecimal("0")) == 1;
    }
}
