package by.bsu.company.fraction.entityOperation;

import by.bsu.company.fraction.entity.Fraction;
import by.bsu.company.fraction.exception.NullDenominatorException;

/**
 * Created by HP on 19.01.2017.
 */
public class FractionalOperations {
    public static Fraction sum(Fraction f1, Fraction f2) throws NullDenominatorException {
        int numerator;
        int denominator;
        if (f1.getDenominator() != f2.getDenominator()) {
            numerator = f1.getNumerator() * f2.getDenominator() + f2.getNumerator() * f1.getDenominator();
            denominator = f1.getDenominator() * f2.getDenominator();
        } else {
            numerator = f1.getNumerator() + f2.getNumerator();
            denominator = f1.getDenominator();
        }
        return new Fraction(numerator, denominator);
    }

    public static Fraction difference(Fraction f1, Fraction f2) throws NullDenominatorException {
        return sum(f1, new Fraction(-f2.getNumerator(), f2.getDenominator()));
    }

    public static Fraction divide(Fraction f1, Fraction f2) throws NullDenominatorException {
        int numerator;
        int denominator;
        numerator = f1.getNumerator() * f2.getDenominator();
        denominator = f1.getDenominator() * f2.getNumerator();
        return new Fraction(numerator, denominator);
    }
    public static Fraction product(Fraction f1, Fraction f2) throws NullDenominatorException {
        int numerator;
        int denominator;
        numerator = f1.getNumerator() * f2.getNumerator();
        denominator = f1.getDenominator() * f2.getDenominator();
        return new Fraction(numerator, denominator);
    }
}
