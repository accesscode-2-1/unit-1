/**
 * Created by c4q-marbella on 5/1/15.
 * Access Code 2-1
 * Marbella Vidals
 */
public abstract class ReedPlayer extends Musician <ReedInstrument> {
    ReedInstrument myReedInstrument;

    public void toggle_reed(){
        myReedInstrument.reed =!myReedInstrument.has_reed();
    }

    public String play_Instrument(){
        if(myReedInstrument.has_reed()){
            return "playing sound";
        }else {
            return null;
        }
    }
}
