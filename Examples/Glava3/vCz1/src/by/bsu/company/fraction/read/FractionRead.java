package by.bsu.company.fraction.read;

import by.bsu.company.fraction.entity.Fraction;
import by.bsu.company.fraction.exception.NullDenominatorException;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by HP on 19.01.2017.
 */
public class FractionRead {
    public static int oneIntRead(InputStream is) {
        int number = 0;
        Scanner con = new Scanner(is);
        boolean continueInput = true;
        do {
            try {
                System.out.print("Enter an integer: ");
                number = con.nextInt();
                System.out.println(
                        "The number entered is " + number);
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Try again. (" +
                        "Incorrect input: an integer is required)");
                con.nextLine();
            }
        }
        while (continueInput);
        return number;
    }

    public static int positivIntRead(InputStream is) {
        int number;
        boolean continueInput = true;
        do {
            System.out.print("Enter an size of array: ");
            number = oneIntRead(is);
            if (number > 0) {
                continueInput = false;
            }
        } while (continueInput);

        return number;
    }

    public static Fraction[] ArrayRead(InputStream is) throws NullDenominatorException {
        Fraction array[] = null;
        int size = positivIntRead(is);
        array =new Fraction[size];
        for (int i = 0; i < size; i++) {
            int numerator = oneIntRead(is);
            int denominator = oneIntRead(is);
            array[i] = new Fraction(numerator, denominator);
        }
        return array;
    }
}
