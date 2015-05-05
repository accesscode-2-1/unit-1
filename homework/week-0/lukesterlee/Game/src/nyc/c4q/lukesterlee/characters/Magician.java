package nyc.c4q.lukesterlee.characters;

import nyc.c4q.lukesterlee.interfaces.Fightable;
import nyc.c4q.lukesterlee.interfaces.Protectable;

import java.lang.*;

/**
 * Created by Luke Lee on 5/5/2015.
 */
public class Magician extends Character implements Fightable<Villain>, Protectable {


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
