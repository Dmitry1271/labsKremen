package by.bsu.company.matrix.create;

import by.bsu.company.matrix.entity.Matrix;
import by.bsu.company.matrix.exception.MatrixException;
import by.bsu.company.matrix.valid.PositivIntValid;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by HP on 17.01.2017.
 */
public class MatrixCreator {

    public static void fillRandomized(Matrix t, int start, int end) {
    int v = t.getVerticalSize();
    int h = t.getHorizontalSize();
    for(int i = 0; i < v; i++) {
        for(int j = 0; j < h; j++) {
            try {
                double value = Math.random() * (end - start) + start;
                t.setElement(i, j, value);
            } catch (MatrixException e) {
                    /* в данном случае exception невозможен, поэтому обработка отсутствует,
                     но try пишем, поскольку метод setElement имеет throws MatrixException */
            }
        }
    }
}

    public static void fillFromStream(Matrix t, InputStream input) {
        int v = t.getVerticalSize();
        int h = t.getHorizontalSize();
        for(int i = 0; i < v; i++) {
            for(int j = 0; j < h; j++) {
                try {
                    double value = oneDoubleRead(input);
                    t.setElement(i, j, value);
                } catch (MatrixException e) {
                    /* в данном случае exception невозможен, поэтому обработка отсутствует,
                     но try пишем, поскольку метод setElement имеет throws MatrixException */
                }
            }
        }
    }

    private static double oneDoubleRead(InputStream input) {
        double number = 0;
        Scanner con = new Scanner(input);
        boolean continueInput = true;
        do {
            try {
                System.out.print("Enter an double: ");
                number = con.nextDouble();
                System.out.println(
                        "The number entered is " + number);
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Try again. (" +
                        "Incorrect input: an double is required)");
                con.nextLine();
            }
        }
        while (continueInput);
        return number;
    }
    // public void fillFromFile(Matrix t, File f) { /* код*/ }
    // public void fillFromDataBase(Matrix t, Connection conn) { /* код*/ }
}