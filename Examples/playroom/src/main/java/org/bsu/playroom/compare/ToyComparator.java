package org.bsu.playroom.compare;

import org.bsu.playroom.entity.Toy;

import java.util.Comparator;

public class ToyComparator implements Comparator<Toy> {
    @Override
    public int compare(Toy one, Toy two) {
        return one.getPrice().compareTo(two.getPrice());
    }
}
