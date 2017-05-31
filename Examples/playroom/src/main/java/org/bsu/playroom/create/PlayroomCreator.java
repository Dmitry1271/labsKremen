package org.bsu.playroom.create;

import org.bsu.playroom.entity.Playroom;
import org.bsu.playroom.entity.Toy;
import org.bsu.playroom.exception.BadDataException;

import java.math.BigDecimal;
import java.util.ArrayList;

public class PlayroomCreator {
    public static Playroom createPlayroom(ArrayList<Toy> toys) {
        Playroom playroom = new Playroom(new ArrayList<>(), new BigDecimal("0"));
        for(Toy toy : toys) {
            playroom.addToy(toy);
        }
        return playroom;
    }

    public static Playroom createPlayroom(ArrayList<Toy> toys, BigDecimal maxCost) throws BadDataException {
        Playroom playroom = new Playroom(new ArrayList<>(), new BigDecimal("0"));
        for(Toy toy : toys) {
            if(playroom.getTotalCost().add(toy.getPrice()).compareTo(maxCost) == -1) {
                playroom.addToy(toy);
            }
            else {
                throw new BadDataException("Price of the toys is higher then max cost");
            }
        }
        return playroom;
    }
}
