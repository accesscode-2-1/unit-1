package nyc.c4q.anthonyfermin;
/**
 * Created by c4q-anthonyf on 5/1/15.
 */
public class Hero extends Character
{

    public Hero(String name)
    {
        super(name);
        setHealth(100);
        setArmor(0);
        setWeapon(new Weapon("Brass Knuckles", 5, 2));
    }


}
