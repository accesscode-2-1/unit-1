/**
 * Created by alvin2 on 4/30/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public abstract class ReedInstrument implements Instrument
{
    boolean reed;


    public boolean hasReed(){
        return this.reed;
    }

    public void place_reed() {
        this.reed = true;
    }

    public void remove_reed() {
        this.reed = false;
    }

}
