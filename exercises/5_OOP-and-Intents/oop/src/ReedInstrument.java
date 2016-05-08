/**
 * Created by c4q-john on 4/30/15.
 */
public abstract class ReedInstrument implements Instrument
{
    public boolean reed;

    public boolean has_reed (){
        return reed;
    }
    public void place_reed(){
        reed = true;
    }
    public void remove_reed(){
        reed = false;
    }
}


