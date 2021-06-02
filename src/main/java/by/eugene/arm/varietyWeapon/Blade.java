package by.eugene.arm.varietyWeapon;

import by.eugene.arm.characteristicWeapon.Quality;
import by.eugene.arm.typeWeapon.impl.AbstractMeleeWeapon;

public class Blade extends AbstractMeleeWeapon {
    private float sharpness;

    public Blade(String name, float weight, int cost, Quality quality,
                 boolean isOneHanded, float length, float sharpness) {
        super(name, weight, cost, quality, isOneHanded, length);
        this.sharpness = sharpness;
    }

    public Blade() {
    }

    public float getSharpness() {
        return sharpness;
    }

    public void setSharpness(float sharpness) {
        this.sharpness = sharpness;
    }

    @Override
    public String hit() {
        return String.format("Blade='%s' with length=%.2f and sharpness=%.2f hits!",
                getName(), getLength(), sharpness);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Blade blade = (Blade) o;

        return Float.compare(blade.sharpness, sharpness) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (sharpness != +0.0f ? Float.floatToIntBits(sharpness) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BLADE { " + super.toString() +
                "Sharpness=" + sharpness +" }";
    }
}