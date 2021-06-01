package by.eugene.typeWeapon.impl;

import by.eugene.characteristicWeapon.FiringMode;
import by.eugene.typeWeapon.Shootable;
import by.eugene.weapon.impl.AbstractWeapon;

public class AbstractRangedWeapon extends AbstractWeapon implements Shootable {
    private float range;
    private int capacity;
    private FiringMode firingMode;
}
