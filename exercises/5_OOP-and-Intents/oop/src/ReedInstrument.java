/**
 * Created by elvisboves on 4/30/15.
 */
public abstract class ReedInstrument implements Instrument
{

    boolean reed;

    abstract boolean has_reed ();

    abstract void place_reed ();

    abstract void remove_reed ();

}
