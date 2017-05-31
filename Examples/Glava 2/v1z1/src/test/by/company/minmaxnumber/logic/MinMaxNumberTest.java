package test.by.company.minmaxnumber.logic;

import by.company.minmaxnumber.logic.MinMaxNumber;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by HP on 12.01.2017.
 */
public class MinMaxNumberTest {
    @Test
    public void getMinNumberTest() {
        Integer array[] = {-333,22,55555,-1};
        Integer expected = -1;
        Integer actual = MinMaxNumber.getMinNumber(array);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getMaxNumberTest() {
        Integer array[] = {-333,22,55555,-1};
        Integer expected = 55555;
        Integer actual = MinMaxNumber.getMaxNumber(array);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getMinNumberLengthTest() {
        Integer array[] = {-333,22,55555,-1};
        int expected = 1;
        int actual = MinMaxNumber.getMinNumberLength(array);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getMaxNumberLengthTest() {
        Integer array[] = {-333,22,55555,-1};
        int expected = 5;
        int actual = MinMaxNumber.getMaxNumberLength(array);
        Assert.assertEquals(expected,actual);
    }

}