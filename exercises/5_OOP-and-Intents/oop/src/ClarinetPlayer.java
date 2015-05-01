/**
 * Access Code 2.1
 * Created by Jaellys Bales on 4/30/15.
 * Project: oop
 * ClarinetPlayer.java
 * Enter a description.
 */
public class ClarinetPlayer extends Musician
{
    Clarinet myClarinet;

    public ClarinetPlayer(Clarinet clarinet)
    {
        myClarinet = clarinet;
    }

    public void toggleReed()
    {
        if (myClarinet.hasReed())
        {
            myClarinet.removeReed();
        }
        else
        {
            myClarinet.placeReed();
        }
    }

    @Override
    public String play_instrument()
    {
        if (! myClarinet.hasReed())
        {
            return null;
        }
        return "♫♩♫~~";
    }
}
