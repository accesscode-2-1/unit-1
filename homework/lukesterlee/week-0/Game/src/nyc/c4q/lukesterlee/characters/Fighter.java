package nyc.c4q.lukesterlee.characters;

import nyc.c4q.lukesterlee.interfaces.Fightable;
import nyc.c4q.lukesterlee.interfaces.Protectable;
import nyc.c4q.lukesterlee.weapons.GoldenFist;
import nyc.c4q.lukesterlee.weapons.Shield;
import nyc.c4q.lukesterlee.weapons.Weapon;

import java.lang.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Luke Lee on 5/5/2015.
 */
public class Fighter extends Character implements Fightable<Villain>, Protectable {

    ArrayList<Weapon> gears;

    public Fighter(String name) {
        super.setName(name);
        gears = new ArrayList<Weapon>();

        GoldenFist goldenFist = new GoldenFist();
        Shield shield = new Shield();

        gears.add(goldenFist);
        gears.add(shield);
    }



    @Override
    public boolean attack(Villain enemy) {
        int number = getRandom();

        if (number > 0 && number <= 30+getLevel()) {
            enemy.decreaseHp(20);
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean paralyzed(Villain enemy) {
        return false;
    }

    @Override
    public boolean protect() {
        int number = getRandom();

        if (number > 0 && number <= 30+getLevel()) {
            return true;
        }
        else {
            this.decreaseHp(20);
            System.out.println("Protect failed. 20 HP lost. " + "Your HP is now " + this.getCurrentHp());
            return false;
        }


    }
}
