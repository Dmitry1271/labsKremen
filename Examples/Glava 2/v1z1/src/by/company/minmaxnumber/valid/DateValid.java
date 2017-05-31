package by.company.minmaxnumber.valid;

import by.company.minmaxnumber.exception.BadDateException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**Class {@code DateValid} is designed for validation of date
 * Created by HP on 14.01.2017.
 * @author  student
 * @version 1.0
 */
public class DateValid {
    /**
     *
     * @param   year   the year of the date of getting of the task
     * @param   month   the month of the date of getting of the task
     * @param   date   the day of the date of the task
     * @return  {@code true} if date is the valid
     * and {@code false} otherwise.
     *
     */
    public static boolean isValidDate(int year, int month, int date)

    {
        //https://dzone.com/articles/techtip-use-setlenient-method
        //http://voituk.kiev.ua/2007/08/23/java-date-parse/
        //http://bugs.java.com/view_bug.do?bug_id=4880502
        String dateStr = String.valueOf(date)+"/"+String.valueOf(month)+"/"+String.valueOf(year);
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("dd/MM/yyyy");
        sdf.setLenient(false);
        try {
            Date d = sdf.parse(dateStr);//Если успешно распарсится, то дата валидна
        } catch (ParseException e) {
            //may output in logger
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    /**Validation ot time     *
     * @param min minute of getting of task
     * @return {@code true} if minute is the valid
     * and {@code false} otherwise.
     */
    public static boolean isValidMinute(int min){
        return ((min>0)&&(min<=60));
    }
    /**Validation ot time     *
     * @param hour hour of getting of task
     * @return {@code true} if hour is the valid
     * and {@code false} otherwise.
     */
    public static boolean isValidHour(int hour){
        return ((hour>=0)&&(hour<=23));
    }
}
