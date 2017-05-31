package by.bsu.company.month;

//import by.bsu.company.month.constant.Month;

import by.bsu.company.month.exception.NumberMonthException;
import by.bsu.company.month.logic.MonthRunner;
import by.bsu.company.month.read.Reader;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

//import java.time.Month;


public class Main {

    public static void main(String[] args) {
        try{
            int monthNumber = Reader.intReader(System.in);
            System.out.println(MonthRunner.getMonthName(monthNumber));
           // По английски стандартными средствами
            System.out.println(java.time.Month.of(monthNumber)) ;

            // По русски стандартными средствами
            Month month = Month.of(monthNumber);
            Locale loc = Locale.forLanguageTag("ru");
            System.out.println(month.getDisplayName(TextStyle.FULL_STANDALONE, loc));
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        catch (NumberMonthException e) {
            System.out.println(e.getMessage());
        }
    }
}