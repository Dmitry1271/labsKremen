package test.by.bsu.railway.train.entity;

import by.bsu.railway.train.entity.Train;
import org.junit.Test;

import java.time.DateTimeException;

/**
 * Created by mrbro on 14-Apr-17.
 */
public class TrainTest {
    @Test(expected = IllegalArgumentException.class)
    public void idExceptionTest(){
        Train entity = new Train(-2, "Saint-Petersburg", 2017, 5, 19, 15, 0, "coupe", 20);
    }

    @Test (expected = IllegalArgumentException.class)
    public void seatsExceptionTest(){
        Train entity = new Train(3, "Saint-Petersburg", 2017, 5, 19, 15, 0, "coupe", 9999);
    }

    @Test (expected = IllegalArgumentException.class)
    public void typeExceptionTest(){
        Train entity = new Train(3, "Saint-Petersburg", 2017, 5, 19, 15, 0, "bar", 10);
    }

    @Test (expected = DateTimeException.class)
    public  void dateExceptionTest(){
        Train entity = new Train(3, "Saint-Petersburg", 2, 30, 19, 15, 0, "coupe", 10);
    }
}
