package nyc.c4q.alizinha;
/**
 * Created by c4q-Allison on 5/6/15.
 */
public class Enemy extends Character implements Defender
{
    public Enemy(String charName, int healthPoints, Weapon weapon, Room room)
    {
        super(charName, healthPoints, weapon, room);
    }

    @Override
    public int calcShieldSize(int damagePoints)
    {
        return 10;
    }
}

