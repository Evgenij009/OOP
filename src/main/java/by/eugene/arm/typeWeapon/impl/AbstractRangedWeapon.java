package by.eugene.arm.typeWeapon.impl;

import by.eugene.arm.characteristicWeapon.FiringMode;
import by.eugene.arm.characteristicWeapon.Quality;
import by.eugene.arm.typeWeapon.Shootable;
import by.eugene.arm.weapon.impl.AbstractWeapon;

public abstract class AbstractRangedWeapon extends AbstractWeapon implements Shootable {

    private float range;
    private int capacity;
    private FiringMode firingMode;

    public AbstractRangedWeapon(String name, float weight, int cost, Quality quality, float range, int capacity, FiringMode firingMode) {
        super(name, weight, cost, quality);
        this.range = range;
        this.capacity = capacity;
        this.firingMode = firingMode;
    }

    public AbstractRangedWeapon() {
    }

    public float getRange() {
        return range;
    }

    public void setRange(float range) {
        this.range = range;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public FiringMode getFiringMode() {
        return firingMode;
    }

    public void setFiringMode(FiringMode firingMode) {
        this.firingMode = firingMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        AbstractRangedWeapon that = (AbstractRangedWeapon) o;

        if (Float.compare(that.range, range) != 0) return false;
        if (capacity != that.capacity) return false;
        return firingMode == that.firingMode;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (range != +0.0f ? Float.floatToIntBits(range) : 0);
        result = 31 * result + capacity;
        result = 31 * result + (firingMode != null ? firingMode.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + "Firing mode = " + firingMode +
                " | Range = " + range +
                " | Capacity = " + capacity + " | ";
    }
}
