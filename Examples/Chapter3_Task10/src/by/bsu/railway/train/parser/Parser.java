package by.bsu.railway.train.parser;

import by.bsu.railway.train.entity.Train;

/**
 * Created by mrbro on 09-Apr-17.
 */
public class Parser {
    public static Train parseString(String data){
        int id;
        String destination;
        int year, month, day, hour, minute;
        String type;
        int seats;

        String[] entities = data.split(" ");

        id = Integer.parseInt(entities[0]);
        destination = entities[1];
        year = Integer.parseInt(entities[2]);
        month = Integer.parseInt(entities[3]);
        day = Integer.parseInt(entities[4]);
        hour = Integer.parseInt(entities[5]);
        minute = Integer.parseInt(entities[6]);
        type = entities[7];
        seats = Integer.parseInt(entities[8]);

        return new Train(id, destination, year, month, day, hour, minute, type, seats);
    }
}
