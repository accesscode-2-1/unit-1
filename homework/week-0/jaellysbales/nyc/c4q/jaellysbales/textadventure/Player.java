package nyc.c4q.jaellysbales.textadventure;
/**
 * Access Code 2.1
 * Created by Jaellys Bales on 5/1/15.
 * Project: week-0
 */
public class Player extends Character
{
    public void setCharName(String name)
    {
        this.charName = name;
    }

    public void setHealthPoints(int hp)
    {
        this.healthPoints = hp;
    }

    public void setWeapon(Weapon w)
    {
        // Unlike killer, player initializes with no weapon. Must handle.
        this.weapon = w;
    }
}
