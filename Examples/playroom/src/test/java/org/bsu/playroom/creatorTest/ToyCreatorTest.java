package org.bsu.playroom.creatorTest;

import org.bsu.playroom.create.ToyCreator;
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

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;

public class ToyCreatorTest {
    @Test
    public void readToysFromFilesTest() throws IncorrectValueException {
        ArrayList<Toy> expected = new ArrayList<>();
        expected.add(new Doll(0, "Vasya", Size.BIG, 2010, new BigDecimal("4"), Clothes.DRESS));
        expected.add(new Weapon(1, "qwer", Size.BIG, 0, new BigDecimal("3"), Bullet.BULLET));
        expected.add(new StuffedToy(2, "qwezxcv", Size.BIG, 0, new BigDecimal("2"), Filler.COTTON));

        ArrayList<Toy> actual = ToyCreator.getToysFromFile(new File("toys.txt"));

        Assert.assertEquals(expected, actual);
    }
}
