package by.bsu.railway.train.logic;

import by.bsu.railway.train.entity.Train;
import by.bsu.railway.train.entity.TrainType;
import by.bsu.railway.train.converter.Converter;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Created by mrbro on 07-Apr-17.
 */
public class TrainHelper {
    public static Train[] listToDestination(Train[] array, String destination){
        ArrayList<Train> list = new ArrayList<>();
        for (Train train : array){
            if (train.getDestination().equals(destination)){
                list.add(train);
            }
        }
        return Converter.listToArray(list);
    }

    public static Train[] listToDestinationAfterTime(Train[] array, String destination, int year, int month, int dayOfMonth){
        ArrayList<Train> list = new ArrayList<>();
        Train[] trains = listToDestination(array, destination);

        for (Train train : trains){
            if (LocalDateTime.of(year, month, dayOfMonth, 0, 0).compareTo(train.getDeparture()) > 0){
                list.add(train);
            }
        }

        return Converter.listToArray(list);
    }

    public static Train[] listToDestinationWithGeneralSeats(Train[] array, String destination){
        ArrayList<Train> list = new ArrayList<>();
        Train[] trains = listToDestination(array, destination);

        for (Train train : trains){
            if (train.getType() == TrainType.GENERAL && train.getSeats() > 0){
                list.add(train);
            }
        }

        return Converter.listToArray(list);
    }
}
