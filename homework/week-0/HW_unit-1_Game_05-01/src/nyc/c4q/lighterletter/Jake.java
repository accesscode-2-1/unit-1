package nyc.c4q.lighterletter;
/**
 * Created by c4q-john on 5/1/15.
 */
public class Jake extends Character implements Action
{
    public Jake(String name)
    {
        super(name);
    }

    @Override
    public String attackMessage()
    {
        return "Take this!";
    }

    @Override
    public String defendMessage()
    {
        return "You hit like an amateur!";
    }

    @Override
    public String defeatMessage()
    {
        return "Impossible! Foiled but not soiled!";
    }

    @Override
    public String vicoryMessage()
    {
        return "Victory is mine!";
    }

    @Override
    public String introMessage()
    {
        return "Wholly guacamole you don't think you can beat me do you?";
    }

    @Override
    public int losehealth(int attack)
    {
        return this.baseHealth - attack;
    }

    public int getHealth(){
        return this.baseHealth;
    }

    @Override
    public boolean victory(int health)
    {
        if(health >= 1)
        {
            isAlive = true;

        }  return false;
    }
}
