package by.dudko.computerwork.readtest;

import by.dudko.computerwork.entity.Computer;
import by.dudko.computerwork.read.ComputerReader;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by cplus on 28.05.2017.
 */
public class ComputerReaderTest {
    @Test
    public void readStringFromFileTest(){
        ArrayList<Computer> expected = new ArrayList<Computer>();
        expected.add(new Computer(1,"laptop","i5 core","win 7",6));
        expected.add(new Computer(2,"desktop","i7 core","win 10",8));

        ArrayList<Computer> actual = ComputerReader.readStringFromFile("computers.txt");

        Assert.assertEquals(expected,actual);



    }
}
