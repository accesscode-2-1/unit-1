package com.company;

import java.lang.*;

/**
 * Created by c4q-george on 4/29/15.
 */
public abstract class Gun extends Weapon {

    protected int numBullets;
    protected int magazineSize;

    public Gun(int damagePoints,int numBullets) {
        super(damagePoints);
        this.numBullets=numBullets;
        this.magazineSize=numBullets;
    }

    public void reloadWeapon() {
        System.out.println("You're reloading...");
        this.numBullets=magazineSize;
        System.out.println("LOCKED AND LOADED!!!");
    }

}
