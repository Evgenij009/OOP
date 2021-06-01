package by.eugene.typeWeapon.impl;

import by.eugene.typeWeapon.Hitttable;
import by.eugene.weapon.impl.AbstractWeapon;

public abstract class AbstractMeleeWeapon extends AbstractWeapon implements Hitttable {
    private boolean isOneHanded;
    private float length;
}
