/**
 * Created by c4q-madelyntavarez on 5/1/15.
 */
public class Staff extends Weapon
{
    @Override
    boolean isDeadly()
    {
        return false;
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
