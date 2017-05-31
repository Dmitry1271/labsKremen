package by.dudko.electricalappliances.create;

import by.dudko.electricalappliances.entity.ElectricalAppliance;
import by.dudko.electricalappliances.exception.BadDataException;
import by.dudko.electricalappliances.read.ElectricalApplianceReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.ArrayList;

public class ElectricalApplianceCreator {
    private static final Logger Logger = LogManager.getLogger(ElectricalAppliance.class);

    public static ArrayList<ElectricalAppliance> getElectricalApplianceFromFile(File file) {
        ArrayList<ElectricalAppliance> electricalAppliances = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                ElectricalAppliance electricalAppliance = ElectricalApplianceReader.readElectricalAppliance(line);
                if (electricalAppliance != null) {
                    electricalAppliances.add(electricalAppliance);
                }
            }
        } catch (BadDataException | IOException e) {
            Logger.error(e.getMessage());
        }
        return electricalAppliances;
    }
}
