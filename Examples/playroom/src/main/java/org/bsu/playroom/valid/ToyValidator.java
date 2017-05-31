package org.bsu.playroom.valid;

import java.math.BigDecimal;
import java.time.Year;

public class ToyValidator {
    public static boolean validateYear(int year) {
        return year > -500 && year <= Year.now().getValue();
    }

    public static boolean validatePrice(BigDecimal price) {
        return new BigDecimal("0").compareTo(price) == -1;
    }
}
