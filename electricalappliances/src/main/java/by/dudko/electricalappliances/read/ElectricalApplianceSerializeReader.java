package by.dudko.electricalappliances.read;

import by.dudko.electricalappliances.entity.ElectricalAppliance;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

import java.io.*;

/**
 * Created by cplus on 26.05.2017.
 */
public class ElectricalApplianceSerializeReader {
    private static final Logger Logger = LogManager.getLogger(ElectricalApplianceSerializeReader.class);

    public static boolean serialize(ElectricalAppliance electricalAppliance, String path) {
        boolean result = false;
        ObjectOutputStream out = null;
        try {
            FileOutputStream fileOut = new FileOutputStream(path);
            out = new ObjectOutputStream(fileOut);
            out.writeObject(electricalAppliance);
            out.close();
            fileOut.close();
            Logger.info("Serialized data is saved in " + path);
            result = true;
        } catch (FileNotFoundException e) {
            Logger.error("File for serialization doesn't found!");
        } catch (IOException e) {
            Logger.error(e.getStackTrace());
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    Logger.error(e.getStackTrace());
                }
            }
        }
        return result;
    }

    public static ElectricalAppliance deserialize(String path) {
        ElectricalAppliance electricalAppliance = null;
        ObjectInputStream in = null;
        FileInputStream fileIn = null;
        try {
            fileIn = new FileInputStream(path);
            in = new ObjectInputStream(fileIn);
            electricalAppliance = (ElectricalAppliance) in.readObject();
            in.close();
            fileIn.close();
        } catch (FileNotFoundException e) {
            Logger.error("File for deserialization doesn't found");
        } catch (IOException e) {
            Logger.error(e.getStackTrace());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    Logger.error(e.getStackTrace());
                }
            }
        }
        return electricalAppliance;
    }


}
