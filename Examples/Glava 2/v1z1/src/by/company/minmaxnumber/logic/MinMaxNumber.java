package by.company.minmaxnumber.logic;

import java.util.Arrays;

/**Class {@code MinMaxNumber} is designed for logical processing of array of integer data
 * Created by HP on 12.01.2017.
 * @author  student
 * @version 1.0
 */
public class MinMaxNumber {
/*@param  array of Integer (Object!!!) data
*@return minimum of elements of array (by length)
 */
    public static Integer getMinNumber(Integer array[]){
        Arrays.sort(array,(i1, i2)->Math.abs(i1)-Math.abs(i2));//sort с компаратором только для Integer!
       return array[0];
    }
    /*@param  array of Integer (Object!!!) data
    *@return number of minimum of elements of array (by length)
     */
    //https://habrahabr.ru/post/269237/
    public static int getMinNumberLength(Integer array[]){
        Integer i = getMinNumber(array);
        return String.valueOf(Math.abs(i)).length();
    }
    /*@param  array of Integer (Object!!!) data
     *@return number of  maximum of elements of array (by length)
     */
    public static int getMaxNumberLength(Integer array[]){
        Integer i = getMaxNumber(array);
        return String.valueOf(Math.abs(i)).length();
    }

    /*@param  array of Integer (Object!!!) data
     *@return number of maximum of elements of array (by length)
     */
    public static Integer getMaxNumber(Integer array[]){
        Arrays.sort(array,(i1, i2)->Math.abs(i1)-Math.abs(i2));
        return array[array.length-1];
    }
}
