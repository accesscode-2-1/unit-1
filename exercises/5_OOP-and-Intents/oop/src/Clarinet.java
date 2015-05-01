package ac0430;
/**
 * Access Code 2.1
 * Ray Acevedo
 * Clarinet.java
 */
public class Clarinet extends ReedInstrument implements Instrument
{
    String name;
    boolean hasReed = true;

    public Clarinet()
    {
    }

    public Clarinet(String name)
    {
        this.name = name;
    }

    public Clarinet(String name, boolean hasReed)
    {
        this.name = name;
        this.hasReed = hasReed;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setHasReed(boolean hasReed)
    {
        this.hasReed = hasReed;
    }

    public boolean getHasReed()
    {
        return hasReed;
    }

    @Override
    public String play()
    {
        return null;
    }

    public boolean hasReed(Clarinet Clarinet)
    {
        return (Clarinet.hasReed);
    }

    public void placeReed(Clarinet Clarinet)
    {
        Clarinet.hasReed = true;
    }

    public void removeReed(Clarinet Clarinet)
    {
        Clarinet.hasReed = false;
    }
}
