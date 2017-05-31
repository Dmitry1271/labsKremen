package by.company.minmaxnumber.entity;

import by.company.minmaxnumber.exception.BadDateException;
import by.company.minmaxnumber.valid.DateValid;
import com.sun.media.sound.InvalidDataException;
import org.omg.CORBA.DynAnyPackage.Invalid;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Class {@code User} is designed for storage of user data
 * Created by HP on 14.01.2017.
 * @author  student
 * @version 1.0
 */

public class User{
    private String name;
    private int year;
    private int month;
    private int date;
    private int hourOfDay;
    private int minute;

    /**
     * Constructor of class
     * @param   name   the name of user
     * @param   year   the year of the date of getting of the task
     * @param   month   the month of the date of getting of the task
     * @param   date   the day of the date of the task
     * @param   hourOfDay   the hour Of Day of date of getting of the task
     * @param   minute   the minute of the date of getting of the task
     * @exception  BadDateException if the date ia bad then
     * throw this exception to indicate that an instance cannot create
     */

    public User(String name, int year, int month, int date, int hourOfDay, int minute) throws  BadDateException{
        this.name = name;
        if(DateValid.isValidDate(year, month, date)&&DateValid.isValidHour(hourOfDay)&&DateValid.isValidMinute(minute)) {
            this.year = year;
            this.month = month - 1;
            this.date = date;
            this.hourOfDay = hourOfDay;
            this.minute = minute;
        }
        else {
            throw new BadDateException("Bad date in creating User");
        }

    }

    /**
     * Returned the field value name
     * @return field value name
     */
    public String getName() {
        return name;
    }

    /**
     * Returned the time of getting task of student
     * @return the time of getting task in long
     */
    public long timeGettingTask(){
        GregorianCalendar calendarGetTasks = new GregorianCalendar();
        calendarGetTasks.set(year, month, date, hourOfDay, minute);

        return calendarGetTasks.getTimeInMillis();
    }

    /**
     * Returned the time of finish task of student
     * @return the time of finish task in long
     */
    public long timeFinishTask(){
        GregorianCalendar carrentCalendar = new GregorianCalendar();
        return carrentCalendar.getTimeInMillis();
    }
}
