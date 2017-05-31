package org.bsu.playroom.entity.doll;

import org.bsu.playroom.entity.Size;
import org.bsu.playroom.entity.Toy;
import org.bsu.playroom.exception.IncorrectValueException;

import java.math.BigDecimal;
import java.time.Year;

public class Doll extends Toy {
    private Clothes clothes;

    public Doll() {

    }

    public Doll(long id, String name, Size size, int createYear, BigDecimal price, Clothes clothes) throws IncorrectValueException {
        super(id, name, size, createYear, price);
        this.clothes = clothes;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    @Override
    public String toString() {
        return "Doll{" +
                "clothes=" + clothes +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Doll doll = (Doll) o;

        return clothes == doll.clothes;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (clothes != null ? clothes.hashCode() : 0);
        return result;
    }
}
