package org.bsu.playroom.entity.cube;

import org.bsu.playroom.entity.Size;
import org.bsu.playroom.entity.Toy;
import org.bsu.playroom.exception.IncorrectValueException;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.time.Year;

public class Cube extends Toy {
    private char letter;

    public Cube() {

    }

    public Cube(long id, String name, Size size, int createYear, BigDecimal price, char letter) throws IncorrectValueException {
        super(id, name, size, createYear, price);
        this.letter = letter;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "letter=" + letter +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cube cube = (Cube) o;

        return letter == cube.letter;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (int) letter;
        return result;
    }
}
