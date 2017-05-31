package by.bsu.company.fraction.entity;

import by.bsu.company.fraction.exception.NullDenominatorException;

import java.io.Serializable;

/**
 * Created by HP on 19.01.2017.
 */
public class Fraction implements  Comparable<Fraction>, Serializable, Cloneable{
    private int numerator;
    private int denominator;

    public Fraction() {
        this.denominator = 1;
    }

    public Fraction(int numerator) {
        this();
        this.numerator = numerator;
    }

    public Fraction(int numerator, int denominator) throws NullDenominatorException {
        setFraction(numerator, denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        reduce();
    }

    public final void setDenominator(int denominator) throws NullDenominatorException {

        if (denominator != 0) {
            this.denominator = denominator;
            reduce();
        } else {
            throw new NullDenominatorException("Denominator must be not null!");
        }
    }

    public final void setFraction(int numerator, int denominator) throws NullDenominatorException {
        this.numerator = numerator;
        setDenominator(denominator);
        reduce();
    }

    public void setFraction(Fraction fraction) throws NullDenominatorException {
        setFraction(fraction.getNumerator(), fraction.getDenominator());
    }


    public final void reduce() {
        int nod = nod(Math.abs(numerator), Math.abs(denominator));
        // System.out.println(nod);
        numerator = numerator / nod;
        denominator = denominator / nod;
        if ((numerator < 0) && (denominator < 0)) {
            numerator = Math.abs(numerator);
            denominator = Math.abs(denominator);
        } else if (denominator < 0) {
            numerator = -1 * numerator;
            denominator = Math.abs(denominator);
        }
    }

    @Override
    public String toString() {
        String res;
        if (denominator != 1) {
            res = numerator + "/" + denominator;
        } else {
            res = String.valueOf(numerator);
        }
        return res;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Fraction ob) {
        return this.numerator*ob.getDenominator()-ob.getNumerator()*this.denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fraction fraction = (Fraction) o;

        if (getNumerator() != fraction.getNumerator()) return false;
        return getDenominator() == fraction.getDenominator();

    }

    @Override
    public int hashCode() {
        int result = getNumerator();
        result = 31 * result + getDenominator();
        return result;
    }

    private int nod(int a, int b) {
        int t;
        while (b > 0) {
            t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

}




