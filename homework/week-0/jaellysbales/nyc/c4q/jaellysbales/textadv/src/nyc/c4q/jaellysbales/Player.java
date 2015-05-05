package nyc.c4q.jaellysbales;
/**
 * Access Code 2.1
 * Created by Jaellys Bales on 5/4/15.
 * Project: textadv
 */
public class Player extends Character implements Defender
{
    public Player(String charName, int healthPoints, Weapon weapon, Room room)
    {
        super(charName, healthPoints, weapon, room);
    }

    @Override
    public int calcShieldSize(int damagePoints)
    {
        return 10;
    }
}
