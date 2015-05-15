/**
 * Access Code 2.1
 * Ramona Harrison
 * ClarinetPlayer.java
 *
 * Create the concrete class ClarinetPlayer, which extends Musician. The ClarinetPlayer constructor should
 * take in a Clarinet, and save it in a field called myClarinet. Add a method toggle_reed, which puts a reed
 * on the Clarinet if it doesn't have one, and takes the reed off it if does. Implement the play_instrument
 * method such that if the instrument doesn't have a reed on, it returns null, and otherwise plays the
 * instrument sound.
 *
 */

public class ClarinetPlayer extends ReedPlayer {
    Clarinet myClarinet;

    public ClarinetPlayer() {

    }

    public ClarinetPlayer(Clarinet clarinet) {
        this.myClarinet = clarinet;
    }

}
