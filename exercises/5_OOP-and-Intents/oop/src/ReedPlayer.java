/**
 * Created by Luke Lee on 4/30/15.
 */
public abstract class ReedPlayer extends Musician<ReedInstrument>{

    ReedInstrument myReedInstrument;

    public String play_instrument() {
        if (myReedInstrument.has_reed()) {
            return "I'm playing!";
        }
        return null;
    }

    public void toggle_reed() {
        myReedInstrument.reed = !myReedInstrument.has_reed();
    }
}
