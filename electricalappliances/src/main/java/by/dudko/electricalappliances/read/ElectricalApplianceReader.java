package by.dudko.electricalappliances.read;

import by.dudko.electricalappliances.entity.ElectricalAppliance;
import by.dudko.electricalappliances.entity.electrickettle.ElectricKettle;
import by.dudko.electricalappliances.entity.fridge.Fridge;
import by.dudko.electricalappliances.entity.hoover.Hoover;
import by.dudko.electricalappliances.entity.iron.Iron;
import by.dudko.electricalappliances.entity.hairdryer.Hairdryer;
import by.dudko.electricalappliances.exception.BadDataException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by cplus on 26.05.2017.
 */
public class ElectricalApplianceReader {
    public static ElectricKettle readElectricKettle(String string) {
        try {
            return new ObjectMapper().readValue(string, ElectricKettle.class);
        } catch (IOException e) {
            return null;
        }
    }

    public static Fridge readFridge(String string) {
        try {
            return new ObjectMapper().readValue(string, Fridge.class);
        } catch (IOException e) {
            return null;
        }
    }

    public static Hoover readHoover(String string) {
        try {
            return new ObjectMapper().readValue(string, Hoover.class);
        } catch (IOException e) {
            return null;
        }
    }

    public static Iron readIron(String string) {
        try {
            return new ObjectMapper().readValue(string, Iron.class);
        } catch (IOException e) {
            return null;
        }
    }

    public static Hairdryer readHairdryer(String string) {
        try {
            return new ObjectMapper().readValue(string, Hairdryer.class);
        } catch (IOException e) {
            return null;
        }
    }

    public static ElectricalAppliance readElectricalAppliance(String string) throws BadDataException {
        boolean typeFound = false;
        ElectricalAppliance result = null;
        try {
            for (Method method : ElectricalApplianceReader.class.getDeclaredMethods()) {
                if (!method.getName().equals("readElectricalAppliance") && method.invoke(ElectricalApplianceReader.class, string) != null) {
                    result = (ElectricalAppliance) method.invoke(ElectricalApplianceReader.class, string);
                    typeFound = true;
                    break;
                }
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        if (!typeFound) {
            throw new BadDataException("Can't found type of the string");
        }
        return result;
    }
}
