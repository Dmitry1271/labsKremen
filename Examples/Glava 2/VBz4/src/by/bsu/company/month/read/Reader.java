package by.bsu.company.month.read;

import by.bsu.company.month.logic.MonthRunner;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by HP on 17.01.2017.
 */
public class Reader {
    public static int intReader(InputStream is){
        System.out.println("Input number of month: ");
        Scanner scanner = new Scanner(is);
        if(!scanner.hasNextInt()) {
            throw new IllegalArgumentException("Argument not integer");
        }
    return scanner.nextInt();
    }
}
