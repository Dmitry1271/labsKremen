package org.bsu.playroom.entity.weapon;

import org.bsu.playroom.entity.Size;
import org.bsu.playroom.entity.Toy;
import org.bsu.playroom.exception.IncorrectValueException;

import java.math.BigDecimal;

public class Weapon extends Toy {
    private Bullet bullet;

    public Weapon() {

    }

    public Weapon(long id, String name, Size size, int createYear, BigDecimal price, Bullet bullet) throws IncorrectValueException {
        super(id, name, size, createYear, price);
        this.bullet = bullet;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "bullet=" + bullet +
                "} " + super.toString();
    }
}
