package nyc.c4q.m47bell;
/**
 * Created by c4q-marbella on 5/5/15.
 * Access Code 2-1
 * Marbella Vidals
 */
public abstract class Character
{

    int lifePoints;

    String name;


    public Character(String name, int lifePoints)
    {
        this.name = name;
        this.lifePoints = lifePoints;
    }

    public int getLifePoints()
    {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints)
    {
        this.lifePoints = lifePoints;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void play()
    {

    }

}






