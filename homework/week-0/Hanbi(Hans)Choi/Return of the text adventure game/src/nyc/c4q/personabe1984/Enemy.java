package nyc.c4q.personabe1984;
/**
 * Created by Hans on 5/5/15.
 */
public class Enemy
{

    private int lives;
    private int hitPoints;

    public Enemy(int hitPoints, int lives){
        this.hitPoints = hitPoints;
        this.lives = lives;
    }

    public int getLives()
    {
        return lives;
    }

    public void setLives(int lives)
    {
        this.lives = lives;
    }

    public int getHitPoints()
    {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints)
    {
        this.hitPoints = hitPoints;
    }

    public void takeDamage(int damage){
        int remainingHitPoints = getHitPoints() - damage;
        setHitPoints(remainingHitPoints);
        System.out.println("I took " + damage + " point damage, and have " + remainingHitPoints + "");
    }
}
