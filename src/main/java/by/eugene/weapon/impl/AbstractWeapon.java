package by.eugene.weapon.impl;

import by.eugene.characteristicWeapon.Quality;
import by.eugene.weapon.Identifiable;

public abstract class AbstractWeapon implements Identifiable {
    private String name;
    private float weight;
    private int cost;
    private Quality quality;
    private long id;
}
