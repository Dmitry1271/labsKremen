package org.bsu.playroom.action;

import org.bsu.playroom.compare.ToyComparator;
import org.bsu.playroom.entity.Playroom;
import org.bsu.playroom.entity.Toy;
import org.bsu.playroom.exception.IncorrectValueException;

import java.util.*;

public class PlayroomAction {
    public static void sortToys(Playroom playroom) throws IncorrectValueException {
        List<Toy> toys = playroom.getToys();
        Collections.sort(toys, new ToyComparator());
        playroom.setToys(toys);
    }

    public static ArrayList<Toy> findByCreateYear(Playroom playroom, int minYear, int maxYear) {
        ArrayList<Toy> result = new ArrayList<>();
        for(Toy toy : playroom.getToys()) {
            if(toy.getCreateYear() >= minYear && toy.getCreateYear() <= maxYear) {
                result.add(toy);
            }
        }
        return result;
    }
}
