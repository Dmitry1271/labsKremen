package by.bsu.company.month.logic;

import by.bsu.company.month.exception.NumberMonthException;
import by.bsu.company.month.constant.Month;
import by.bsu.company.month.valid.ManthValide;

/**
 * Created by HP on 17.01.2017.
 */
public class MonthRunner {
    public static String getMonthName(int monthNumber) throws NumberMonthException{
        if (!ManthValide.isNumberMonth(monthNumber)) {
            throw new NumberMonthException("Incorrect month number");
        }
        //return Month.values()[monthNumber-1].getDisplayName(TextStyle.SHORT,Locale.forLanguageTag("Ru"));//import java.time.Month;
        //return new DateFormatSymbols(/*Locale.ENGLISH*//*Locale.US*/).getMonths()[monthNumber-1];
        return (Month.values()[monthNumber-1].name());

    }

}
