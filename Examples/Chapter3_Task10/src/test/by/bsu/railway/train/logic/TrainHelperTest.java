package test.by.bsu.railway.train.logic;

import by.bsu.railway.train.entity.Train;
import by.bsu.railway.train.logic.TrainHelper;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by mrbro on 07-Apr-17.
 */
public class TrainHelperTest {
    private Train[] entities;

    @Before
    public void initialize(){
        entities = new Train[]{
                new Train(54, "Saint-Petersburg", 2017, 5, 19, 15, 0, "coupe", 25),
                new Train(28, "Moscow", 2017, 7, 4, 19, 30, "berth", 38),
                new Train(50, "Brest", 2017, 9, 2, 15, 30, "general", 0),
                new Train(37, "Paris", 2017, 2, 16, 18, 0, "lux", 5),
                new Train(45, "Paris", 2017, 10, 12, 11, 20, "coupe", 30),
                new Train(50, "Brest", 2017, 5, 27, 9, 30, "general", 50),
                new Train(50, "Moscow", 2017, 1, 10, 15, 0, "general", 12),
        };
    }

    @Test
    public void listToDestinationTest(){
        Train[] actual = TrainHelper.listToDestination(entities, "Moscow");
        Train[] expected = {entities[1], entities[6]};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void listToDestinationAfterTimeTest(){
        Train[] actual = TrainHelper.listToDestinationAfterTime(entities, "Paris", 2017, 05, 30);
        Train[] expected = {entities[3]};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void listToDestinationWithGeneralSeatsTest(){
        Train[] actual = TrainHelper.listToDestinationWithGeneralSeats(entities, "Brest");
        Train[] expected = {entities[5]};
        Assert.assertArrayEquals(expected, actual);
    }
}
