package ac0430;
/**
 * Access Code 2.1
 * Ray Acevedo
 * ReedPlayer.java
 */
public abstract class ReedPlayer extends Musician
{
    String name;
    ReedInstrument reedInstrument;

    public ReedPlayer(){}

    public ReedPlayer(String name, ReedInstrument reedInstrument)
    {
        this.name = name;
        this.reedInstrument = reedInstrument;
    }
    public void playInstrument(ReedInstrument reedInstrument)
    {
        if(reedInstrument.hasReed = false)
        {
            System.out.println();
        }
        else
        {
            System.out.println("");
        }
    }

    public void toggleReed (ReedInstrument reedInstrument){
        if (reedInstrument.hasReed = true){
            reedInstrument.hasReed = false;
        }
        if(reedInstrument.hasReed = false){
            reedInstrument.hasReed = true;
        }
    }
    @Override
    public String play_instrument()
    {
        return null;
    }
}
