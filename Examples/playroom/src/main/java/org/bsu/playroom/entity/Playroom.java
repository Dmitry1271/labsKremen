package org.bsu.playroom.entity;

import org.bsu.playroom.exception.IncorrectValueException;

import java.math.BigDecimal;
import java.util.List;

public class Playroom {
    private List<Toy> toys;
    private BigDecimal totalCost;

    public Playroom() {

    }

    public Playroom(List<Toy> toys, BigDecimal totalCost) {
        this.toys = toys;
        this.totalCost = totalCost;
    }

    public List<Toy> getToys() {
        return toys;
    }

    public void setToys(List<Toy> toysOne) throws IncorrectValueException {
        if(this.toys.containsAll(toysOne) && toysOne.containsAll(this.toys)) {
            this.toys = toysOne;
        } else {
            throw new IncorrectValueException("You cant change toys in the room");
        }
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void addToy(Toy toy) {
        toys.add(toy);
        totalCost = totalCost.add(toy.getPrice());
    }

    @Override
    public String toString() {
        return "Playroom{" +
                "toys=" + toys +
                ", totalCost=" + totalCost +
                '}';
    }
}
