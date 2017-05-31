package by.dudko.electricalappliances.valid;

/**
 * Created by cplus on 26.05.2017.
 */
public class HairdryerValidator {
    public static boolean isValidNumberModes(double diagonalSize) {
        return diagonalSize >= 0 && diagonalSize < 10;
    }
}
