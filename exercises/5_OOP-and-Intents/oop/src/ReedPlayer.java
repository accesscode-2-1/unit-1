/**
 * Created by shadowslimmedia on 4/30/15.
 * Refactor: Create the abstract class ReedPlayer, which extends Musician.
 * Port the functionality of ClarinetPlayer to ReedPlayer,
 * including having the ReedPlayer keep a ReedInstrument field set in the constructor.
 */
public abstract class  ReedPlayer extends Musician {


    ReedInstrument JoJo;

    public ReedPlayer () {

    }

    public ReedPlayer (ReedInstrument x) {
        this.JoJo = x;

    }

    void toggle_reed () {
        if (JoJo.has_reed()) {
            JoJo.remove_reed();
        } else {
            JoJo.place_reed();
        }
    }

}
