package by.eugene.arm.shell;

public class Bullet {
    private float lenght;
    private float thickness;
    private boolean isArmorPiercing;

    public Bullet(float lenght, float thickness, boolean isArmorPiercing) {
        this.lenght = lenght;
        this.thickness = thickness;
        this.isArmorPiercing = isArmorPiercing;
    }

    public Bullet() {
    }


    public float getLenght() {
        return lenght;
    }

    public void setLenght(float lenght) {
        this.lenght = lenght;
    }

    public float getThickness() {
        return thickness;
    }

    public void setThickness(float thickness) {
        this.thickness = thickness;
    }

    public boolean isArmorPiercing() {
        return isArmorPiercing;
    }

    public void setArmorPiercing(boolean armorPiercing) {
        isArmorPiercing = armorPiercing;
    }
    @Override
    public String toString() {
        return (isArmorPiercing ? "Armor-piercing" : "Typical") +
                " bullet with length = " + lenght + " and thickness = " + thickness;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bullet bullet = (Bullet) o;

        if (Float.compare(bullet.lenght, lenght) != 0) return false;
        if (Float.compare(bullet.thickness, thickness) != 0) return false;
        return isArmorPiercing == bullet.isArmorPiercing;
    }

    @Override
    public int hashCode() {
        int result = (lenght != +0.0f ? Float.floatToIntBits(lenght) : 0);
        result = 31 * result + (thickness != +0.0f ? Float.floatToIntBits(thickness) : 0);
        result = 31 * result + (isArmorPiercing ? 1 : 0);
        return result;
    }

}
