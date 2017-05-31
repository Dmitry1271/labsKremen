package by.company.minmaxnumber;

import by.company.minmaxnumber.entity.User;
import by.company.minmaxnumber.exception.BadDateException;
import by.company.minmaxnumber.logic.MinMaxNumber;
import by.company.minmaxnumber.reader.NumberReader;
import by.company.minmaxnumber.valid.DateValid;
import com.sun.media.sound.InvalidDataException;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.*;
import java.util.*;
/**Class {@code Main} is point of entry in programm
 * Created by HP on 12.01.2017.
 * @author  student
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {//Tools-> generate java doc
        try {
            Integer array[]=NumberReader.ArrayRead();
            for (int i=0; i<array.length;i++) { // просмотр всех элементов массива
                System.out.printf("%d ", array[i]); // вывод всех элементов
            }

            System.out.println();
            System.out.println("Самое длинное число " + MinMaxNumber.getMaxNumber(array)
                    + ". Его длина " + MinMaxNumber.getMaxNumberLength(array));
            System.out.println("Самое короткое число " + MinMaxNumber.getMinNumber(array)
                    + ". Его длина " + MinMaxNumber.getMinNumberLength(array));

            User user = new User("Ivanov", 2017, 1, 4, 15, 30);
            System.out.println("Автор проекта " + user.getName());
            System.out.print("Время получения задания: ");
            long getTaskTime = user.timeGettingTask();
            String taskStringDate = new SimpleDateFormat("d MMMMM yyyy HH:mm").format(getTaskTime);
            System.out.println(taskStringDate);

            System.out.print("Время сдачи задания ");
            long currTime = user.timeFinishTask();
            String currStingTime = new SimpleDateFormat("d MMMMM yyyy HH:mm").format(currTime);
            System.out.println(currStingTime);





        }
        catch (BadDateException e){
            System.out.println(e.getMessage());
        }



    }
}
