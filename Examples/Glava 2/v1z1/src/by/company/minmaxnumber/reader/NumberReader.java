package by.company.minmaxnumber.reader;

import by.company.minmaxnumber.valid.PositivIntValid;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

/**Class {@code NumberReader} is designed for getting correct array of integer from console
 * Created by HP on 12.01.2017.
 * @author  student
 * @version 1.0
 */
public class NumberReader {
    /**
     * get one int from concole
     * @return int from concole
     */
    private static int oneIntRead() {
        int number = 0;
        Scanner con = new Scanner(System.in);
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
                /*Когда любой из методов nextXxx (...) не работает, курсор ввода сканера сбрасывается туда,
                  где он была перед вызовом. Поэтому nextLine () в обработчике исключений должен
                  пропустить "мусор" и подготовить к следующей попытке введения целого числа.
                  Если удалилить nextLine (), будет неоднократно предприниматься попытка
                  повторной обработки одиного и тот же "мусора".
                */
            }
        }
        while (continueInput);
        return number;
    }
    /**
     * get one positive int from concole
     * @return positive int from concole
     */
    private static int positivIntRead() {
        int number;
        boolean continueInput = true;
        do {
            System.out.print("Enter an size of array: ");
            number=oneIntRead();
            if(PositivIntValid.isValidSize(number))
            {
                continueInput=false;
            }
        }while (continueInput);

    return number;
    }
    /**
     * get array int from concole
     * @return array int from concole
     */
    public static Integer[] ArrayRead() {
        int size = positivIntRead();
        Integer array[] = new Integer[size];
        for (int i=0; i<size; i++){
            array[i] = oneIntRead();
        }
        return array;
    }
}
