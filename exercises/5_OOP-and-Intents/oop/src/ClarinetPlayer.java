/**
 * Created by shadowslimmedia on 4/30/15.
 *
 * Create the concrete class ClarinetPlayer, which extends Musician.
 * The ClarinetPlayer constructor should take in a Clarinet, and save it in a field called myClarinet.
 * Add a method toggle_reed, which puts a reed on the
 * Clarinet if it doesn't have one, and takes the reed off it if does.
 *
 *
 * Implement the play_instrument method such that if the instrument doesn't have a reed on,
 * it returns null, and otherwise plays the instrument sound.
 *
 *
 *
 * Now ClarinetPlayer can inherit most of its functionality from ReedPlayer.
 * Remove the redundant functionality but keep the constructor that takes in a Clarinet.
 */
public class ClarinetPlayer extends ReedPlayer {


    private final Clarinet myClarinet;

    @Override
    public String play_instrument() {

        if (myClarinet.has_reed()) {
            return null;
        } else {
            return "hello";
        }

    }

    public ClarinetPlayer (Clarinet x) {
        this.myClarinet = x;

    }

    void toggle_reed () {
        if (myClarinet.has_reed()) {
            myClarinet.remove_reed();
        } else {
            myClarinet.place_reed();
        }
    }


}
