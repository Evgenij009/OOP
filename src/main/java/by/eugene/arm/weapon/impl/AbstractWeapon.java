package by.eugene.arm.weapon.impl;

import by.eugene.arm.characteristicWeapon.Quality;
import by.eugene.arm.weapon.Identifiable;

import java.io.Serializable;

public abstract class AbstractWeapon implements Identifiable, Serializable {

    private float weight;
    private int cost;
    private Quality quality;
    private long id;

    public AbstractWeapon(String name, float weight, int cost, Quality quality) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
        this.quality = quality;
    }
    public AbstractWeapon() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    private String name;

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public int getCost() {
        return cost;
    }

    public Quality getQuality() {
        return quality;
    }

    @Override
    public String toString() {
        return "AbstractWeapon{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", cost=" + cost +
                ", quality=" + quality +
                ", id=" + id +
                '}';
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractWeapon that = (AbstractWeapon) o;

        if (Float.compare(that.weight, weight) != 0) return false;
        if (cost != that.cost) return false;
        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return quality == that.quality;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (weight != +0.0f ? Float.floatToIntBits(weight) : 0);
        result = 31 * result + cost;
        result = 31 * result + (quality != null ? quality.hashCode() : 0);
        result = 31 * result + (int) (id ^ (id >>> 32));
        return result;
    }

}
