package com.company;

/**
 * Created by c4q-george on 4/29/15.
 */
public class SemiAutoGun extends Gun {

    public SemiAutoGun(int damagePoints, int numBullets) {
        super(damagePoints, numBullets);
    }

    @Override
    public void attack(Character victim) {
        if(numBullets>0) {
            System.out.println("You shot "+victim.getUsername());
            int currentHP = victim.getHP();
            victim.setHP(currentHP - damagePoints);
            numBullets--;
            System.out.println(victim.getUsername() + " HP:" + victim.getHP());
            if(victim.getHP()<=0){
                System.out.println(victim.getUsername() + " is dead.");
                return;
            }
        }
        else{
            System.out.println("You ran out of bullets");
        }
    }

}
