package by.dudko.computerwork.parsertest;

import by.dudko.computerwork.entity.Computer;
import by.dudko.computerwork.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by cplus on 29.05.2017.
 */
public class ParserTest {
    @Test
    public void parseString(){
        Computer expected = new Computer(1,"desktop","wet","win7",6);
        Computer actual = Parser.parseString("1, desktop, wet, win7, 6");
        Assert.assertEquals(expected,actual);
    }
}
