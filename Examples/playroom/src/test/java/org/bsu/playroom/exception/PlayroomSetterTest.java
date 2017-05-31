package org.bsu.playroom.exception;

import org.bsu.playroom.create.PlayroomCreator;
import org.bsu.playroom.entity.Playroom;
import org.bsu.playroom.entity.Size;
import org.bsu.playroom.entity.Toy;
import org.bsu.playroom.entity.doll.Clothes;
import org.bsu.playroom.entity.doll.Doll;
import org.bsu.playroom.entity.stuffedToy.Filler;
import org.bsu.playroom.entity.stuffedToy.StuffedToy;
import org.bsu.playroom.entity.weapon.Bullet;
import org.bsu.playroom.entity.weapon.Weapon;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

public class PlayroomSetterTest {
    @Test(expected = IncorrectValueException.class)
    public void playroomSetterTest() throws IncorrectValueException, BadDataException {
        ArrayList<Toy> toys = new ArrayList<>();
        toys.add(new Doll(0, "Vasya", Size.BIG, 2010, new BigDecimal("40"), Clothes.DRESS));
        toys.add(new Weapon(1, "qwer", Size.BIG, 0, new BigDecimal("30"), Bullet.BULLET));
        toys.add(new StuffedToy(2, "qwezxcv", Size.BIG, 0, new BigDecimal("20"), Filler.COTTON));

        Playroom playroom = PlayroomCreator.createPlayroom(toys);
        toys.add(new StuffedToy(6, "qwezxcv", Size.BIG, 0, new BigDecimal("20"), Filler.COTTON));
        playroom.setToys(toys);
    }
}
