/**
 * Access Code 2.1
 * Created by Jaellys Bales on 4/30/15.
 * Project: oop
 * ReedInstrument.java
 * Enter a description.
 */
public abstract class ReedInstrument implements Instrument
{
    boolean reed;

    public boolean hasReed()
    {
        return false;
    }

    public void placeReed()
    {
        reed = true;
    }

    public void removeReed()
    {
        reed = false;
    }

    @Override
    public String play()
    {
        return null;
    }
}
