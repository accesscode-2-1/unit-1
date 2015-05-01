/**
 * Created by c4q-Abass on 4/30/15.
 */
public abstract class ReedInstrument implements Instrument {
    private boolean reed;

    public boolean hasReed(){
    return this.reed;
    }

    public void placeReed() {
        reed = true;
    }

    public void removeReed() {
        this.reed = false;
    }


}
