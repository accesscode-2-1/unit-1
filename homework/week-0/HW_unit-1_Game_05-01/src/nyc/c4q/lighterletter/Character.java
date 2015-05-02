package nyc.c4q.lighterletter;
/**
 * Created by c4q-john on 5/1/15.
 */
public abstract class Character implements Conflict
{
    String name;
    public int baseHealth = 100;
    boolean isAlive;

    public Character(String name)
    {
        this.name = name;
    }

    public int getBaseHealth(){
        return baseHealth;
    }

    public void setHealth(int damage)
    {
        baseHealth = baseHealth - damage;
    }

    public int setBaseHealth(int newHealth){

        return baseHealth - newHealth;
    }

    public boolean isAlive(){
        return isAlive;
    }



}
