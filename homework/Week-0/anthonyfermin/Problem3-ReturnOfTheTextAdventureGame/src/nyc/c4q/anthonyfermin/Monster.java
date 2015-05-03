package nyc.c4q.anthonyfermin;
/**
 * Created by c4q-anthonyf on 5/1/15.
 */
public class Monster extends Character
{

    public Monster(String name)
    {
        super(name);
        setHealth(20);
        setArmor(0);
        setWeapon(new Weapon("Claws", 4, 2));
    }

    @Override
    public void reset()
    {
        setHealth(20);
        setArmor(0);
        setWeapon(new Weapon("Claws", 4, 2));
        isAlive = true;
    }


}
