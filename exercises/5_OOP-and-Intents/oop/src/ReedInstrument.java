package src;

/**
 * Created by c4q-george on 4/30/15.
 */
public abstract class ReedInstrument implements Instrument {
    protected boolean reed=true;

    public boolean hasReed(){
        return reed;
    }
    public void placeReed(){
        this.reed=true;
    }
    public void removeReed(){
        this.reed=false;
    }

}
