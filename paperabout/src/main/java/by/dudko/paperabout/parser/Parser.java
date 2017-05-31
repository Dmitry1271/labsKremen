package by.dudko.paperabout.parser;

import by.dudko.paperabout.entity.drowingexercisebook.DrawingExerciseBook;

import java.math.BigDecimal;

/**
 * Created by cplus on 31.05.2017.
 */
public class Parser {
    public static DrawingExerciseBook parseString(String data) {
        int pageNumber;
        String exerciseBookCover;
        BigDecimal price;
        int numberDrawings;

        String[] entities = data.split(", ");
        pageNumber = Integer.parseInt(entities[0]);
        exerciseBookCover = entities[1];
        price = new BigDecimal(entities[2]);
        numberDrawings = Integer.parseInt(entities[3]);
        return new DrawingExerciseBook(pageNumber, exerciseBookCover, price, numberDrawings);
    }
}
