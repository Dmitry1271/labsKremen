package org.bsu.playroom.read;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.bsu.playroom.entity.Toy;
import org.bsu.playroom.entity.car.Car;
import org.bsu.playroom.entity.cube.Cube;
import org.bsu.playroom.entity.doll.Doll;
import org.bsu.playroom.entity.stuffedToy.StuffedToy;
import org.bsu.playroom.entity.weapon.Weapon;
import org.bsu.playroom.exception.BadDataException;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ToyReader {
    public static Doll readDoll(String string) {
        try {
            return new ObjectMapper().readValue(string, Doll.class);
        } catch (IOException e) {
            return null;
        }
    }

    public static Weapon readWeapon(String string) {
        try {
            return new ObjectMapper().readValue(string, Weapon.class);
        } catch (IOException e) {
            return null;
        }
    }

    public static StuffedToy readStuffedToy(String string) {
        try {
            return new ObjectMapper().readValue(string, StuffedToy.class);
        } catch (IOException e) {
            return null;
        }
    }

    public static Cube readCube(String string) {
        try {
            return new ObjectMapper().readValue(string, Cube.class);
        } catch (IOException e) {
            return null;
        }
    }

    public static Car readCar(String string) {
        try {
            return new ObjectMapper().readValue(string, Car.class);
        } catch (IOException e) {
            return null;
        }
    }

    public static Toy readToy(String string) throws BadDataException {
        boolean typeFound = false;
        Toy result = null;
        try {
            for (Method method : ToyReader.class.getDeclaredMethods()) {
                if (!method.getName().equals("readToy") && method.invoke(ToyReader.class, string) != null) {
                    result = (Toy)method.invoke(ToyReader.class, string);
                    typeFound = true;
                    break;
                }
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        if(!typeFound) {
            throw new BadDataException("Cant find type of the string");
        }
        return result;
    }
}
