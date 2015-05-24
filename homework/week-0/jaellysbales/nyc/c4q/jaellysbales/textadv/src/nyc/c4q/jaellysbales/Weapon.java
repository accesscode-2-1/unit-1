package nyc.c4q.jaellysbales;
/**
 * Access Code 2.1
 * Created by Jaellys Bales on 5/4/15.
 * Project: textadv
 */
public class Weapon
{
    // Every weapon has...
    String weaponName;
    int damagePoints;

    public Weapon(String weaponName, int damagePoints)
    {
        this.weaponName = weaponName;
        this.damagePoints = damagePoints;
    }

    public String getWeaponName()
    {
        return weaponName;
    }

    public void setWeaponName(String weaponName)
    {
        this.weaponName = weaponName;
    }

    public int getDamagePoints()
    {
        return damagePoints;
    }

    public void setDamagePoints(int damagePoints)
    {
        this.damagePoints = damagePoints;
    }
}
