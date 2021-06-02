package by.eugene.arm.typeWeapon;

import by.eugene.arm.characteristicWeapon.FiringMode;
import by.eugene.arm.characteristicWeapon.Quality;
import by.eugene.arm.characteristicWeapon.WeaponAmmunition;
import by.eugene.arm.shell.Bullet;
import by.eugene.arm.typeWeapon.impl.AbstractRangedWeapon;

public abstract class AbstractFirearm extends AbstractRangedWeapon {

    private WeaponAmmunition<Bullet> bullets;
    private float calibre;
    public AbstractFirearm(String name, float weight, int cost, Quality quality,
                           float range, int capacity, FiringMode firingMode, float calibre) {
        super(name, weight, cost, quality, range, capacity, firingMode);
        this.calibre = calibre;
    }

    public AbstractFirearm() {
    }

    public WeaponAmmunition<Bullet> getBullets() {
        return bullets;
    }

    public void setBullets(WeaponAmmunition<Bullet> bullets) {
        this.bullets = bullets;
    }

    public float getCalibre() {
        return calibre;
    }

    public void setCalibre(float calibre) {
        this.calibre = calibre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        AbstractFirearm that = (AbstractFirearm) o;

        if (Float.compare(that.calibre, calibre) != 0) return false;
        return bullets != null ? bullets.equals(that.bullets) : that.bullets == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (bullets != null ? bullets.hashCode() : 0);
        result = 31 * result + (calibre != +0.0f ? Float.floatToIntBits(calibre) : 0);
        return result;
    }


    @Override
    public String toString() {
        return super.toString() + "Calibre = " + calibre + " | Bullets = " +
                (bullets == null ? "0" : bullets.size());
    }

}
