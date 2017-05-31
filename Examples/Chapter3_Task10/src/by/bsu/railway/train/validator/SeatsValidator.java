package by.bsu.railway.train.validator;

import by.bsu.railway.train.entity.TrainType;

/**
 * Created by mrbro on 07-Apr-17.
 */
public class SeatsValidator {
    public static boolean isValid(int seats, TrainType train){
        return seats >= 0 && seats <= train.getMaxseats();
    }
}
