package nyc.c4q.lukesterlee.characters;

import nyc.c4q.lukesterlee.interfaces.Curable;
import nyc.c4q.lukesterlee.interfaces.Fightable;
import nyc.c4q.lukesterlee.interfaces.Protectable;

import java.lang.*;

/**
 * Created by Luke Lee on 5/5/2015.
 */
public class Hero extends Character implements Protectable, Fightable<Villain>, Curable {



    @Override
    public int heal() {
        return 0;
    }

    @Override
    public int cure() {
        return 0;
    }


    @Override
    public boolean attack(Villain enemy) {
        return false;
    }

    @Override
    public boolean paralyzed(Villain enemy) {
        return false;
    }

    @Override
    public boolean protect() {
        return false;
    }
}
