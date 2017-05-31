package org.bsu.playroom.entity;

import org.bsu.playroom.exception.IncorrectValueException;
import org.bsu.playroom.valid.ToyValidator;

import java.io.Serializable;
import java.lang.invoke.SerializedLambda;
import java.math.BigDecimal;

public abstract class Toy implements Serializable {
    private long id;
    private String name;
    private Size size;
    private int createYear;
    private BigDecimal price;

    public Toy() {

    }

    public Toy(long id, String name, Size size, int createYear, BigDecimal price) throws IncorrectValueException {
        this.id = id;
        this.name = name;
        this.size = size;
        setCreateYear(createYear);
        setPrice(price);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getCreateYear() {
        return createYear;
    }

    public void setCreateYear(int createYear) throws IncorrectValueException {
        if(ToyValidator.validateYear(createYear)) {
            this.createYear = createYear;
        } else {
            throw new IncorrectValueException("Incorrect year");
        }
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) throws IncorrectValueException {
        if(ToyValidator.validatePrice(price)) {
            this.price = price;
        } else {
            throw new IncorrectValueException("Incorrect price");
        }
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", createYear=" + createYear +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Toy toy = (Toy) o;

        if (id != toy.id) return false;
        if (createYear != toy.createYear) return false;
        if (name != null ? !name.equals(toy.name) : toy.name != null) return false;
        if (size != toy.size) return false;
        return price != null ? price.equals(toy.price) : toy.price == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + createYear;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}
