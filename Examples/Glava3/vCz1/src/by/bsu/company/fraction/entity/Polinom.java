package by.bsu.company.fraction.entity;

import by.bsu.company.fraction.exception.NullDenominatorException;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by HP on 20.01.2017.
 */
public class Polinom implements  Serializable, Cloneable {
    TreeMap<Integer, Fraction> poly = new TreeMap<Integer, Fraction>((Integer i1, Integer i2) -> i2 - i1);

    public Polinom(TreeMap<Integer, Fraction> poly) {
        this.poly = poly;
        simplify();
    }

    public Polinom(int... args) throws NullDenominatorException {
        int i = 0;
        while (i + 2 < args.length) {
            poly.put(args[i], new Fraction(args[i + 1], args[i + 2]));
            i = i + 3;
        }
        simplify();
    }

    public TreeMap<Integer, Fraction> getPoly() {
        return poly;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (Map.Entry<Integer, Fraction> item : poly.entrySet()) {
            if (item.getValue().getNumerator() >= 0) {
                res.append("+");
            }
            res.append(item.getValue().toString());
            res.append("x^");
            res.append(item.getKey());
        }
        if (!poly.isEmpty()) {
            if (res.charAt(0) == '+') {
                res.deleteCharAt(0);
            }
            if(poly.containsKey(0)) {
                res.delete(res.length() - 3, res.length());
            }
        }
        return res.toString();
    }

    public Polinom clone () { // метод-подставка
        Polinom copy = null;
        try {
            copy = (Polinom)super.clone();
            copy.poly = (TreeMap<Integer, Fraction>)poly.clone();
            for (Map.Entry<Integer, Fraction> item : poly.entrySet()){
                Fraction f = new Fraction(item.getValue().getNumerator(),item.getValue().getDenominator());
                item.setValue(f);
            }


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        catch (NullDenominatorException e) {
            e.printStackTrace();
        }
        return copy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Polinom polinom = (Polinom) o;

        return getPoly() != null ? getPoly().equals(polinom.getPoly()) : polinom.getPoly() == null;

    }

    @Override
    public int hashCode() {
        return getPoly() != null ? getPoly().hashCode() : 0;
    }

    private void simplify(){
        TreeMap<Integer, Fraction> temp = new TreeMap<Integer, Fraction>((Integer i1,Integer i2)->i2-i1);
        for(Map.Entry<Integer, Fraction> item : this.poly.entrySet()){

            if (item.getValue().getNumerator()!=0){

                temp.put(item.getKey(), item.getValue());
            }
        }
        this.poly = temp;
    }
}
