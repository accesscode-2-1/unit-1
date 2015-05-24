package nyc.c4q.jaellysbales;
/**
 * Access Code 2.1
 * Created by Jaellys Bales on 5/4/15.
 * Project: textadv
 */
public abstract class Character
{
    // Every character has...
    String charName;
    int    healthPoints;
    Weapon weapon;
    private Room room;
    // inventory of items

    public Character(String charName, int healthPoints, Weapon weapon, Room room)
    {
        this.charName = charName;
        this.healthPoints = healthPoints;
        this.weapon = weapon;
        this.room = room;
    }

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

    public void calcDamage(int damagePoints)
    {
        healthPoints -= damagePoints;
    }

    public void setRoom(Room room)
    {
        this.room = room;
    }

    public Room getRoom()
    {
        return room;
    }
}
