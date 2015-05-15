/**
 * Created by amyquispe on 4/30/15.
 */
public abstract class Musician<T extends  Instrument> {
    /* expected behavior: when play_instrument() is called, return a String that represents the instrument's noise */
    public abstract String play_instrument();
}
