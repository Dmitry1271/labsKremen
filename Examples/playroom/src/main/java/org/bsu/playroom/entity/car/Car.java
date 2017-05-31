package org.bsu.playroom.entity.car;

import org.bsu.playroom.entity.Size;
import org.bsu.playroom.entity.Toy;
import org.bsu.playroom.exception.IncorrectValueException;

import java.math.BigDecimal;
import java.time.Year;

public class Car extends Toy {
    private Color color;

    public Car() {

    }

    public Car(long id, String name, Size size, int createYear, BigDecimal price, Color color) throws IncorrectValueException {
        super(id, name, size, createYear, price);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Car car = (Car) o;

        return color == car.color;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
