package by.bsu.railway.train.entity;

import by.bsu.railway.train.validator.IdValidator;
import by.bsu.railway.train.validator.SeatsValidator;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by mrbro on 07-Apr-17.
 */
public class Train implements Comparable<Train>, Serializable, Cloneable{
    private int id;
    private String destination;
    private LocalDateTime departure;
    private TrainType type;
    private int seats;

    public Train(int id, String destination, int year, int month, int dayOfMonth, int hour, int minute, String type, int seats) {
        setId(id);
        this.destination = destination;
        setDeparture(year, month, dayOfMonth, hour, minute);
        this.type = TrainType.valueOf(type.toUpperCase());
        setSeats(seats);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (IdValidator.isValid(id)) {
            this.id = id;
        }
        else throw new IllegalArgumentException("Id is not valid!");
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDateTime getDeparture() {
        return departure;
    }

    public void setDeparture(int year, int month, int dayOfMonth, int hour, int minute) {
        this.departure = LocalDateTime.of(year, month, dayOfMonth, hour, minute);
    }

    public TrainType getType() {
        return type;
    }

    public void setType(TrainType type) {
        this.type = type;
        if (this.seats > this.type.getMaxseats()){
            this.seats = this.type.getMaxseats();
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (SeatsValidator.isValid(seats, this.type)) {
            this.seats = seats;
        }
        else throw new IllegalArgumentException("Number of available seats is not valid!");
    }

    @Override
    public int compareTo(Train o) {
        return this.id - o.getId();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Train copy = null;
        copy = (Train)super.clone();
        copy.departure = LocalDateTime.of(this.departure.getYear(), this.departure.getMonth(), this.departure.getDayOfMonth(), this.departure.getHour(), this.departure.getMinute());
        return copy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Train train = (Train) o;

        if (id != train.id) return false;
        if (seats != train.seats) return false;
        if (!destination.equals(train.destination)) return false;
        if (!departure.equals(train.departure)) return false;
        return type == train.type;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + destination.hashCode();
        result = 31 * result + departure.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + seats;
        return result;
    }

    @Override
    public String toString() {
        return "Train{" +
                "id=" + id +
                ", destination='" + destination + '\'' +
                ", departure=" + departure +
                ", type=" + type +
                ", seats=" + seats +
                '}';
    }
}
