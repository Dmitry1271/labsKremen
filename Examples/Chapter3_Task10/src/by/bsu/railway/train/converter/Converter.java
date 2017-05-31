package by.bsu.railway.train.converter;

import by.bsu.railway.train.entity.Train;

import java.util.ArrayList;

/**
 * Created by mrbro on 09-Apr-17.
 */
public class Converter {
    public static Train[] listToArray(ArrayList<Train> list){
        Train[] result = new Train[list.size()];
        result = list.toArray(result);
        return result;
    }
}
