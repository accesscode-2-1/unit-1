package com.company;

/**
 * Created by c4q-george on 4/29/15.
 */
public class Spear extends Weapon {

    public Spear(int damagePoints) {
        super(damagePoints);
    }

    @Override
    public void attack(Character victim) {
        System.out.println(victim.getUsername()+" got Speared");
        int currentHP = victim.getHP();
        victim.setHP(currentHP-damagePoints);
        System.out.println(victim.getUsername() + " HP:" + victim.getHP());
    }
}
