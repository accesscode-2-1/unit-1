/**
 * Created by c4q-anthony-mcbride on 4/30/15.
 */
public abstract class ReedPlayer extends Musician
{
    public ReedInstrument instrument;
    public ReedPlayer(ReedInstrument rI){
        instrument = rI;
    }
    public void toggle_reed(){
        if (!instrument.has_reed())
            instrument.place_reed();
        else
            instrument.remove_reed();
    }
    public String play_instrument(){
        if (instrument.has_reed())
            return instrument.play();
        else
            return null;
    }
}
