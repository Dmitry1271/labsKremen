package by.dudko.paperabout.entity.drowingexercisebook;

import by.dudko.paperabout.entity.ExerciseBook;
import by.dudko.paperabout.entity.Paper;
import by.dudko.paperabout.valid.DrawingExerciseBookValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;

/**
 * Created by cplus on 31.05.2017.
 */
public class DrawingExerciseBook extends ExerciseBook implements Paper {
    private static final Logger Logger = LogManager.getLogger(DrawingExerciseBook.class);
    private int numberDrawings;

    public DrawingExerciseBook() {
    }

    public DrawingExerciseBook(int pageNumber, String exerciseBookCover, BigDecimal price, int numberDrawings) {
        super(pageNumber, exerciseBookCover, price);
        setNumberDrawings(numberDrawings);
    }

    public int getNumberDrawings() {
        return numberDrawings;
    }

    public void setNumberDrawings(int numberDrawings) {
        if (DrawingExerciseBookValidator.isValidNumberDrawings(numberDrawings, getNumberPages())) {
            this.numberDrawings = numberDrawings;
        } else Logger.error("Incorrect number of drawings");
    }

    public boolean isClean() {
        return numberDrawings == 0;
    }

    @Override
    public String toString() {
        return "DrawingExerciseBook{" +
                "numberDrawings=" + numberDrawings +
                ", " + super.toString() +
                '}';
    }
}
