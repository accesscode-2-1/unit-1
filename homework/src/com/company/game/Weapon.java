package com.company;

/**
 * Created by c4q-george on 4/29/15.
 */
public abstract class Weapon {

    protected int damagePoints;

    public Weapon(int damagePoints) {
        this.damagePoints=damagePoints;
    }
    public abstract void attack(Character victim);
}
