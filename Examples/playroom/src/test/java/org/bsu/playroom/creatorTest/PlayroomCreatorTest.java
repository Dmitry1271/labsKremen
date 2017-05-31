package org.bsu.playroom.creatorTest;

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
import org.bsu.playroom.exception.IncorrectValueException;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

public class PlayroomCreatorTest {
    @Test
    public void createPlayroomTest()  throws IncorrectValueException {
        ArrayList<Toy> toys = new ArrayList<>();
        toys.add(new Doll(0, "Vasya", Size.BIG, 2010, new BigDecimal("4"), Clothes.DRESS));
        toys.add(new Weapon(1, "qwer", Size.BIG, 0, new BigDecimal("3"), Bullet.BULLET));
        toys.add(new StuffedToy(2, "qwezxcv", Size.BIG, 0, new BigDecimal("2"), Filler.COTTON));

        Playroom playroom = PlayroomCreator.createPlayroom(toys);

        Assert.assertEquals(toys, playroom.getToys());
    }
}
