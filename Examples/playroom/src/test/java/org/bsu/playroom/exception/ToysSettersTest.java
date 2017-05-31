package org.bsu.playroom.exception;

import org.bsu.playroom.entity.Size;
import org.bsu.playroom.entity.Toy;
import org.bsu.playroom.entity.weapon.Bullet;
import org.bsu.playroom.entity.weapon.Weapon;
import org.junit.Test;

import java.math.BigDecimal;

public class ToysSettersTest {
    @Test(expected = IncorrectValueException.class)
    public void yearSetterTest() throws IncorrectValueException {
        Toy toy = new Weapon(0, "Vasya", Size.BIG, 2010, new BigDecimal("4"), Bullet.BULLET);
        toy.setCreateYear(2018);
    }

    @Test(expected = IncorrectValueException.class)
    public void yearConstuctorTest() throws IncorrectValueException {
        Toy toy = new Weapon(0, "Vasya", Size.BIG, 2018, new BigDecimal("4"), Bullet.BULLET);
    }

    @Test(expected = IncorrectValueException.class)
    public void createYearValidatorConstuctorTest() throws IncorrectValueException {
        Toy toy = new Weapon(0, "Vasya", Size.BIG, 2014, new BigDecimal("-1"), Bullet.BULLET);
    }

    @Test(expected = IncorrectValueException.class)
    public void createYearValidatorSetterTest() throws IncorrectValueException {
        Toy toy = new Weapon(0, "Vasya", Size.BIG, 2014, new BigDecimal("1"), Bullet.BULLET);
        toy.setPrice(new BigDecimal("-1"));
    }
}
