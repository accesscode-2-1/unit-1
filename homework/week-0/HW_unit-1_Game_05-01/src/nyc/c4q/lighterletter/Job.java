package nyc.c4q.lighterletter;
import java.lang.*;
import java.lang.Character;

/**
 * Created by c4q-john on 5/1/15.
 */
public class Job extends nyc.c4q.lighterletter.Character implements Action
{


    public Job(String name)
    {
        super(name);
    }

    @Override
    public String attackMessage()
    {
        return "I'll take you down!";
    }

    @Override
    public String defendMessage()
    {
        return "That tickles!";
    }

    @Override
    public String defeatMessage()
    {
        return "Darn it! I lost!";
    }

    @Override
    public String vicoryMessage()
    {
        return "HAAHAHa I win!";
    }

    @Override
    public String introMessage()
    {
        return " I am a reptile zebra watch me roar!";
    }

    @Override
    public int losehealth(int attack)
    {
        return this.baseHealth - attack;
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
