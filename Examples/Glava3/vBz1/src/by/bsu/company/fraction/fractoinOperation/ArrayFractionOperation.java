package by.bsu.company.fraction.fractoinOperation;

import by.bsu.company.fraction.entity.Fraction;
import by.bsu.company.fraction.exception.NullDenominatorException;

/**
 * Created by HP on 19.01.2017.
 */
public class ArrayFractionOperation {
    public static void changeEvenElement(Fraction[] array) throws NullDenominatorException {
        int i = 0;
        while ((i + 1) <array.length) {
            array[i] = FractionalOperations.sum(array[i], array[i + 1]);
            i=i+2;
        }
    }




}
