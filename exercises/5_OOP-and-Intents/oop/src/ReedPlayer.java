/**
 * Access Code 2.1
 * Ramona Harrison
 * ReedPlayer.java
 */

public abstract class ReedPlayer extends Musician {
    ReedInstrument myReedInstrument;

    public ReedPlayer() {

    }

    public ReedPlayer(ReedInstrument reedInstrument) {
        this.myReedInstrument = reedInstrument;
    }

    public void toggleReed() {
        if (this.myReedInstrument.hasReed()) {
            myReedInstrument.removeReed();
        } else {
            myReedInstrument.placeReed();
        }
    }

    @Override
    public String play_instrument() {
        if (!this.myReedInstrument.hasReed()) {
            return null;
        } else {
            return myReedInstrument.play();
        }
    }
}
