/**
 * Created by c4q-marbella on 4/30/15.
 * Access Code 2-1
 * Marbella Vidals
 */
public abstract class ReedInstrument implements Instrument
{
    boolean reed= false;

    public boolean has_reed(){
        return true;
    }

    public boolean place_reed(){
        return false;
    }

    public void remove_reed() {
        reed = false;
    }
}
