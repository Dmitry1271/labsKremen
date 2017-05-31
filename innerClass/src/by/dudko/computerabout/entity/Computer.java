package by.dudko.computerabout.entity;

import by.dudko.computerabout.exception.IncorrectValueException;
import by.dudko.computerabout.valid.RandomAccessMemoryValid;

import java.util.logging.LogManager;

/**
 * Created by cplus on 27.05.2017.
 */
public class Computer {
    private static final Logger Logger = LogManager.getLogger();
    private Type type;
    private Hardware hardware;

    public Computer(Type type, String processor, String operatingSystem, int randomAccessMemory) throws IncorrectValueException {
        this.type = type;
        obtainHardware(processor,operatingSystem,randomAccessMemory);
    }

    private class Hardware {
        private String processor;
        private String operatingSystem;
        private int randomAccessMemory;

        private void setProcessor(String processor) {
            this.processor = processor;
        }

        private void setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
        }

        private void setRandomAccessMemory(int randomAccessMemory) throws IncorrectValueException {
            if (RandomAccessMemoryValid.isValidRandomAccessMemory(randomAccessMemory)) {
                this.randomAccessMemory = randomAccessMemory;
            }
            else throw new IncorrectValueException("Incorrect RAM of computer");
        }

        @Override
        public String toString() {
            return "Hardware{" +
                    "processor='" + processor + '\'' +
                    ", operatingSystem='" + operatingSystem + '\'' +
                    ", randomAccessMemory=" + randomAccessMemory +
                    '}';
        }
    }

    public String getHardware() {
        return hardware.toString();
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void obtainHardware(String processor, String operatingSystem, int randomAccessMemory) throws IncorrectValueException {
        hardware = new Hardware();
        hardware.setOperatingSystem(operatingSystem);
        hardware.setProcessor(processor);
        hardware.setRandomAccessMemory(randomAccessMemory);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "type=" + type +
                ", hardware=" + hardware +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Computer computer = (Computer) o;

        if (type != computer.type) return false;
        return hardware != null ? hardware.equals(computer.hardware) : computer.hardware == null;
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (hardware != null ? hardware.hashCode() : 0);
        return result;
    }
}
