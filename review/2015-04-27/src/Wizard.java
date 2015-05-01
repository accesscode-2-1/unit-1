import java.lang.*;

/**
 * Created by c4q-madelyntavarez on 5/1/15.
 */
public class Wizard extends Character
{
    public Wizard(String name, Staff staff)
    {

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
        return true;
    }

    @Override
    boolean HasWeapon()
    {
        return true;
    }
}
