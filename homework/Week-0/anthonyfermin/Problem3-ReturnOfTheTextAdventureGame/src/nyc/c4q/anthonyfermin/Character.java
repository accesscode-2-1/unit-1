package nyc.c4q.anthonyfermin;
/**
 * Created by c4q-anthonyf on 5/1/15.
 */
public abstract class Character
{
    String  name;
    int     health;
    int     armor;
    Weapon  weapon;
    boolean isAlive;

    public Character(String name)
    {
        this.name = name;
        isAlive = true;
    }

    public abstract void reset();

    public void setHealth(int health){
        this.health = health;
    }

    public void setArmor(int armor){
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void takeDamage(Weapon weapon){
        int damage = weapon.attack();

        if(armor > 0 && damage > armor){
            damage -= armor;
            armor = 0;
            health -= damage;
        }else if(armor > 0 && damage < armor){
            armor -= damage;
        }else
        {
            health -= damage;
        }

        if(health <= 0){
            isAlive = false;
        }
    }

    public int getHealth(){
        return health;
    }

    public int getArmor(){
        return armor;
    }

    public boolean isAlive(){
        return isAlive;
    }

    public String getName(){
        return name;
    }

    public Weapon getWeapon(){
        return weapon;
    }

    public void useItem(Item item){
        if(item.getType().equals("Health")){
            health += ((HealthPotion) item).getHealthPoints();
        }else if(item.getType().equals("Weapon")){
            setWeapon((Weapon) item);
        }else if(item.getType().equals("Armor")){
            setArmor(((Armor) item).getArmorPoints());
        }
    }
}
