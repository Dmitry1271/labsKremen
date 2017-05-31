package org.bsu.playroom.entity.stuffedToy;

import org.bsu.playroom.entity.Size;
import org.bsu.playroom.entity.Toy;
import org.bsu.playroom.exception.IncorrectValueException;

import java.math.BigDecimal;

public class StuffedToy extends Toy {
    private Filler filler;

    public StuffedToy() {

    }

    public StuffedToy(long id, String name, Size size, int createYear, BigDecimal price, Filler filler) throws IncorrectValueException {
        super(id, name, size, createYear, price);
        this.filler = filler;
    }

    public Filler getFiller() {
        return filler;
    }

    public void setFiller(Filler filler) {
        this.filler = filler;
    }

    @Override
    public String toString() {
        return "StuffedToy{" +
                "filler=" + filler +
                "} " + super.toString();
    }
}
