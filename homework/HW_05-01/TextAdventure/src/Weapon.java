/**
 * Created by kadeemmaragh on 5/3/15.
 */
public class Weapon extends Item
{
    private  int weaponDamage;
    public Weapon(String name, int price, int damage)
    {
        super(name, price);
        weaponDamage = damage;
    }

    public void setWeaponDamage(int num){
        weaponDamage = num;
    }

    public void increaseWeaponDamage(int num){
        weaponDamage += num;
    }

    public int getWeaponDamage(){
        return weaponDamage;
    }

    @Override
    public String toString()
    {
            return "Item: " + getItemName() + ", Price: " + getItemPrice() + ", Damage: " + getWeaponDamage();
    }

}
