package com.company;

/**
 * Created by c4q-george on 4/29/15.
 */
public class FullAutoGun extends Gun {

    public FullAutoGun(int damagePoints, int numBullets) {
        super(damagePoints, numBullets);
    }

    @Override
    public void attack(Character victim) {
        while(numBullets>0) {
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
        if(numBullets<=0){
            System.out.println("You ran out of bullets");
        }
    }


}
