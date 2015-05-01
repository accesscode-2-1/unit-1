/**
 * Created by c4q-madelyntavarez on 5/1/15.
 */
public class Knife extends Weapon
{
    @Override
    boolean isDeadly()
    {
        return true;
    }

    @Override
    int numOfTimesWeaponCanBeUsed(int num)
    {
        return num;
    }

    @Override
    String soundWhenOwnerIsDefeated(String sound)
    {
        return sound;
    }
}


