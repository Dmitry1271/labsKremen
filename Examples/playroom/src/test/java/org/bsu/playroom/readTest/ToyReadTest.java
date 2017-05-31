package org.bsu.playroom.readTest;

import org.bsu.playroom.entity.Size;
import org.bsu.playroom.entity.Toy;
import org.bsu.playroom.entity.doll.Clothes;
import org.bsu.playroom.entity.doll.Doll;
import org.bsu.playroom.entity.weapon.Bullet;
import org.bsu.playroom.entity.weapon.Weapon;
import org.bsu.playroom.exception.BadDataException;
import org.bsu.playroom.exception.IncorrectValueException;
import org.bsu.playroom.read.ToyReader;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class ToyReadTest {
    @Test
    public void readToyTest() throws IncorrectValueException, BadDataException {
        Toy expected = new Doll(0, "Vasya", Size.BIG, 2010, new BigDecimal("4"), Clothes.DRESS);
        Toy actual = ToyReader.readToy("{\"id\":0,\"name\":\"Vasya\",\"size\":\"BIG\",\"createYear\":2010,\"price\":4,\"clothes\":\"DRESS\"}");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void readWeaponFailedTest() throws IncorrectValueException, BadDataException {
        Toy expected = new Weapon(0, "Vasya", Size.BIG, 2010, new BigDecimal("4"), Bullet.BULLET);
        Toy actual = ToyReader.readToy("{\"id\":0,\"name\":\"Vasya\",\"size\":\"BIG\",\"createYear\":2010,\"price\":4,\"filler\":\"PLUSH\"}");
        Assert.assertNotEquals(expected, actual);
    }
}
