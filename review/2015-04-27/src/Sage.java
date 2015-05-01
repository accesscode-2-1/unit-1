import java.lang.*;

/**
 * Created by c4q-madelyntavarez on 5/1/15.
 */
public class Sage extends Character
{

    public Sage(String name, Knife knife){

    }
    @Override
    int numOfLegs(int legs)
    {
        return legs;
    }

    @Override
    String nameOfChar(String name)
    {
        return name;
    }

    @Override
    boolean canFly()
    {
        return false;
    }

    @Override
    boolean HasWeapon()
    {
        return true;
    }
}
