package nyc.c4q.alizinha;
/**
 * Created by c4q-Allison on 5/6/15.
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

