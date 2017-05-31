package by.dudko.electricalappliances.entity;

import by.dudko.electricalappliances.exception.IncorrectValueException;
import by.dudko.electricalappliances.valid.ElectricalApplianceValidator;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by cplus on 20.05.2017.
 */
public abstract class ElectricalAppliance implements Serializable{
    private long id;
    private String name;
    private int power;
    private BigDecimal price;
    private int createYear;
    private boolean plugged;

    public ElectricalAppliance() {
    }

    public ElectricalAppliance(long id, String name, int power, BigDecimal price, int createYear, boolean plugged) throws IncorrectValueException {
        this.id = id;
        this.name = name;
        setPower(power);
        setPrice(price);
        setCreateYear(createYear);
        this.plugged = plugged;
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

    public int getPower() {
        return power;
    }

    public void setPower(int power) throws IncorrectValueException {
        if(ElectricalApplianceValidator.isValidPower(power)){
            this.power = power;
        }
        else {
            throw new IncorrectValueException("Invalid power!");
        }
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) throws IncorrectValueException {
        if(ElectricalApplianceValidator.isVlidPrice(price)) {
            this.price = price;
        }
        else {
            throw new IncorrectValueException("Invalid price!");
        }
    }

    public int getCreateYear() {
        return createYear;
    }

    public void setCreateYear(int createYear) throws IncorrectValueException {
        if(ElectricalApplianceValidator.isValidYear(createYear)) {
            this.createYear = createYear;
        }
        else {
            throw new IncorrectValueException("Invalid year of creation!");
        }
    }

    public boolean isPlugged() {
        return plugged;
    }

    public void setPlugged(boolean plugged) {
        this.plugged = plugged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElectricalAppliance that = (ElectricalAppliance) o;

        if (id != that.id) return false;
        if (power != that.power) return false;
        if (createYear != that.createYear) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return price != null ? price.equals(that.price) : that.price == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + power;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + createYear;
        return result;
    }

    @Override
    public String toString() {
        return "ElectricalAppliance{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", power=" + power +
                ", price=" + price +
                ", createYear=" + createYear +
                '}';
    }
}
