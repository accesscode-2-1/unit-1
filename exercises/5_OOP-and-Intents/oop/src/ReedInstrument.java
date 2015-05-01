package ac0430;
import java.util.ArrayList;

/**
 * Access Code 2.1
 * Ray Acevedo
 * ReedInstrument.java
 */
public abstract class ReedInstrument implements Instrument
{
    String name;
    boolean hasReed = true;

    public ReedInstrument(){}

    public ReedInstrument(String name)
    {
        this.name = name;
    }
    public ReedInstrument(String name, boolean hasReed){
        this.name = name;
        this.hasReed = hasReed;
    }
    public void setName (String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setHasReed (boolean hasReed){
        this.hasReed = hasReed;
    }
    public boolean getHasReed (){
        return hasReed;
    }
    @Override
    public String play()
    {
        return null;
    }
    public boolean hasReed (ReedInstrument reedInstrument){
        return (reedInstrument.hasReed);
    }
    public void placeReed (ReedInstrument reedInstrument){
        reedInstrument.hasReed = true;
    }
    public void removeReed (ReedInstrument reedInstrument){
        reedInstrument.hasReed = false;
    }
}