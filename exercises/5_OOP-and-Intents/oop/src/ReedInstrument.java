/**
 * Created by c4q-madelyntavarez on 4/30/15.
 */
public abstract class ReedInstrument implements Instrument
{   boolean reed;
    @Override
    public String play()
    {
        String music="LAdidaaaaadaaaddaaaaa";
        return music;
    }

    abstract boolean hasReed();
    abstract void placeReed();
    abstract void removeReed();


}
