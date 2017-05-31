package by.dudko.paperabout.valid;

/**
 * Created by cplus on 31.05.2017.
 */
public class DrawingExerciseBookValidator {
    public static boolean isValidNumberDrawings(int numberDrawings, int numberPages) {
        return numberDrawings >= 0 && numberDrawings <= numberPages;
    }
}
