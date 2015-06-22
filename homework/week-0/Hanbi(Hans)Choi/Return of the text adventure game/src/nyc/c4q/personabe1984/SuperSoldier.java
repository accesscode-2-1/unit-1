package nyc.c4q.personabe1984;
/**
 * Created by Hans on 5/6/15.
 */
public class SuperSoldier extends Enemy
{
    public SuperSoldier(int hitPoints, int lives){
        super(hitPoints, lives);
    }

    public void takeDamage(int damage){
        super.takeDamage(damage/2);

    }
}
