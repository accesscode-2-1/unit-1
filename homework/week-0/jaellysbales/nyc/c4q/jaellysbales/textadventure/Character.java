package nyc.c4q.jaellysbales.textadventure;
/**
 * Access Code 2.1
 * Created by Jaellys Bales on 5/1/15.
 * Project: week-0
 */
public abstract class Character
{
    // Every character has...
    String charName;
    int    healthPoints;
    Weapon weapon;
    // inventory of items

    public String getCharName()
    {
        return charName;
    }

    public int getHealthPoints()
    {
        return healthPoints;
    }

    public Weapon getWeapon()
    {
        return weapon;
    }
}
