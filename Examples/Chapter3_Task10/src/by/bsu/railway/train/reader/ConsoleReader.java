package by.bsu.railway.train.reader;

import by.bsu.railway.train.entity.Train;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by mrbro on 09-Apr-17.
 */
public class ConsoleReader {

    private static Scanner console = new Scanner(System.in);

    private static int readInt(){
        int result = 0;
        boolean continueInput = true;
        do {
            try {
                result = console.nextInt();
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.print("Incorrect input, an integer is required: ");
                console.nextLine();
            }
        }
        while (continueInput);
        return result;
    }

    private static int positiveIntRead() {
        int number;
        boolean continueInput = true;
        do {
            System.out.print("Enter an size of array: ");
            number = readInt();
            if (number > 0) {
                continueInput = false;
            }
        } while (continueInput);

        return number;
    }

    private static String readString(){
        return console.next();
    }

    public static Train readSingle() throws IllegalArgumentException{
        int id;
        String destination;
        int year, month, day, hour, minute;
        String type;
        int seats;

        System.out.print("Enter an id: ");
        id = readInt();

        System.out.print("Enter a destination: ");
        destination = readString();

        System.out.print("Enter a year: ");
        year = readInt();

        System.out.print("Enter a month: ");
        month = readInt();

        System.out.print("Enter a day: ");
        day = readInt();

        System.out.print("Enter a hour: ");
        hour = readInt();

        System.out.print("Enter a minute: ");
        minute = readInt();

        System.out.print("Enter a type: ");
        type = readString();

        System.out.print("Enter a number of seats: ");
        seats = readInt();

        return new Train(id, destination, year, month, day, hour, minute, type, seats);
    }

    public static Train[] readArray() {
        int capacity = positiveIntRead();
        Train[] output = new Train[capacity];
        for (int id = 0; id < output.length; id++) {
            output[id] = readSingle();
            System.out.println();
        }
        return output;
    }
}
