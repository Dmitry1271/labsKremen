package by.dudko.paperabout.entity;

import by.dudko.paperabout.exception.IncorrectValueException;
import by.dudko.paperabout.valid.ExerciseBookValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;

/**
 * Created by cplus on 31.05.2017.
 */
public abstract class ExerciseBook {
    private static final Logger Logger = LogManager.getLogger(ExerciseBook.class);
    private int numberPages;
    private ExerciseBookCover exerciseBookCover;
    private BigDecimal price;

    public ExerciseBook() {
    }

    public ExerciseBook(int numberPages, String exerciseBookCover, BigDecimal price) {
        this.exerciseBookCover = ExerciseBookCover.valueOf(exerciseBookCover.toUpperCase());
        setNumberPages(numberPages);
        setPrice(price);
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        if(ExerciseBookValidator.isValidNumberPages(numberPages)) {
            this.numberPages = numberPages;
        }
        else Logger.error(new IncorrectValueException("Incorrect number of pages"));
    }

    public ExerciseBookCover getExerciseBookCover() {
        return exerciseBookCover;
    }

    public void setExerciseBookCover(ExerciseBookCover exerciseBookCover) {
        this.exerciseBookCover = exerciseBookCover;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        if(ExerciseBookValidator.isValidPrice(price)) {
            this.price = price;
        }
        else Logger.error(new IncorrectValueException("Incorrect price"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExerciseBook that = (ExerciseBook) o;

        if (numberPages != that.numberPages) return false;
        if (exerciseBookCover != that.exerciseBookCover) return false;
        return price != null ? price.equals(that.price) : that.price == null;
    }

    @Override
    public int hashCode() {
        int result = numberPages;
        result = 31 * result + (exerciseBookCover != null ? exerciseBookCover.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ExerciseBook{" +
                "numberPages=" + numberPages +
                ", exerciseBookCover=" + exerciseBookCover +
                ", price=" + price +
                '}';
    }
}
