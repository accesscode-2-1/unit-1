package src;

import src.Instrument;

/**
 * Created by amyquispe on 4/30/15.
 */

public class Musician {
    /* expected behavior: when play_instrument() is called, return a String that represents the instrument's noise */

    public String play_instrument(Instrument instrument){
        return instrument.play();
    };

}
