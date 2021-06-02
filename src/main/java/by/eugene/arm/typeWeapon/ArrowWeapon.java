package by.eugene.arm.typeWeapon;

import by.eugene.arm.characteristicWeapon.FiringMode;
import by.eugene.arm.characteristicWeapon.Quality;
import by.eugene.arm.characteristicWeapon.WeaponAmmunition;
import by.eugene.arm.shell.Arrow;
import by.eugene.arm.typeWeapon.impl.AbstractRangedWeapon;

public class ArrowWeapon extends AbstractRangedWeapon {

    private WeaponAmmunition<Arrow> arrows;

    public ArrowWeapon(String name, float weight, int cost, Quality quality, float range, int capacity) {
        super(name, weight, cost, quality, range, capacity, FiringMode.SINGLE_SHOT);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ArrowWeapon that = (ArrowWeapon) o;

        return arrows != null ? arrows.equals(that.arrows) : that.arrows == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (arrows != null ? arrows.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ArrowWeapon{" + super.toString() +
                " Arrows = " +
                (arrows == null ? "0": arrows.size()) +
                '}';
    }

    @Override
    public String shoot() {
        String message;
        if (arrows != null && arrows.hasNext()) {
            message = String.format("Arrow Weapon = '%s' shoots with arrow = %s", getName(), arrows.next());
        } else {
            message = String.format("Arrow Weapon = '%s' trying to shoot but there is no arrow", getName());
        }
        return message;
    }
}
