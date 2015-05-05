package nyc.c4q.lukesterlee.interfaces;

import nyc.c4q.lukesterlee.characters.*;
import nyc.c4q.lukesterlee.characters.Character;

/**
 * Created by Luke Lee on 5/5/2015.
 */
public interface Fightable<T extends Character> {
    boolean attack(T enemy);
    boolean paralyzed(T enemy);
}
