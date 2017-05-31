package by.dudko.computerwork.entity;

import by.dudko.computerwork.exception.IncorrectValueException;
import by.dudko.computerwork.valid.RandomAccessMemoryValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Computer {
    private static final Logger Logger = LogManager.getLogger(Computer.class);
    private int id;
    private ComputerType computerType;
    private Hardware hardware;

    public Computer() {
    }

    public Computer(int id, String type, String processor, String operatingSystem, int randomAccessMemory) {
        this.id = id;
        this.computerType = ComputerType.valueOf(type.toUpperCase());
        obtainHardware(processor, operatingSystem, randomAccessMemory);
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

        private void setRandomAccessMemory(int randomAccessMemory) {
            if (RandomAccessMemoryValidator.isValidRandomAccessMemory(randomAccessMemory)) {
                this.randomAccessMemory = randomAccessMemory;
            } else Logger.error(new IncorrectValueException("Incorrect RAM of computer"));
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHardware() {
        return hardware.toString();
    }

    public ComputerType getComputerType() {
        return computerType;
    }

    public void setComputerType(ComputerType computerType) {
        this.computerType = computerType;
    }

    public void obtainHardware(String processor, String operatingSystem, int randomAccessMemory) {
        hardware = new Hardware();
        hardware.setOperatingSystem(operatingSystem);
        hardware.setProcessor(processor);
        hardware.setRandomAccessMemory(randomAccessMemory);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", computerType=" + computerType +
                ", hardware=" + hardware +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Computer computer = (Computer) o;

        if (id != computer.id) return false;
        if (computerType != computer.computerType) return false;
        return hardware != null ? hardware.equals(computer.hardware) : computer.hardware == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (computerType != null ? computerType.hashCode() : 0);
        result = 31 * result + (hardware != null ? hardware.hashCode() : 0);
        return result;
    }
}

