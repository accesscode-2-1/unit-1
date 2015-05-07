package nyc.c4q.anthonyfermin;
/**
 * Created by c4q-anthonyf on 5/1/15.
 */
public class HealthPotion extends Item
{
    int healthPoints;

    public HealthPotion()
    {
        this((int)((Math.random() * (50 - 35)) + 35)); // sets healthpoints to a random number between 35 and 50
    }

    public HealthPotion(int points)
    {
        setType("Health");
        this.healthPoints = points;
    }

    public int getHealthPoints(){
        return healthPoints;
    }


}
