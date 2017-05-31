package by.dudko.computerwork.validtest;

import by.dudko.computerwork.valid.RandomAccessMemoryValidator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by cplus on 28.05.2017.
 */
public class RandomAccessMemoryValidatorTest {
    @Test
    public void isValidRandomAccessMemoryTest(){
        Assert.assertEquals(true, RandomAccessMemoryValidator.isValidRandomAccessMemory(10));
        Assert.assertEquals(false,RandomAccessMemoryValidator.isValidRandomAccessMemory(0));
        Assert.assertEquals(false,RandomAccessMemoryValidator.isValidRandomAccessMemory(-10));
        Assert.assertEquals(false,RandomAccessMemoryValidator.isValidRandomAccessMemory(150));
    }
}
