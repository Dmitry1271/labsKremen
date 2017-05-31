package by.dudko.paperabout.valid;

import java.math.BigDecimal;

/**
 * Created by cplus on 31.05.2017.
 */
public class ExerciseBookValidator {
    public static boolean isValidNumberPages(int pageNumber) {
        return pageNumber > 0;
    }

    public static  boolean isValidPrice(BigDecimal price){
        return price.compareTo(new BigDecimal("0")) == 1;
    }
}
