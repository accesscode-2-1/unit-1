/**
 * Created by fattyduck on 4/30/15.
 */
public abstract class reedInstruments implements Instrument
{
    boolean reed;
    public abstract boolean hasReed();
    public abstract void placeReed();
    public abstract void removeReed();


}
