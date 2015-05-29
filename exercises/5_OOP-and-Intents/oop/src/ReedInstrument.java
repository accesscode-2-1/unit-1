/**
 * Created by shadowslimmedia on 4/30/15.
 */
public abstract class ReedInstrument implements Instrument {
    private boolean reed;

    boolean has_reed() {
        return reed;
    }

    void place_reed() {
        this.reed = true;
    }

    void remove_reed() {
        this.reed = false;
    }
}
